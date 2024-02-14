package module03.Tasks3_4.task02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class FibonacciCSV {
    private final static String FILENAME = "fibo.csv";
    private final static String DIRECTORY = "src/module03/Tasks3_4/task02";
    public static void main(String[] args) {
        try {
            File file = new File(new File(DIRECTORY), FILENAME);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            BigInteger[] fiboSeries = generateFibonacci(100);
            for (BigInteger fiboSery : fiboSeries) {
                writer.write(String.valueOf(fiboSery));
                writer.newLine();
            }
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static BigInteger[] generateFibonacci(int n){
        BigInteger first = BigInteger.ZERO,second = BigInteger.ONE,next = BigInteger.ONE;
        BigInteger[] fiboArr = new BigInteger[n];
        if (n > 0) {
            if (n == 1)
                fiboArr[0] = BigInteger.valueOf(0);
            if (n >= 2) {
                fiboArr[0] = BigInteger.valueOf(0);
                fiboArr[1] = BigInteger.valueOf(1);
            }
            if (n > 2)
            {
                for (int i = 2; i < n; i++){
                    next = first.add(second);
                    first = second;
                    second = next;

                    fiboArr[i] = next;
                }
            }
        }
        return fiboArr;
    }
}
