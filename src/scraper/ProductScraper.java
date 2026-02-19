package scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class ProductScraper {

    public static void main(String[] args) {

        String url = "https://books.toscrape.com/"; // Sample e-commerce site

        try {

            Document doc = Jsoup.connect(url).get();

            // Product list select karna
            Elements products = doc.select(".product_pod");

            FileWriter writer = new FileWriter("products.csv");

            // CSV Header
            writer.append("Name,Price,Rating\n");

            for (Element product : products) {

                String name = product.select("h3 a").attr("title");
                String price = product.select(".price_color").text();
                String rating = product.select(".star-rating").attr("class").replace("star-rating ", "");

                writer.append(name + "," + price + "," + rating + "\n");
            }

            writer.close();

            System.out.println("Data successfully saved in CSV file!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
