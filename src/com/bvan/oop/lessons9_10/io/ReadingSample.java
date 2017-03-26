package com.bvan.oop.lessons9_10.io;

import java.io.*;

/**
 * @author bvanchuhov
 */
public class ReadingSample {

    public static void main(String[] args) {
        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(
                                     "files/hello.txt"
                             )
                     )
        ) {

            String s = reader.readLine();

            System.out.println(s);

        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file not found: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
