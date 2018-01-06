package com.files;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;

public class CsvToTxt {
	public static void main(String args[]) {
		BufferedReader read;
		try {
			String inputFileLocation = "C:/Users/Vikas/Downloads/Test";
			String inputFileName = "signature text files creation.csv";
			String fileName = inputFileLocation+"/"+inputFileName;
			String outputFolderLoation = "C:/Users/Vikas/Downloads/Test";
			
			
			read = new BufferedReader(new FileReader(fileName));
			String line = "";
			FileWriter file = null;
			BufferedWriter bw = null;
			String headers[] = read.readLine().split(",");
			while((line = read.readLine()) != null){
				String arr[] = line.split(",");
				new File(outputFolderLoation+"/"+arr[130]).mkdir();
				file = new FileWriter(outputFolderLoation+"/"+arr[130]+"/"+arr[130]+".txt");
				bw = new BufferedWriter(file);
				for(int i = 0; i < arr.length; i++){
					bw.write(headers[i]+" = "+arr[i]);
					bw.newLine();
				}
				bw.close();
				byte[] imageByte ;
				File outputFile = new File(outputFolderLoation+"/"+arr[130]+"/"+arr[130]+".png");
				for(int i = 0; i < arr.length; i++){
					if(headers[i].equalsIgnoreCase("Signature_vod__c")){
						imageByte = Base64.getDecoder().decode(arr[i]);
						ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
						BufferedImage image = ImageIO.read(bis);
						bis.close();
						ImageIO.write(image, "png", outputFile);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}