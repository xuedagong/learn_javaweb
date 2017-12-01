package collection;

import java.util.*;
import java.io.*;

//Java如何将数组转换为集合？
public class Array2Collection {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many elements you want to add to the array: ");
        int n = Integer.parseInt(in.readLine());
        String[] name = new String[n];

        System.out.println("Enter your elements: ");
        for (int i = 0; i < n; i++) {
            name[i] = in.readLine();
        }
        List<String> list = Arrays.asList(name);
        System.out.println();

        for (String li : list) {
            String str = li;
            System.out.print(str + " ");
        }
    }
}