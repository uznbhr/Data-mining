
package deneme;

import static deneme.sınıflandır.map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class weka {
    
        final static Map<String, Integer> map = new HashMap<String, Integer>();

    
    
    
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
    
    
    
    public static void main(String[] args) {
        
        
    }
}
