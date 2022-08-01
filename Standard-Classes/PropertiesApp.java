import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));
            String host = properties.getProperty("database.host");
            System.out.println(host);

        } catch (FileNotFoundException e) {
            System.out.println("File tidak ketemu");
        } catch (IOException e) {
            System.out.println("File gagal load");
        }

        try {
            Properties properties = new Properties();
            properties.put("name.first", "Novin");
            properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");
        } catch (FileNotFoundException exception) {
            System.out.println("Error membuat file");
        } catch (IOException exception) {
            System.out.println("Error menyimpan");
        }

    }
}