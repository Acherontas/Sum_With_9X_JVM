/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum_with_9x;

import java.util.Scanner;
import for_looper.frlp;
import get_the_sum.sumzz;
import create_the_9.nine_class;
/**
 *
 * @author acherontas
 */
public class Sum_With_9X {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frlp fr=new frlp();
        sumzz smz=new sumzz();
        nine_class ncl=new nine_class();
        Scanner console=new Scanner(System.in);
        String mynmb=new String();
        System.out.print("Enter a number:\n");
        mynmb=console.nextLine();
        int rmz=smz.get_the_sum(mynmb);
        System.out.println("the number has sum of digits " + rmz);
        fr.flp(mynmb);
        System.out.print("-------The Returning Table------");
        fr.show_the_table();
        System.out.print("--------------------------------");
        int lri=fr.reminder();
        if(lri!=9 && lri>0){
        System.out.println();
        System.out.println("The sum is " +  lri);
        String mmri=ncl.creat_nine(Integer.toString(lri));
        System.out.println("using value of " + mmri);
        int result;
        result=Integer.parseInt(mmri)-lri;
        System.out.println("the result is  " + mmri  + " - " + lri + " = " + result);
        smz.get_the_sum_number=0;
        int mnz=smz.get_the_sum(Integer.toString(result));
        System.out.println(result + " with sum of digits " + mnz);
        if(rmz==mnz){System.out.println("sum matches\n");}
        if(rmz!=mnz){System.out.println("sum not matches\n");}
        }
        System.out.println();
        if(lri==0 && mynmb.charAt(0)=='9'){System.out.println("its 9\n");}
        if(lri==9 && mynmb.charAt(0)=='0'){System.out.println("its 0\n");}
        if(lri==9 && mynmb.charAt(0)!='0'){System.out.println("its 9\n");}
    }    
}   

