package xyz.iridiumion.enlightened.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Author: 0xFireball
 */
public class FileReaderUtil {
    public static String readAllText(String filePath) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            br.close();
            return sb.toString();
        } catch (Exception e) {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e2) {
                    throw e2;
                }
            }

            throw e;
        }
    }
}