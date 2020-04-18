package com.practice.utils;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ViewCSV {

    public static void main(String[] args) throws IOException {
        String inputFile = args[0];
        Integer totalRows = 20;
        if(args.length > 1) {
            totalRows = Integer.valueOf(args[1]);
        }


        System.out.println(inputFile);
        String seperator = ",";
        if(inputFile.endsWith(".csv")){
            seperator = ",";
        }

        Map<Integer, Integer> widthMap = new HashMap<>();

        BufferedReader bf = new BufferedReader(new FileReader(new File(inputFile)));
        String line = "";
        List<List<String>> rows = new ArrayList<>();
        int rowCount = 0;
        while( (line = bf.readLine()) != null && rowCount <= totalRows) {
            List<String> row = Arrays.asList(line.split(seperator));
            rows.add(row);
            for(int i = 0; i < row.size(); i++){
                Integer previousSize = widthMap.get(i);
                if(previousSize == null || previousSize < row.get(i).length()){
                    widthMap.put(i, row.get(i).length());
                }
            }
            rowCount++;
        }


        // show the data
        for(int i = 0; i < rows.size(); i++){
            List<String> row = rows.get(i);
            for(int j = 0; j < row.size(); j++){
                int totalSize = widthMap.get(j);
                if(j == 0) {
                    System.out.print("|");
                }
                System.out.print(row.get(j));
                for(int k = 0; k < totalSize - row.get(j).length() + 2; k ++){
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println();
            for(int j = 0; j < row.size(); j++){
                int totalSize = widthMap.get(j);
                if(j == 0){
                    System.out.print("+");
                }
                for(int k = 0; k < totalSize + 2; k ++){
                    System.out.print("-");
                }
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
