package deneme;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.LinkedBlockingQueue;

public class wordcount {

    public void politika(String kelime,int frekans) {
        try {
            String filename = "politikatfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(kelime+","+frekans);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void ekonomi(String kelime,int frekans) {
        try {
            String filename = "ekonomitfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
             fw.write(kelime+","+frekans);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void spor(String kelime,int frekans) {
        try {
            String filename = "sportfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
             fw.write(kelime+","+frekans);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void magazin(String kelime,int frekans) {
        try {
            String filename = "magazintfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
              fw.write(kelime+","+frekans);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void din(String kelime,int frekans) {
        try {
            String filename = "dintfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
              fw.write(kelime+","+frekans);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void tarih(String kelime,int frekans) {
        try {
            String filename = "tarihtfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
              fw.write(kelime+","+frekans);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void kultur(String kelime,int frekans) {
        try {
            String filename = "kulturtfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
               fw.write(kelime+","+frekans);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void egitim(String kelime,int frekans) {
        try {
            String filename = "egitimtfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
              fw.write(kelime+","+frekans);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void kitap(String kelime,int frekans) {
        try {
            String filename = "kitaptfidf.txt";
            FileWriter fw = new FileWriter(filename, true);
             fw.write(kelime+","+frekans);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        wordcount yaz=new wordcount();
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

        File tfidf8 = new File("egitimtfidf.txt");
        if (!tfidf8.exists()) {
            tfidf8.createNewFile();
        }

        File tfidf9 = new File("kitaptfidf.txt");
        if (!tfidf9.exists()) {
            tfidf9.createNewFile();
        }
        
        ArrayList ar = new ArrayList();
        File file = new File("C:\\Users\\Elif BOYACI\\Documents\\NetBeansProjects\\deneme\\kitap.txt");
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        String satir = reader.readLine();

        while (satir != null) {
            StringTokenizer st = new StringTokenizer(satir);
            while (st.hasMoreTokens()) {
                ar.add(st.nextToken());
            }
            satir = reader.readLine();
        }
        int s = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = 0; j < ar.size(); j++) {
                if (ar.get(i).equals(ar.get(j))) {
                    s++;
                }
            }
            if (!h.containsKey(ar.get(i))) {
                h.put(ar.get(i).toString(), s);
            }
            s = 0;
        }
        Set set = h.entrySet();
        Iterator i = set.iterator();
        int frekans;
        
        /*  int a=(int) me.getValue();
           if(a>=4)
            System.out.println(me.getKey() + ": "+a);
      */
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
      String kelime  =(String) me.getKey();
           int a=(int) me.getValue();
           if(a>=8)
       yaz.kitap(kelime, a);
        }
        
        
    }
}
