/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package for_looper;

/**
 *
 * @author acherontas
 */
public class frlp {
    public int[] a=new int[10000];
    public int sum_the_remaining;
    char k;
    public int x=0;
    public int nn=9;
    public int nonn;
    public int afairesi;
    public int flp(String s){
        for(int i=0;i<=s.length()-1;i++){
           k=s.charAt(i);
           nonn=Character.getNumericValue(k);
           afairesi=nn-nonn;
           a[x]=afairesi;
           x+=1;
        }   
    return 0;
    }
    
    public int reminder(){
    for(int i=0;i<=x;i++){
    sum_the_remaining=sum_the_remaining+a[i];
    }
    return sum_the_remaining;
    }
    
    public int show_the_table(){
    System.out.println();
        for(int i=0;i<=x-1;i++){System.out.print(a[i]);}
    System.out.println();
    return 0;
    }
}
