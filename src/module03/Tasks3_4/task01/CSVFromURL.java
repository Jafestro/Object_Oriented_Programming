package module03.Tasks3_4.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class CSVFromURL {
    public static void main(String[] args) {
        URL url;

        try {
            url = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        }
        catch (MalformedURLException e){
            throw new RuntimeException();
        }

        try {
            InputStream inputStream = url.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            double sum = 0;
            int numCount = 0;

            while((line = bufferedReader.readLine()) != null){
                line = bufferedReader.readLine();
                String[] list = line.split(";"); // 01.01.2023 00:00;5,0;21,4;25,0;25,5;30,0;21,8;22,1;3,7;44,0;52,1;47,0;18,3;56,1;15,3;59,0;3,9;10,0;21,2;23,7;24,0
                if(Arrays.asList(list[0].split(" ")).contains("01.01.2023")) { // ["01.01.2023 00:0...", "5,0", "21,4", "25,0", "25,5", +16 more]
                    String rawNum = list[1].replace(',', '.'); // 5,0 -> 5.0
                    double num = Double.parseDouble(rawNum);
                    sum += num;
                    numCount++;
                } else if (Arrays.asList(list[0].split(" ")).contains("02.01.2023")) {
                    break;
                }
            }
            double roundedAverage = Math.round((sum/numCount) * 100.0) / 100.0;
            System.out.println("Average temperature for 1st of January 2023 is " + roundedAverage + " degrees in Celsius");
            bufferedReader.close();
        }catch (IOException e){
            throw new RuntimeException();
        }
    }
}
