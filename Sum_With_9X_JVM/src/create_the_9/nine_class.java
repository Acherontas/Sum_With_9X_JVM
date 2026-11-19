/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package create_the_9;

/**
 *
 * @author acherontas
 */
public class nine_class {
    int number=9;
    public String final_nines=new String();
    public String creat_nine(String lgnt){
        for(int i=0;i<=lgnt.length()-1;i++){
             final_nines+=Integer.toString(number);
        }    
    return final_nines;
    }
}
