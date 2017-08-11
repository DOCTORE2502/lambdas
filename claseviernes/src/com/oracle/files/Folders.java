
package com.oracle.files;

import java.io.File;
import java.io.IOException;

public class Folders {
    public static void main(String[] args) throws IOException {
        File Dir = new File("/Users/HP/Desktop/MS769K/TestFile/Electronica");
        Dir.mkdir();
        
        File myDir = new File("/Users/HP/Desktop/MS769K/TestFile/Electronica","Venta 11082017.txt");
        myDir.createNewFile();
    }
}
