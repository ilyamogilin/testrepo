package com.mogilin;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        File input = new File("input.html");
        Document doc = Jsoup.parse(input, "UTF-8", "http://google.com/");

        Element content = doc.getElementById("content");
        Elements links = content.getElementsByTag("a");
        
        for (Element link : links) {
            String linkHref = link.attr("href");
            String linkText = link.text();
            System.out.println(linkHref + " " + linkText);
        }

    }
}
