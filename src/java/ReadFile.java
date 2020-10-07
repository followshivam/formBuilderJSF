
import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GOLDY
 */
public class ReadFile {
    
    public static void main(String[] args) {
     
    String jsonpath = "C:\\Users\\GOLDY\\Documents\\NetBeansProjects\\FormBuilder\\src\\javasaveformfile.json";
    try{
         Gson gson = new Gson();
         Reader reader = Files.newBufferedReader(Paths.get("jsonpath"));
         
    } catch(Exception e) {
    }
    
        
    }
}
