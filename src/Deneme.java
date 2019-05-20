package deneme;
//////////////////verileri çek zembrek ile köklerine ayır,dosyaya kaydet

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.zemberek.erisim.Zemberek;
import net.zemberek.tr.yapi.TurkiyeTurkcesi;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Deneme {

    public void politika(String s1) {
        try {
            String filename = "politika.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s1);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void ekonomi(String s1) {
        try {
            String filename = "ekonomi.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s1);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void spor(String s1) {
        try {
            String filename = "spor.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s1);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void magazin(String s1) {
        try {
            String filename = "magazin.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s1);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void din(String s1) {
        try {
            String filename = "din.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s1);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void tarih(String s1) {
        try {
            String filename = "tarih.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s1);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void kultur(String s1) {
        try {
            String filename = "kultur.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s1);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void kitap(String s1) {
        try {
            String filename = "kitap.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s1);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void zemberek(String ozet, String baslik) {
        Deneme yeni = new Deneme();
        Zemberek zemberek = new Zemberek(new TurkiyeTurkcesi());
        String[] c = ozet.split(" ");
        for (int i = 0; i < c.length; i++) {
            String d = c[i];
            String[] ayrisimlar = zemberek.kokBulucu().stringKokBul(d);
            for (String strings : ayrisimlar) {

                if (strings.equals("ben") || strings.equals("sen")
                        || strings.equals("o") || strings.equals("biz")
                        || strings.equals("siz") || strings.equals("onlar")
                        || strings.equals("kendi") || strings.equals("bu") || strings.equals("şu")
                        || strings.equals("bunlar") || strings.equals("şunlar") || strings.equals("onlar")
                        || strings.equals("herkes") || strings.equals("hepsi") || strings.equals("bazısı")
                        || strings.equals("kimse") || strings.equals("çoğu") || strings.equals("kimisi")
                        || strings.equals("biri") || strings.equals("birkaçı") || strings.equals("birçoğu")
                        || strings.equals("birazı") || strings.equals("kim") || strings.equals("kimi")
                        || strings.equals("kime") || strings.equals("nereden") || strings.equals("nereye")
                        || strings.equals("hangi") || strings.equals("kaç") || strings.equals("mı")
                        || strings.equals("mi") || strings.equals("mü") || strings.equals("yok") || strings.equals("ne")
                        || strings.equals("mısın") || strings.equals("misin") || strings.equals("ha")
                        || strings.equals("he") || strings.equals("ile")
                        || strings.equals("aha") || strings.equals("ahacık")
                        || strings.equals("başka") || strings.equals("beli")
                        || strings.equals("beri") || strings.equals("bilfarz")
                        || strings.equals("değin") || strings.equals("dek") || strings.equals("denli")
                        || strings.equals("derece") || strings.equals("doğru") || strings.equals("evet")
                        || strings.equals("gibi") || strings.equals("ha") || strings.equals("hayır")
                        || strings.equals("he") || strings.equals("için") || strings.equals("ila")
                        || strings.equals("kadar") || strings.equals("işte") || strings.equals("kelli")
                        || strings.equals("mesela") || strings.equals("oldu") || strings.equals("olur")
                        || strings.equals("örneğin") || strings.equals("peki") || strings.equals("tamam")
                        || strings.equals("temsil") || strings.equals("üzere") || strings.equals("üzre")
                        || strings.equals("ya") || strings.equals("yok") || strings.equals("ama")
                        || strings.equals("amma") || strings.equals("velakin") || strings.equals("ancak")
                        || strings.equals("belki") || strings.equals("bile") || strings.equals("bre")
                        || strings.equals("çünkü") || strings.equals("de") || strings.equals("da")
                        || strings.equals("dahi") || strings.equals("eğer") || strings.equals("fakat")
                        || strings.equals("gelgelelim") || strings.equals("gerek")
                        || strings.equals("hâlbuki") || strings.equals("hatta")
                        || strings.equals("hele") || strings.equals("hem")
                        || strings.equals("ille") || strings.equals("ile")
                        || strings.equals("ister") || strings.equals("ki")
                        || strings.equals("lakin")
                        || strings.equals("madem") || strings.equals("mademki")
                        || strings.equals("meğer") || strings.equals("ne")
                        || strings.equals("oysa") || strings.equals("oysaki")
                        || strings.equals("şayet") || strings.equals("ve")
                        || strings.equals("velev") || strings.equals("veya")
                        || strings.equals("yahut") || strings.equals("yalnız")
                        || strings.equals("ya") || strings.equals("yani")
                        || strings.equals("yok") || strings.equals("yoksa")
                        || strings.equals("zira") || strings.equals("veyahut") || strings.equals("yahut")) {
                } else {
                    if (baslik == "politika") {
                        yeni.politika(strings);
                    } else if (baslik == "ekonomi") {
                        yeni.ekonomi(strings);
                    } else if (baslik == "spor") {
                        yeni.spor(strings);
                    } else if (baslik == "magazin") {
                        yeni.magazin(strings);
                    } else if (baslik == "din") {
                        yeni.din(strings);
                    } else if (baslik == "tarih") {
                        yeni.tarih(strings);
                    } else if (baslik == "kultur") {
                        yeni.kultur(strings);
                    } else if (baslik == "kitap") {
                        yeni.kitap(strings);
                    }
                }
            }
        }
    }

    public void sondakika(String url, String baslik) {
        Deneme yeni = new Deneme();
        try {

            Document doc1 = Jsoup.connect(url).get();
            Element newsListElements1 = doc1.getElementsByClass("newsList").first();
            Elements childElements1 = newsListElements1.getElementsByTag("li");

            for (int index1 = 1; index1 < childElements1.size(); index1++) {

                Element tempElement1 = childElements1.get(index1);
                Element timeElement1 = tempElement1.getElementsByClass("time").first();
                Element titleElement1 = tempElement1.getElementsByTag("h3").first();
                Elements p_etiketi1 = tempElement1.select("p");
                String newsLink1 = titleElement1.getElementsByTag("a").first().attr("href");
                String a = p_etiketi1.text();
                yeni.zemberek(a, baslik);

                System.out.println("SonDakika Başlık :" + titleElement1.text());
                System.out.println("SonDakika Özet :" + p_etiketi1.text());
                System.out.println("SonDakika Zaman :" + timeElement1.text());
                System.out.println("SonDakika Link :" + newsLink1);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }
    }

    public void haber7(String url, String baslik) {
        Deneme yeni = new Deneme();

        try {
            Document document5 = Jsoup.connect(url).get(); //sondakika guncel kategori 
            Element newsListElements5 = document5.getElementsByClass("news-list").first();
            Elements childElements5 = newsListElements5.getElementsByTag("li");

            for (int index5 = 0; index5 < childElements5.size(); index5++) {

                Element tempElement5 = childElements5.get(index5);
                Element timeElement5 = tempElement5.getElementsByClass("time").first();
                Element titleElement5 = tempElement5.getElementsByTag("li").first();//haberin başlığı
                Element hbrElement5 = tempElement5.getElementsByClass("content").first();
                Element p_etiketi5 = hbrElement5.getElementsByClass("summary").first();
                String newsLink5 = titleElement5.getElementsByTag("a").first().attr("href");
                String a = p_etiketi5.text();
                yeni.zemberek(a, baslik);

                System.out.println("Haber7 Başlık :" + p_etiketi5.text());
                System.out.println("Haber7 Zaman :" + timeElement5.text());
                System.out.println("Haber7 Özet :" + titleElement5.text());
                System.out.println("Haber7 Link :" + newsLink5);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }
    }

    public void sabah(String url, String baslik) {
        Deneme yeni = new Deneme();

        try {
            Document doc9 = Jsoup.connect(url).get();
            Element newsListElements9 = doc9.getElementsByClass("timeline").first();
            Elements childElements9 = newsListElements9.getElementsByTag("li");

            for (int index9 = 0; index9 < childElements9.size(); index9++) {

                Element tempElement9 = childElements9.get(index9);
                Element timeElement9 = tempElement9.getElementsByClass("postInfo").first();
                Element titleElement9 = tempElement9.getElementsByClass("postWall").first();
                Elements p_etiketi9 = tempElement9.select("p");
                String newsLink9 = titleElement9.getElementsByTag("a").first().attr("href");
                String a = p_etiketi9.text();
                yeni.zemberek(a, baslik);
                System.out.println("Sabah Baslık :" + titleElement9.text());
                System.out.println("Sabah Zaman :" + timeElement9.text());
                System.out.println("Sabah Özet : " + p_etiketi9.text());
                System.out.println("Sabah Link : " + "http://www.sabah.com.tr" + newsLink9);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }
    }

    public void ensonhaber(String url, String baslik) {
        Deneme yeni = new Deneme();

        try {
            Document doc13 = Jsoup.connect(url).get();
            Element newsListElements13 = doc13.getElementsByClass("ui-list").first();
            Elements childElements13 = newsListElements13.getElementsByTag("li");

            for (int index13 = 0; index13 < childElements13.size(); index13++) {

                Element tempElement13 = childElements13.get(index13);
                Element absElement13 = tempElement13.getElementsByClass("spot").first();
                Element timeElement13 = tempElement13.getElementsByClass("date").first();
                Element titleElement13 = tempElement13.getElementsByTag("a").first();
                String newsLink13 = titleElement13.getElementsByTag("a").first().attr("href");
                String a = absElement13.text();
                yeni.zemberek(a, baslik);

                System.out.println("EnSonHaber Baslık:" + titleElement13.text());
                System.out.println("EnSonHaber Zaman :" + timeElement13.text());
                System.out.println("EnSonHaber Özet : " + absElement13.text());
                System.out.println("EnSonHaber Link  : " + newsLink13);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }
    }

    public static void main(String[] args) throws IOException {
        Deneme haberler = new Deneme();
        String baslik;
        File file = new File("politika.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        File file1 = new File("ekonomi.txt");
        if (!file1.exists()) {
            file1.createNewFile();
        }
        File file2 = new File("spor.txt");
        if (!file2.exists()) {
            file2.createNewFile();
        }
        File file3 = new File("magazin.txt");
        if (!file3.exists()) {
            file3.createNewFile();
        }

        File file8 = new File("din.txt");
        if (!file8.exists()) {
            file8.createNewFile();
        }
        File file9 = new File("tarih.txt");
        if (!file9.exists()) {
            file9.createNewFile();
        }

        File file12 = new File("kultur.txt");
        if (!file12.exists()) {
            file12.createNewFile();
        }

        

        File file17 = new File("kitap.txt");
        if (!file17.exists()) {
            file17.createNewFile();
        }
        /////////////////////////////////////////////
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&---SONDAKİKA---&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println();

        System.out.println("-----------------------POLİTİKA------------------------------");
        System.out.println();
        String url1 = "http://sondakika.haberler.com/";
        baslik = "politika";
        haberler.sondakika(url1, baslik);

        System.out.println("----------------------------------EKONOMİ--------------------------");
        System.out.println();
        String url2 = "http://sondakika.haberler.com/ekonomi/";
        baslik = "ekonomi";
        haberler.sondakika(url2, baslik);

        System.out.println("------------------------SPOR--------------------------");
        System.out.println();
        String url3 = "http://sondakika.haberler.com/spor/";
        baslik = "spor";
        haberler.sondakika(url3, baslik);

        System.out.println("----------------------MAGAZİN------------------------");
        System.out.println();
        String url4 = "http://sondakika.haberler.com/magazin/";
        baslik = "magazin";
        haberler.sondakika(url4, baslik);

        //////////////////////////////////////////////////////////////////////////////////
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&---HABER7---&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println();

        System.out.println("--------------------POLİTİKA---------------");
        System.out.println();
        baslik = "politika";
        String url5 = "http://www.haber7.com/guncel";
        haberler.haber7(url5, baslik);

        System.out.println("-------------------------EKONOMİ--------------------");
        System.out.println();
        /////////////////////türkiye ekonomisi//////////////////////

        String url6 = "http://ekonomi.haber7.com/turkiye-ekonomisi/p4";
        baslik = "ekonomi";
        try {
            Document document6 = Jsoup.connect(url6).get(); //sondakika guncel kategori 
            Element newsListElements6 = document6.getElementsByClass("news-list").first();
            Elements childElements6 = newsListElements6.getElementsByTag("li");

            for (int index6 = 0; index6 < childElements6.size(); index6++) {

                Element tempElement6 = childElements6.get(index6);
                Element timeElement6 = tempElement6.getElementsByClass("time").first();
                Element titleElement6 = tempElement6.getElementsByClass("title").first();//haberin başlığı
                Element hbrElement6 = tempElement6.getElementsByTag("li").first();
                Element p_etiketi6 = tempElement6.getElementsByClass("summary").first();
                String newsLink6 = hbrElement6.getElementsByTag("a").first().attr("href");
                String a = p_etiketi6.text();
                haberler.zemberek(a, baslik);

                System.out.println("Haber7 Baslık :" + titleElement6.text());
                System.out.println("Haber7 Zaman :" + timeElement6.text());
                System.out.println("Haber7 Özet : " + p_etiketi6.text());
                System.out.println("Haber7 Link : " + newsLink6);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }
        ////////////////////////////////////dünya ekonomisi/////////////////////
        String url66 = " http://ekonomi.haber7.com/dunya-ekonomisi/p4";
        baslik = "ekonomi";
        try {
            Document document66 = Jsoup.connect(url66).get(); //sondakika guncel kategori 
            Element newsListElements66 = document66.getElementsByClass("news-list").first();
            Elements childElements66 = newsListElements66.getElementsByTag("li");

            for (int index66 = 0; index66 < childElements66.size(); index66++) {

                Element tempElement66 = childElements66.get(index66);
                Element timeElement66 = tempElement66.getElementsByClass("time").first();
                Element titleElement66 = tempElement66.getElementsByClass("title").first();//haberin başlığı
                Element hbrElement66 = tempElement66.getElementsByTag("li").first();
                Element p_etiketi66 = tempElement66.getElementsByClass("summary").first();
                String newsLink66 = hbrElement66.getElementsByTag("a").first().attr("href");
                String a = p_etiketi66.text();
                haberler.zemberek(a, baslik);

                System.out.println("Haber7 Baslık :" + titleElement66.text());
                System.out.println("Haber7 Zaman :" + timeElement66.text());
                System.out.println("Haber7 Özet : " + p_etiketi66.text());
                System.out.println("Haber7 Link : " + newsLink66);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }

        System.out.println("-------------------------SPOR-----------------------");
        System.out.println();
        ///////////futbol///////////////////////////
        String url7 = "http://spor.haber7.com/futbol/p2";
        baslik = "spor";
        try {
            Document document7 = Jsoup.connect(url7).get(); //sondakika guncel kategori 
            Element newsListElements7 = document7.getElementsByClass("row").first();
            Elements childElements7 = newsListElements7.getElementsByTag("li");

            for (int index7 = 0; index7 < childElements7.size(); index7++) {

                Element tempElement7 = childElements7.get(index7);
                Element timeElement7 = tempElement7.getElementsByClass("time").first();
                Element titleElement7 = tempElement7.getElementsByTag("li").first();//haberin başlığı
                Element hbrElement7 = tempElement7.getElementsByClass("content").first();
                Element p_etiketi7 = hbrElement7.getElementsByClass("title").first();
                String newsLink7 = titleElement7.getElementsByTag("a").first().attr("href");
                String a = p_etiketi7.text();
                haberler.zemberek(a, baslik);

                System.out.println("Haber7 Baslık :" + titleElement7.text());
                System.out.println("Haber7 Zaman :" + timeElement7.text());
                System.out.println("Haber7 Özet : " + p_etiketi7.text());
                System.out.println("Haber7 Link : " + newsLink7);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }
        ////////////////////////////////basketbol///////////////////////////
        String url77 = "http://spor.haber7.com/basketbol/p3";
        baslik = "spor";
        try {
            Document document77 = Jsoup.connect(url77).get(); //sondakika guncel kategori 
            Element newsListElements77 = document77.getElementsByClass("row").first();
            Elements childElements77 = newsListElements77.getElementsByTag("li");

            for (int index77 = 0; index77 < childElements77.size(); index77++) {

                Element tempElement77 = childElements77.get(index77);
                Element timeElement77 = tempElement77.getElementsByClass("time").first();
                Element titleElement77 = tempElement77.getElementsByTag("li").first();//haberin başlığı
                Element hbrElement77 = tempElement77.getElementsByClass("content").first();
                Element p_etiketi77 = hbrElement77.getElementsByClass("title").first();
                String newsLink77 = titleElement77.getElementsByTag("a").first().attr("href");
                String a = p_etiketi77.text();
                haberler.zemberek(a, baslik);

                System.out.println("Haber7 Baslık :" + titleElement77.text());
                System.out.println("Haber7 Zaman :" + timeElement77.text());
                System.out.println("Haber7 Özet : " + p_etiketi77.text());
                System.out.println("Haber7 Link : " + newsLink77);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }
        ///////////////////////////////voleybol/////////////////////////////////
        String url777 = "http://spor.haber7.com/voleybol/p3";
        baslik = "spor";
        try {
            Document document777 = Jsoup.connect(url777).get(); //sondakika guncel kategori 
            Element newsListElements777 = document777.getElementsByClass("row").first();
            Elements childElements777 = newsListElements777.getElementsByTag("li");

            for (int index777 = 0; index777 < childElements777.size(); index777++) {

                Element tempElement777 = childElements777.get(index777);
                Element timeElement777 = tempElement777.getElementsByClass("time").first();
                Element titleElement777 = tempElement777.getElementsByTag("li").first();//haberin başlığı
                Element hbrElement777 = tempElement777.getElementsByClass("content").first();
                Element p_etiketi777 = hbrElement777.getElementsByClass("title").first();
                String newsLink777 = titleElement777.getElementsByTag("a").first().attr("href");
                String a = p_etiketi777.text();
                haberler.zemberek(a, baslik);
                System.out.println("Haber7 Baslık :" + titleElement777.text());
                System.out.println("Haber7 Zaman :" + timeElement777.text());
                System.out.println("Haber7 Özet : " + p_etiketi777.text());
                System.out.println("Haber7 Link : " + newsLink777);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }

        System.out.println("-------------------------MAGAZİN------------------------");
        System.out.println();
        String url8 = "http://www.haber7.com/medya";
        baslik = "magazin";
        haberler.haber7(url8, baslik);

        System.out.println("-------------------------KÜLTÜR------------------------");
        System.out.println();
        String url12 = "http://www.haber7.com/kultur";
        baslik = "kultur";
        haberler.haber7(url12, baslik);

        System.out.println("-------------------------SAĞLIK------------------------");
        System.out.println();
        String url13 = "http://www.haber7.com/saglik";
        baslik = "saglik";
        haberler.haber7(url13, baslik);


        System.out.println("-------------------------KİTAP------------------------");
        System.out.println();
        String url18 = "http://www.haber7.com/kitap";
        baslik = "kitap";
        haberler.haber7(url18, baslik);

        //////////////////////////////////////////////////////////////////////////////////////  
     /*   System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&---SABAH---&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println();

        System.out.println("--------------------POLİTİKA---------------");
        System.out.println();
        String url19 = "http://www.sabah.com.tr/son-dakika-haberleri/gundem";
        baslik = "politika";
        haberler.sabah(url19, baslik);

        System.out.println("-------------------------EKONOMİ--------------------");
        System.out.println();
        String url20 = "http://www.sabah.com.tr/son-dakika-haberleri/ekonomi";
        baslik = "ekonomi";
        haberler.sabah(url20, baslik);

        System.out.println("-------------------------SPOR-----------------------");
        System.out.println();
        String url21 = "http://www.sabah.com.tr/son-dakika-haberleri/spor-haberleri";
        baslik = "spor";
        haberler.sabah(url21, baslik);

        System.out.println("-------------------------MAGAZİN------------------------");
        System.out.println();
        String url22 = "http://www.sabah.com.tr/son-dakika-haberleri/yasam";
        baslik = "magazin";
        haberler.sabah(url22, baslik);
*/
        ////////////////////////////////////////////////////////////////////
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&---ENSONHABER---&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println();

        System.out.println("--------------------POLİTİKA---------------------------------------------");
        System.out.println();
        String url24 = "http://www.ensonhaber.com/son-dakika";
        baslik = "politika";
        haberler.ensonhaber(url24, baslik);

        System.out.println("-------------------------EKONOMİ--------------------");
        System.out.println();
        String url25 = "http://www.ensonhaber.com/kategori/ekonomi";
        baslik = "ekonomi";
        haberler.ensonhaber(url25, baslik);

        System.out.println("-------------------------SPOR-----------------------");
        System.out.println();
        String url26 = "http://www.ensonhaber.com/son-dakika";
        baslik = "spor";
        haberler.ensonhaber(url26, baslik);

        System.out.println("-------------------------MAGAZİN-----------------------");
        System.out.println();
        String url27 = "http://www.ensonhaber.com/kategori/medya";
        baslik = "magazin";
        haberler.ensonhaber(url27, baslik);

        ////////////////////////////////////////////////////////////////////////////
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&---AHABER---&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println();

        System.out.println("--------------------POLİTİKA---------------");
        System.out.println();
        String url32 = "http://www.ahaber.com.tr/gundem";
        baslik = "politika";
        try {

            Document doc17 = Jsoup.connect(url32).get();
            Element newsListElements17 = doc17.getElementsByClass("categoryList").first();
            Elements childElements17 = newsListElements17.getElementsByClass("catBox  Gundem");

            for (int index17 = 0; index17 < childElements17.size(); index17++) {

                Element tempElement17 = childElements17.get(index17);
                Element absElement17 = tempElement17.getElementsByClass("infoDiv").first();
                Element timeElement17 = tempElement17.getElementsByClass("date").first();
                Element titleElement17 = absElement17.getElementsByClass("heading").first();
                String newsLink17 = absElement17.getElementsByTag("a").first().attr("href");
                String a = absElement17.text();
                haberler.zemberek(a, baslik);

                System.out.println("AHaber Baslık:" + titleElement17.text());
                System.out.println("AHaber Zaman :" + timeElement17.text());
                System.out.println("AHaber Özet : " + absElement17.text());
                System.out.println("AHaber Link : " + newsLink17);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }

        System.out.println("-------------------------EKONOMİ--------------------");
        System.out.println();
        String url33 = "http://www.ahaber.com.tr/ekonomi";
        baslik = "magazin";
        try {

            Document doc17 = Jsoup.connect(url33).get();
            Element newsListElements17 = doc17.getElementsByClass("categoryList").first();
            Elements childElements17 = newsListElements17.getElementsByClass("catBox  Ekonomi");

            for (int index17 = 0; index17 < childElements17.size(); index17++) {

                Element tempElement17 = childElements17.get(index17);
                Element absElement17 = tempElement17.getElementsByClass("infoDiv").first();
                Element timeElement17 = tempElement17.getElementsByClass("date").first();
                Element titleElement17 = absElement17.getElementsByClass("heading").first();
                String newsLink17 = absElement17.getElementsByTag("a").first().attr("href");
                String a = absElement17.text();
                haberler.zemberek(a, baslik);

                System.out.println("AHaber Baslık:" + titleElement17.text());
                System.out.println("AHaber Zaman :" + timeElement17.text());
                System.out.println("AHaber Özet : " + absElement17.text());
                System.out.println("AHaber Link : " + newsLink17);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }

        System.out.println("-------------------------SPOR-----------------------");
        System.out.println();
        String url34 = "http://www.ahaber.com.tr/spor";
        baslik = "spor";
        try {

            Document doc17 = Jsoup.connect(url34).get();
            Element newsListElements17 = doc17.getElementsByClass("categoryList").first();
            Elements childElements17 = newsListElements17.getElementsByClass("catBox  Spor");

            for (int index17 = 0; index17 < childElements17.size(); index17++) {

                Element tempElement17 = childElements17.get(index17);
                Element absElement17 = tempElement17.getElementsByClass("infoDiv").first();
                Element timeElement17 = tempElement17.getElementsByClass("date").first();
                Element titleElement17 = absElement17.getElementsByClass("heading").first();
                String newsLink17 = absElement17.getElementsByTag("a").first().attr("href");
                String a = absElement17.text();
                haberler.zemberek(a, baslik);

                System.out.println("AHaber Baslık:" + titleElement17.text());
                System.out.println("AHaber Zaman :" + timeElement17.text());
                System.out.println("AHaber Özet : " + absElement17.text());
                System.out.println("AHaber Link : " + newsLink17);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }

        System.out.println("-------------------------MAGAZİN------------------------");
        System.out.println();
        String url35 = "http://www.ahaber.com.tr/magazin";
        baslik = "magazin";
        try {

            Document doc17 = Jsoup.connect(url35).get();
            Element newsListElements17 = doc17.getElementsByClass("categoryList").first();
            Elements childElements17 = newsListElements17.getElementsByClass("catBox  Magazin");

            for (int index17 = 0; index17 < childElements17.size(); index17++) {

                Element tempElement17 = childElements17.get(index17);
                Element absElement17 = tempElement17.getElementsByClass("infoDiv").first();
                Element timeElement17 = tempElement17.getElementsByClass("date").first();
                Element titleElement17 = absElement17.getElementsByClass("heading").first();
                String newsLink17 = absElement17.getElementsByTag("a").first().attr("href");
                String a = absElement17.text();
                haberler.zemberek(a, baslik);

                System.out.println("AHaber Baslık: " + titleElement17.text());
                System.out.println("AHaber Zaman : " + timeElement17.text());
                System.out.println("AHaber Özet : " + absElement17.text());
                System.out.println("AHaber Link : " + newsLink17);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }

        System.out.println("-------------------------DİN-----------------------");
        System.out.println();
        String url37 = "http://www.ahaber.com.tr/din";
        baslik = "din";
        try {
            Document doc17 = Jsoup.connect(url37).get();
            Element newsListElements17 = doc17.getElementsByClass("categoryList").first();
            Elements childElements17 = newsListElements17.getElementsByClass("catBox  Din");

            for (int index17 = 0; index17 < childElements17.size(); index17++) {

                Element tempElement17 = childElements17.get(index17);
                Element absElement17 = tempElement17.getElementsByClass("infoDiv").first();
                Element timeElement17 = tempElement17.getElementsByClass("date").first();
                Element titleElement17 = absElement17.getElementsByClass("heading").first();
                String newsLink17 = absElement17.getElementsByTag("a").first().attr("href");
                String a = absElement17.text();
                haberler.zemberek(a, baslik);

                System.out.println("AHaber Baslık:" + titleElement17.text());
                System.out.println("AHaber Zaman : " + timeElement17.text());
                System.out.println("AHaber Özet : " + absElement17.text());
                System.out.println("AHaber Link : " + newsLink17);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }

        System.out.println("-------------------------TARİH-----------------------");
        System.out.println();
        String url40 = "http://www.ahaber.com.tr/tarih";
        baslik = "tarih";
        try {
            Document doc17 = Jsoup.connect(url40).get();
            Element newsListElements17 = doc17.getElementsByClass("categoryList").first();
            Elements childElements17 = newsListElements17.getElementsByClass("catBox  Tarih");

            for (int index17 = 0; index17 < childElements17.size(); index17++) {

                Element tempElement17 = childElements17.get(index17);
                Element absElement17 = tempElement17.getElementsByClass("infoDiv").first();
                Element timeElement17 = tempElement17.getElementsByClass("date").first();
                Element titleElement17 = absElement17.getElementsByClass("heading").first();
                String newsLink17 = absElement17.getElementsByTag("a").first().attr("href");
                String a = absElement17.text();
                haberler.zemberek(a, baslik);

                System.out.println("AHaber Baslık:" + titleElement17.text());
                System.out.println("AHaber Zaman : " + timeElement17.text());
                System.out.println("AHaber Özet : " + absElement17.text());
                System.out.println("AHaber Link : " + newsLink17);
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("IOException in Job: " + e);
        }

    }

}
