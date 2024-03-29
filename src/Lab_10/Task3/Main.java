package Lab_10.Task3;

import Lab_10.Task3.Model.TitleNews;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static String filePath = "Programming_Git/src/Lab_10/example_files/htmlParser.txt";
    public static void main(String[] args) {

        String title;
        String publicDate;
        String url = "http://fat123.urfu.ru/index.html";
        int maxTries = 3;
        int tryCount = 0;
        List<TitleNews> listNewsTitle = new ArrayList<>();
        Document doc = null;

        try {
            // Get HTML - code from page
            while (tryCount < maxTries) {
                try {
                    doc = Jsoup.connect(url).get();
                    break;
                } catch (IOException e){
                    tryCount++;
                    if (tryCount == maxTries){
                        System.out.println("Ошибка при подключение к URL: " + url);
                        System.exit(0);
                    } else {
                        Thread.sleep(5000);
                        System.out.println("Повторное покдлючение... №" + tryCount);
                    }
                }
            }


            // Extract list news
            Elements newsParent = doc.select(
                    "body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");

//             Output console last 10 news
            for (int i = 3; i < 20; i++){
                if (!(i%2 == 0)){
                    List<Node> nodes = newsParent.get(0).childNodes();
                    title = ((Element) nodes.get(i)).getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0).toString();
                    publicDate = ((Element) nodes.get(i)).getElementsByClass("blockdate")
                            .get(0).childNodes().get(0).toString();
                    TitleNews tItleNews = new TitleNews(title, publicDate);
                    listNewsTitle.add(tItleNews);
                }
            }
            writeData(listNewsTitle);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void writeData(List<TitleNews> titleNewsList) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(filePath), "UTF8"));
        } catch (Exception e){
            e.printStackTrace();
        }
        for (TitleNews news : titleNewsList ){
            try {
                bw.write("Заголовок: " + news.getTitle() + ", Дата публикации: " + news.getPublicDate());
                bw.newLine();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        bw.flush();
        bw.close();
    }

}
