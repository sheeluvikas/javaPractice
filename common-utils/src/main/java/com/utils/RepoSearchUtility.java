package com.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepoSearchUtility {

    public static void main(String[] args) {

        // read the csv file
        // put it in map as key

        HashMap scriptsMap = new HashMap();
        HashMap<String, List<String>> outMap = new HashMap();

        try {
            BufferedReader read = new BufferedReader(new FileReader("/Users/vikas/GitRepo/JavaPractice/javaPractice/common-utils/src/main/resources/scriptsName.csv"));
            String value = null;
            while((value = read.readLine()) != null){
                scriptsMap.put(value, null);
                outMap.put(value, new ArrayList<>());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        String mainDirPath = "/Users/vikas/app/temp";
        File mainDir = new File(mainDirPath);

        if(mainDir.exists() && mainDir.isDirectory()){
            File files[] = mainDir.listFiles();

            RecursivePrint(files,0, scriptsMap, mainDir.getName(), 0, outMap);

            System.out.println(outMap);

        }

        // go to each directory, get the file name,
        // compare it with the key, if its there, then add that against the repo name ( In hashmap), and value as list of repos.
    }

    static void RecursivePrint(File[] arr,int index,HashMap scriptsMap, String mainDir, int level, HashMap<String, List<String>> outMap)
    {
        // terminate condition
        if(index == arr.length)
            return;

        // for files
        if(arr[index].isFile() && scriptsMap.containsKey(arr[index].getName())) {
            List<String> list = outMap.get(arr[index].getName());
            list.add(mainDir);
            outMap.put(arr[index].getName(), list);
        }

            // for sub-directories
        else if(arr[index].isDirectory() && !arr[index].getName().equalsIgnoreCase("target"))
        {
            // recursion for sub-directories
            if(level == 0){
                mainDir = arr[index].getName();
            }
            RecursivePrint(arr[index].listFiles(), 0, scriptsMap, mainDir, level + 1, outMap);
        }
        else if(arr[index].getName().equalsIgnoreCase("target")){
            System.out.println("Ignoring target directory");
        }

        // recursion for main directory
        RecursivePrint(arr,++index, scriptsMap, mainDir, level, outMap);
    }
}
