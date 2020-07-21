/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricepackage;

import java.util.Scanner;

/**
 *
 * @author kgeor
 */
public class RicePackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //initialize variables
         float kgValue;
         float fourBagC=0;
         float twoBagC =0;
         float oneBagc = 0;
         float rem =0;
        
         Scanner input = new Scanner(System.in); 
        
                  
        System.out.println("Enter Rice Quantity ");
        kgValue = input.nextFloat();
        
        float check = kgValue%1;
        
        //condition to check if the impuy valus is valid
        if(check == 0 ||check ==  0.5){
            
            //assigning the number of bags
            
            /* bags are assigned by checking several conditions
            
            1. Depending on the modules value (0) the number of 4kg bags are assgined.
            2. The 4kg bags ,2kgs and 1 kgs bags are assigned and the decimal values are 
                checked to assign a 1 kg bag
            */
            
            
           if(kgValue%4 == 0){
                fourBagC =  (kgValue/4);
                
            }else if(kgValue%4 != 0){
                fourBagC =  (kgValue/4);
                
                rem =  (kgValue%4);
                
                if(rem %2 ==0){
                    twoBagC = rem/2;
           
                }else if(rem == 0.5){
                    oneBagc++;
                }else {
                    twoBagC = rem/2;
                 
                    rem = rem%2;
                    
                    oneBagc = rem;
                    
                    if(rem == 0.5){
                        oneBagc++;
                    }else if(rem == 1.5){
                         oneBagc++;
                    }
                      
                }
         
            }
           //output the final values
            System.err.println("Bag Quantities:For "+kgValue+" rice "+(int)fourBagC+" Pc of 4kg "+(int)twoBagC+" Pc of 2kg "+(int)oneBagc+" Pc of 1kg ");
            
        }
        else{
            //reject the order if the inout value is invalid
            System.out.println("Order Rejected");
        }
        
        
        
    }
       
            
        
         
            
       
        
       
       
    
    
}
