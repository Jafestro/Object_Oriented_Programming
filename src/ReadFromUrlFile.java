import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadFromUrlFile {
    public static void main(String[] args) {
        String site = "https://users.metropolia.fi/~jafarj/urlTest/Hello.txt";
        URL url;
        try {
            url = new URL(site);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        try{
            InputStream inputStream = url.openStream();

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = bufferedReader.readLine()) != null) {
                response.append(line);
                response.append("\n");
            }
            bufferedReader.close();
            System.out.println(response);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
