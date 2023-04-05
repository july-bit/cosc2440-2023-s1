package edu.vn.rmit.W05.problem1;

import java.io.*;
import java.util.Scanner;

public class fileReader {
    public static void main(String[] args) throws IOException {
        readFile();
    }
    static Scanner sc = new Scanner(System.in);
    static void readFile() throws IOException {
        boolean isContinue;
            System.out.println("Enter the text file name:");
            String fileName = sc.nextLine();
            String line;
            File file = new File(fileName);
            BufferedReader breader = new BufferedReader(new FileReader(file));
            if (file.exists()) {
                while ((line = breader.readLine()) != null ) {
                    System.out.println(line);
                    System.out.println();
                    System.out.println("Continue (Enter) or Exit (X, then Enter)?\n ");
                    isContinue = sc.nextLine().equals("X");
                    if (isContinue) {
                        break;
                    }
                }
                breader.close();
                sc.close();
            }
        }
}
