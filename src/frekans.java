package deneme;
///////////dosyadan kelimelri frekanslarını bul frekans ve kelimeyi yeni dosyaya yaz

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class frekans {

    public double tf(List<String> doc, String term) {
        double result = 0;
        for (String word : doc) {
            if (term.equalsIgnoreCase(word)) {
                result++;
            }
        }
        return result / doc.size();
    }

    public double idf(List<List<String>> docs, String term) {
        double n = 0;
        for (List<String> doc : docs) {
            for (String word : doc) {
                if (term.equalsIgnoreCase(word)) {
                    n++;
                    break;
                }
            }
        }
        return Math.log(docs.size() / n);
    }

    public void politika(String s1, String kelime) {
        try {
            String filename = "politikatfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
            if (!"0.0".equals(s1)) {
                fw.write(s1 + "," + kelime + ",politika");
                fw.write("\n");
                fw.close();
            }
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void ekonomi(String s1, String kelime) {
        try {
            String filename = "ekonomitfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
            if (!"0.0".equals(s1)) {
                fw.write(s1 + "," + kelime + ",ekonomi");
                fw.write("\n");
                fw.close();
            }

        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void spor(String s1, String kelime) {
        try {
            String filename = "sportfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
            if (!"0.0".equals(s1)) {
                fw.write(s1 + "," + kelime + ",spor");
                fw.write("\n");
                fw.close();
            }
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void magazin(String s1, String kelime) {
        try {
            String filename = "magazintfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
            if (!"0.0".equals(s1)) {
                fw.write(s1 + "," + kelime + ",magazin");
                fw.write("\n");
                fw.close();
            }
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void din(String s1, String kelime) {
        try {
            String filename = "dintfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
            if (!"0.0".equals(s1)) {
                fw.write(s1 + "," + kelime + ",din");
                fw.write("\n");
                fw.close();
            }
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void tarih(String s1, String kelime) {
        try {
            String filename = "tarihtfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
            if (!"0.0".equals(s1)) {
                fw.write(s1 + "," + kelime + ",tarih");
                fw.write("\n");
                fw.close();
            }
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void kultur(String s1, String kelime) {
        try {
            String filename = "kulturtfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
            if (!"0.0".equals(s1)) {
                fw.write(s1 + "," + kelime + ",kultur");
                fw.write("\n");
                fw.close();
            }
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    

    public void kitap(String s1, String kelime) {
        try {
            String filename = "kitaptfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
            if (!"0.0".equals(s1)) {
                fw.write(s1 + "," + kelime + ",kitap");
                fw.write("\n");
                fw.close();
            }
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public double tfIdf(List<String> doc, List<List<String>> docs, String term) {
        return (double) tf(doc, term) * idf(docs, term);
    }

    public static void main(String[] args) throws IOException {

        File tfidf1 = new File("politikatfidf.txt");
        if (!tfidf1.exists()) {
            tfidf1.createNewFile();
        }
        File tfidf2 = new File("ekonomitfidf.txt");
        if (!tfidf2.exists()) {
            tfidf2.createNewFile();
        }
        File tfidf3 = new File("sportfidf.txt");
        if (!tfidf3.exists()) {
            tfidf3.createNewFile();
        }
        File tfidf4 = new File("magazintfidf.txt");
        if (!tfidf4.exists()) {
            tfidf4.createNewFile();
        }

        File tfidf5 = new File("dintfidf.txt");
        if (!tfidf5.exists()) {
            tfidf5.createNewFile();
        }
        File tfidf6 = new File("tarihtfidf.txt");
        if (!tfidf6.exists()) {
            tfidf6.createNewFile();
        }

        File tfidf7 = new File("kulturtfidf.txt");
        if (!tfidf7.exists()) {
            tfidf7.createNewFile();
        }

      
        File tfidf9 = new File("kitaptfidf.txt");
        if (!tfidf9.exists()) {
            tfidf9.createNewFile();
        }

        List<String> doc1 = new ArrayList<>();
        List<String> doc2 = new ArrayList<>();
        List<String> doc3 = new ArrayList<>();
        List<String> doc4 = new ArrayList<>();
        List<String> doc5 = new ArrayList<>();
        List<String> doc6 = new ArrayList<>();
        List<String> doc7 = new ArrayList<>();
        List<String> doc8 = new ArrayList<>();
      
        List<List<String>> documents = new ArrayList<>();

        File file1 = new File("C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\deneme\\politika.txt");
        BufferedReader reader1 = null;
        reader1 = new BufferedReader(new FileReader(file1));
        String satir1 = reader1.readLine();
        while (satir1 != null) {
            doc1.add(satir1);
            satir1 = reader1.readLine();
            documents.add(doc1);

        }
        File file2 = new File("C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\deneme\\ekonomi.txt");
        BufferedReader reader2 = null;
        reader2 = new BufferedReader(new FileReader(file2));
        String satir2 = reader2.readLine();
        while (satir2 != null) {
            doc2.add(satir2);
            satir2 = reader2.readLine();
            documents.add(doc2);

        }
        File file3 = new File("C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\deneme\\spor.txt");
        BufferedReader reader3 = null;
        reader3 = new BufferedReader(new FileReader(file3));
        String satir3 = reader3.readLine();
        while (satir3 != null) {
            doc3.add(satir3);
            satir3 = reader3.readLine();
            documents.add(doc3);

        }
        File file4 = new File("C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\deneme\\magazin.txt");
        BufferedReader reader4 = null;
        reader4 = new BufferedReader(new FileReader(file4));
        String satir4 = reader4.readLine();
        while (satir4 != null) {
            doc4.add(satir4);
            satir4 = reader4.readLine();
            documents.add(doc4);

        }
        File file5 = new File("C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\deneme\\din.txt");
        BufferedReader reader5 = null;
        reader5 = new BufferedReader(new FileReader(file5));
        String satir5 = reader5.readLine();
        while (satir5 != null) {
            doc5.add(satir5);
            satir5 = reader5.readLine();
            documents.add(doc5);

        }
        File file6 = new File("C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\deneme\\tarih.txt");
        BufferedReader reader6 = null;
        reader6 = new BufferedReader(new FileReader(file6));
        String satir6 = reader6.readLine();
        while (satir6 != null) {
            doc6.add(satir6);
            satir6 = reader6.readLine();
            documents.add(doc6);

        }
        File file7 = new File("C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\deneme\\kultur.txt");
        BufferedReader reader7 = null;
        reader7 = new BufferedReader(new FileReader(file7));
        String satir7 = reader7.readLine();
        while (satir7 != null) {
            doc7.add(satir7);
            satir7 = reader7.readLine();
            documents.add(doc7);
        }
       
        File file8 = new File("C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\deneme\\kitap.txt");
        BufferedReader reader9 = null;
        reader9 = new BufferedReader(new FileReader(file8));
        String satir9 = reader9.readLine();
        while (satir9 != null) {
            doc8.add(satir9);
            satir9 = reader9.readLine();
            documents.add(doc8);
        }
        documents = Arrays.asList(doc1, doc2, doc3, doc4, doc5, doc6, doc7, doc8);
        frekans calculator = new frekans();
        System.out.println(documents.size());
        System.out.println(doc1.size() + "--" + doc2.size() + "--" + doc3.size() + "--" + doc4.size() + "--" + doc5.size() + "--" + doc6.size() + "--" + doc7.size() + "--" + doc8.size() );

        try {
            System.out.println("---------POLİTİKA KATEGORİSİ------------------------");
            for (int i = 0; i < documents.get(0).size(); i++) {
                double tfidf = calculator.tfIdf(doc1, documents, documents.get(0).get(i));
                String frekans = Double.toString(tfidf);
                String kelime = documents.get(0).get(i);
                calculator.politika(frekans, kelime);
//  System.out.println(frekans+ " "+documents.get(0).get(i));

            }
            System.out.println("----------EKONOMİ KATEGORİSİ-----------------------");
            for (int i = 0; i < documents.get(1).size(); i++) {
                double tfidf = calculator.tfIdf(doc2, documents, documents.get(1).get(i));
                String frekans = Double.toString(tfidf);
                String kelime = documents.get(1).get(i);
                calculator.ekonomi(frekans, kelime);
// System.out.println(tfidf);

            }
            System.out.println("-----------SPOR KATEGORİSİ----------------------");
            for (int i = 0; i < documents.get(2).size(); i++) {
                double tfidf = calculator.tfIdf(doc3, documents, documents.get(2).get(i));
                String frekans = Double.toString(tfidf);
                String kelime = documents.get(2).get(i);
                calculator.spor(frekans, kelime);
// System.out.println(tfidf);

            }
            System.out.println("-------------MAGAZİN KATEGORİSİ--------------------");
            for (int i = 0; i < documents.get(3).size(); i++) {
                double tfidf = calculator.tfIdf(doc4, documents, documents.get(3).get(i));
                String frekans = Double.toString(tfidf);
                String kelime = documents.get(3).get(i);
                calculator.magazin(frekans, kelime);
// System.out.println(tfidf);

            }
            System.out.println("----------------DİN KATEGORİSİ-----------------");
            for (int i = 0; i < documents.get(4).size(); i++) {
                double tfidf = calculator.tfIdf(doc5, documents, documents.get(4).get(i));
                String frekans = Double.toString(tfidf);
                String kelime = documents.get(4).get(i);
                calculator.din(frekans, kelime);
// System.out.println(tfidf);

            }
            System.out.println("----------------TARİH KATEGORİSİ-----------------");
            for (int i = 0; i < documents.get(5).size(); i++) {
                double tfidf = calculator.tfIdf(doc6, documents, documents.get(5).get(i));
                String frekans = Double.toString(tfidf);
                String kelime = documents.get(5).get(i);
                calculator.tarih(frekans, kelime);
// System.out.println(tfidf);

            }
     
            System.out.println("----------------KÜLTÜR KATEGORİSİ-----------------");
            for (int i = 0; i < documents.get(6).size(); i++) {
                double tfidf = calculator.tfIdf(doc7, documents, documents.get(6).get(i));
                String frekans = Double.toString(tfidf);
                String kelime = documents.get(6).get(i);
                calculator.kultur(frekans, kelime);
//   System.out.println(tfidf);

            }
            System.out.println("---------------KİTAP KATEGORİSİ------------------");
            for (int i = 0; i < documents.get(7).size(); i++) {
                double tfidf = calculator.tfIdf(doc8, documents, documents.get(7).get(i));
                String frekans = Double.toString(tfidf);
                String kelime = documents.get(7).get(i);
                calculator.kitap(frekans, kelime);
// System.out.println(tfidf);

            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
