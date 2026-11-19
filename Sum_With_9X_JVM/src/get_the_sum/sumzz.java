/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package get_the_sum;

import java.math.BigInteger;

/**
 *
 * @author acherontas
 */
public class sumzz {
     public int get_the_sum_number=0;
            public BigInteger m;
            public int n;
            public int mn=0;
            public BigInteger cdi=BigInteger.valueOf(mn);
            public int fl;
            public int cto;
public int get_the_sum(String s){
        char l;
        int k;
        get_the_sum_number=0;
        for(int i=0;i<=s.length()-1;i++){
            l=s.charAt(i);
            k=Character.getNumericValue(l);
            get_the_sum_number=get_the_sum_number+k;
        }
        if(get_the_sum_number>9){
           // System.out.println(" initial sum ---> " + get_the_sum_number);
        while(get_the_sum_number>9){
           get_the_sum(Integer.toString(get_the_sum_number));       
        }
        }
    return get_the_sum_number;
} 
    
public BigInteger cd(BigInteger n){
    //cdi=0;
    //m=n%10;
    m=n.mod(BigInteger.valueOf(10));
    //cdi+=m;   
    cdi=cdi.add(m);
    fl=-1;
    cto+=1;
    if(n.divide(BigInteger.valueOf(10))==BigInteger.valueOf(0)){
        fl=1;
               if(fl==1){}
               return cdi;   //return 1;
    }
    else
    {
        cd(n.divide(BigInteger.valueOf(10)));
    }
    B:
    return cdi;
}

    
public BigInteger cdis(BigInteger nn,int dkp){
         cdi=BigInteger.valueOf(0);
         //isdcx=0;
         BigInteger cdl=cd(nn);
         BigInteger klipo;
         BigInteger cdll;
         klipo=cdl;
         if(dkp==1){
         System.out.println("\n");
         System.out.println("Initial sum = " + cdl + "\n");
         klipo=BigInteger.valueOf(0);
         klipo=cdl;
         //isdc[isdcx]=cdl; isdcx+=1;
         System.out.println("\n");
         }
         BigInteger cld=cdl;
         if(cdl.compareTo(BigInteger.valueOf(9))==1){
             if(dkp==1){
             System.out.println("-----------Internal Sum-------\n");
             }
             cdi=BigInteger.valueOf(0);
             while(cdl.compareTo(BigInteger.valueOf(9))==1){
                cdi=BigInteger.valueOf(0);
                cdl=cd(cdl);
                    if(dkp==1){
                        System.out.println("|---> " + cdl + "\n");
                        //isdc[isdcx]=cdl; isdcx+=1;
                    }
             if(cdl.compareTo(BigInteger.valueOf(9))==0){
                 cdll=cdl;
                 if(dkp==1){
                 
                 System.out.println("| --> Exiting with " + cdl );
                 //isdc[isdcx]=cdl; isdcx+=1;
                 System.out.println("-------------End of Sum------------\n");
                 }
               break;
               }
             }
         }
         if(dkp==1){
         System.out.println();
         }
         if(dkp==3){return cdl;}
         return cdl;
        //theloume to arxiko sum alla na tairiazei xD
        //cout<<"internal " << klipo <<" with cdl " << cdl <<"\n";
        //return klipo;
} 
}
