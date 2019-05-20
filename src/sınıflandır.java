package deneme;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.zemberek.erisim.Zemberek;
import net.zemberek.tr.yapi.TurkiyeTurkcesi;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class sınıflandır {

    static Zemberek zemberek = new Zemberek(new TurkiyeTurkcesi());
    final static Map<String, Integer> map = new HashMap<String, Integer>();
    static int toplam_kelime_sayisi;

    public static List haberCek() {
        System.out.println("------magazin-----");
        String url24 = "http://www.ahaber.com.tr/magazin";
        String ozet = "";
        int indis = 0;
        List<String> kok_listesi = new ArrayList<>();

        try {

            Document doc24 = Jsoup.connect(url24).get();
            Element newsListElements24 = doc24.getElementsByClass("categoryList").first();
            Elements childElements24 = newsListElements24.getElementsByClass("infoDiv");
            for (int index24 = 0; index24 < childElements24.size(); index24++) {
                Element tempElement24 = childElements24.get(index24);
                Element timeElement24 = tempElement24.getElementsByTag("span").first();
                Elements time24 = timeElement24.getElementsByClass("date");
                Element titleElement24 = tempElement24.getElementsByTag("a").first();
                Element title24 = titleElement24.getElementsByTag("span").first();
                Elements p_etiketi24 = titleElement24.select("p");
                String newsLink24 = titleElement24.getElementsByTag("a").first().attr("href");
                ozet = p_etiketi24.text() + ozet;
                String[] c = ozet.split(" ");
                //kelime kokleri
                for (int i = 0; i < c.length; i++) {
                    String d = c[i];
                    String[] ayrisimlar = zemberek.kokBulucu().stringKokBul(d);
                    for (String strings : ayrisimlar) {
                        // System.out.println(strings.toLowerCase());
                        kok_listesi.add(strings.toLowerCase());
                    }
                }
            }
        } catch (Exception e) {

        }
        return kok_listesi;
    }

    
    public static int dosyadanOku(String path) {
        List<String> list = new ArrayList<>();
        File dosya = new File(path);
        try {
            BufferedReader oku = new BufferedReader(new FileReader(path));
            String satir;
            int sayac = 0;
            satir = oku.readLine();
            while (satir != null) {
                sayac++;
                list.add(satir.trim().toLowerCase());
                satir = oku.readLine();
            }
            oku.close();

        } catch (Exception e) {

        }
        int benzerlik = 0;
        for (int i = 0; i < list.size(); i++) {

            if (map.containsKey(list.get(i))) {
                benzerlik = benzerlik + map.get(list.get(i));
            }

        }
        return benzerlik;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // map.put("yasar", 1);
        List<String> haber_kokler = new ArrayList<>();
        int politika;
        int ekonomi;
        int spor;
        int magazin;
        int din;
        int kultur;
        int tarih;
        int kitap;
        haber_kokler = haberCek();
        toplam_kelime_sayisi = haber_kokler.size();
        for (int i = 0; i < haber_kokler.size(); i++) {
            if (map.containsKey(haber_kokler.get(i))) {
                map.put(haber_kokler.get(i), map.get(haber_kokler.get(i)) + 1);

            } else {
                map.put(haber_kokler.get(i), 1);
            }

        }
        System.out.println(map);
        String path1 = "C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\frekans\\verı\\politikaveri.txt";
        politika = dosyadanOku(path1);
        String path2 = "C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\frekans\\verı\\ekonomiveri.txt";
        ekonomi = dosyadanOku(path2);
        String path3 = "C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\frekans\\verı\\sporveri.txt";
        spor = dosyadanOku(path3);
        String path4 = "C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\frekans\\verı\\magazinveri.txt";
        magazin = dosyadanOku(path4);
        String path5 = "C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\frekans\\verı\\dinveri.txt";
        din = dosyadanOku(path5);
        String path6 = "C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\frekans\\verı\\kulturveri.txt";
        kultur = dosyadanOku(path6);
        String path7 = "C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\frekans\\verı\\tarihveri.txt";
        tarih = dosyadanOku(path7);
        String path8 = "C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\frekans\\verı\\kitapveri.txt";
        kitap = dosyadanOku(path8);
        /////if

        if (ekonomi > kultur && ekonomi > spor && ekonomi > politika && ekonomi > magazin && ekonomi > din && ekonomi > tarih&& ekonomi>kitap) {
            System.out.println("Bu haber Ekonomi haberidir");
        } else if (kultur > ekonomi && kultur > spor && kultur > politika && kultur > magazin && kultur > din && kultur > tarih&& kultur>kitap) {
            System.out.println("Bu haber Kültür haberidir");
        } else if (spor > kultur && spor > ekonomi && spor > politika && spor > magazin && spor > din && spor > tarih&& spor>kitap) {
            System.out.println("Bu haber Spor haberidir");
        } else if (politika > spor && politika > kultur && politika > ekonomi && politika > magazin && politika > din && politika > tarih&& politika>kitap) {
            System.out.println("Bu haber Politika haberidir");
        } else if (magazin > spor && magazin > din && magazin > ekonomi && magazin > politika && magazin > kultur && magazin > tarih&& magazin>kitap) {
            System.out.println("Bu haber Magazin haberidir");
        } else if (din > spor && din > magazin && din > ekonomi && din > politika && din > kultur && din > tarih&& din>kitap) {
            System.out.println("Bu haber Din haberidir");
        } else if (tarih> spor && tarih > magazin && tarih > ekonomi && tarih > politika && tarih > kultur && tarih > din && tarih>kitap) {
            System.out.println("Bu haber Tarih haberidir");
        } else {
            System.out.println("Bu haber Kitap haberidir");
        }
    }
    
}
