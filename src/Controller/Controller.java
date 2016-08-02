package Controller;

import Model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller {
    private static Controller instance = null;
    private final static String url = "https://www.ris.bka.gv.at/GeltendeFassung.wxe?Abfrage=Bundesnormen&Gesetzesnummer=10001597";

    protected Controller() {
        Document document = createDocument();
        ArrayList<Paragraph> paragraphs = new ArrayList<Paragraph>();
        for (Article article : document.getItems()) {
            for (Text text : article.getItems()) {
                if (text.getClass().getName().equals("Model.Section")) {
                    ArrayList<Paragraph> sectionParagraphs = ((Section)text).getItems();
                    for (Paragraph paragraph : sectionParagraphs) {
                        paragraphs.add(paragraph);
                    }
                }
                else if (text.getClass().getName().equals("Model.Paragraph")) {
                    paragraphs.add((Paragraph)text);
                }
            }
        }
        paragraphs.remove(paragraphs.size() - 1);
        Search.getInstance().setParagraphs(paragraphs);
    }

    private static Document createDocument() {
        ArrayList<String> html = Downloader.downloadHTML(url);
        return Parser.parseHTML(html);
    }

    public static Controller getInstance() {
        if (instance == null)
            instance = new Controller();
        return instance;
    }

    public ArrayList<String> Browse(String paragraphNumber) {
        ArrayList<String> html = new ArrayList<String>();
        if (paragraphNumber == "") {
            ArrayList<Paragraph> paragraphs = Search.getInstance().getParagraphs();
            for (Paragraph paragraph : paragraphs) {
                    html.add("<h3>" + "§" + paragraph.getNumber() + ". " + paragraph.getName() +  "</h3>");
                    if(paragraph.getText() != null) {
                        html.add("<p>" + paragraph.getText() + "</p>");
                    }
                    if(paragraph.getItems() != null) {
                        ArrayList<Text> texts = paragraph.getItems();
                        for (Text text : paragraph.getItems()) {
                            if (text.getClass().getName().equals("Model.Indent")) {
                                html.add("<h4>" + ((Indent)text).getNumber() + ". " + "</h4>");
                                html.add("<p>" + ((Indent)text).getText() + "</p>");
                                if (((Indent)text).getItems() != null) {
                                    ArrayList<Digit> digits = ((Indent) text).getItems();
                                    for (Digit digit : ((Indent) text).getItems()) {
                                        html.add("<h5>" + "Z. " + digit.getNumber() + ". " + "</h5>");
                                        html.add("<p>" + digit.getText() + "</p>");
                                    }
                                }
                            }
                            else if (text.getClass().getName().equals("Model.Digit")) {
                                html.add("<h5>" + "Z. " + ((Digit)text).getNumber() + ". " + "</h5>");
                                html.add("<p>" + ((Digit)text).getText() + "</p>");
                            }
                        }
                    }
            }
            return html;
        }
        else {
            ArrayList<Paragraph> paragraphs = Search.getInstance().getParagraphs();
            for (Paragraph paragraph : paragraphs) {
                if (paragraph.getNumber().equals(paragraphNumber)) {
                    html.add("<h3>" + "§" + paragraph.getNumber() + ". " + paragraph.getName() +  "</h3>");
                    if(paragraph.getText() != null) {
                        html.add("<p>" + paragraph.getText() + "</p>");
                    }
                    if(paragraph.getItems() != null) {
                        ArrayList<Text> texts = paragraph.getItems();
                        for (Text text : paragraph.getItems()) {
                            if (text.getClass().getName().equals("Model.Indent")) {
                                html.add("<h4>" + ((Indent)text).getNumber() + ". " + "</h4>");
                                html.add("<p>" + ((Indent)text).getText() + "</p>");
                                if (((Indent)text).getItems() != null) {
                                    ArrayList<Digit> digits = ((Indent) text).getItems();
                                    for (Digit digit : ((Indent) text).getItems()) {
                                        html.add("<h5>" + "Z. " + digit.getNumber() + ". " + "</h5>");
                                        html.add("<p>" + digit.getText() + "</p>");
                                    }
                                }
                            }
                            else if (text.getClass().getName().equals("Model.Digit")) {
                                html.add("<h5>" + "Z. " + ((Digit)text).getNumber() + ". " + "</h5>");
                                html.add("<p>" + ((Digit)text).getText() + "</p>");
                            }
                        }
                    }
                    return html;
                }
            }
        }
        return null;
    }

    public ArrayList<String> Search(String query, int start, int end) {
        ArrayList<String> html = new ArrayList<String>();
        SearchResult searchResult = Search.getInstance().search(query);
        if (start != 0 && end != 0) {
            ArrayList<Paragraph> toRemove = new ArrayList<Paragraph>();
            for (Paragraph paragraph : searchResult.getParagraphs()) {
                try {
                    if (Integer.parseInt(paragraph.getNumber()) < start || Integer.parseInt(paragraph.getNumber()) > end)
                        toRemove.add(paragraph);
                }
                catch (Exception e) {}
            }
            for (Paragraph paragraph : toRemove) {
                searchResult.getParagraphs().remove(paragraph);
            }
        }
        html.add("<table style=\"width:35%\">");
        html.add("<tr>");
        html.add("<th align=\"left\">Number</th>");
        html.add("<th align=\"left\">Text</th>");
        html.add("<th align=\"left\">View</th>");
        html.add("</tr>");
        if (!searchResult.getParagraphs().isEmpty()) {
            for (Paragraph paragraph : searchResult.getParagraphs()) {
                html.add("<tr>");
                html.add("<td>" + paragraph.getNumber() + "</td>");
                html.add("<td>" + paragraph.getName() + "</td>");
                html.add("<td>" + "<a href=\"BrowseServlet?paragraph=" + paragraph.getNumber() + "\">Open</a>" + "</td>");
                html.add("</tr>");
            }
        }
        else {
            html.add("<tr>");
            html.add("<td>" + "-" + "</td>");
            html.add("<td>" + "-" + "</td>");
            html.add("<td>" + "-" + "</td>");
            html.add("</tr>");
        }
        return html;
    }
}