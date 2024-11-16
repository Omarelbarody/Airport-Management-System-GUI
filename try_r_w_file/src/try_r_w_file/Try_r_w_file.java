/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package try_r_w_file;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class Try_r_w_file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            FileWriter fw = new FileWriter("Name1.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println("mohamed");
            pw.println("ali");
            pw.println("omar");
            pw.println("salah");
            pw.println("hii");  
            pw.close();

              File F = new File("Name1.txt");
              Scanner sc = new Scanner(F);
              
              while(sc.hasNextLine())
              {
                  String Name = sc.nextLine();
                  System.out.println(Name);
              }
              sc.close();
        }
         catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
         } catch (NumberFormatException e) {
            System.err.println("Error parsing the number: " + e.getMessage());
        }
    }   
}
