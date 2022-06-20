package com.company.Assesment;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\Administrator\\OneDrive\\Documents\\text.docx");
        System.out.println("Present : "+f.exists());
        System.out.println("Can Read : "+f.canRead());
        System.out.println("Can Write : "+f.canWrite());
        String fileName = f.getName();
        int ind = fileName.lastIndexOf(".");
        String str = fileName.substring(ind+1);
        System.out.println("File type : "+str);
        System.out.println("File length : "+f.length());
        File f1 = new File("C:\\Users\\Administrator\\text1.docx");
        if(f1.exists() == false){
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileReader fr = new FileReader(f);
        FileWriter fw = new FileWriter(f1);
        int c;
        /*while((c = fr.read()) != -1){
            fw.write(c);
        }*/
        System.out.println("Copied");
        fr.close();
        fw.close();
    }
}
