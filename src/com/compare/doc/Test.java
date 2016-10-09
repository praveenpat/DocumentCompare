package com.compare.doc;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import au.com.bytecode.opencsv.CSVReader;

public class Test {

	
	 public static void main(String[] args) throws Exception {
		
		 URL csvUrl = new URL("https://mbsdisclosure.fanniemae.com/PoolTalk2/securities.csv?cusip=31362TDF7&pooltrustno=070302");
		
		 InputStream openStream = csvUrl.openStream();
		 
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(openStream));
		 
		 
		 CSVReader reader = new CSVReader(br);
		 
		 System.out.println();

		reader.readAll().forEach(ele ->System.out.println( Arrays.asList(ele).get(0)));
		
		
		 
	}
	 
	 
	

}


