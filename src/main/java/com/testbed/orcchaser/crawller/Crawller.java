package com.testbed.orcchaser.crawller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Crawller {

    private final String ocrUrl = "";

    public void check() {

        try {
            Document doc = Jsoup.connect(ocrUrl).get();

            Elements elements = doc.select(".menuCategory").select("li");
            for(Element e : elements){
                System.out.println(e.text());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Crawller crawller = new Crawller();

        crawller.check();
    }

}
