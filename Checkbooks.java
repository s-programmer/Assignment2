/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkbooks;
import java.util.Scanner;
public class Checkbooks {
  
    public static void main(String[] args) {
    int number=1;
    String book1;
    String book2;
    String book3;
    
       Scanner inputed=new Scanner(System.in);
    for(int x=0; x<=number; x++){
        System.out.println("Enter the number you wish to check");
         number=inputed.nextInt();
    if(number<=3){
   if(number==1){
   System.out.println("Enter the name of book 1");
   Scanner input=new Scanner (System.in);
   book1=input.nextLine();
   System.out.println("The book is "+book1);
   break;
   }
   else if(number ==2){
   System.out.println("Enter the name of book 1");
   Scanner input=new Scanner (System.in);
   book1=input.nextLine();
   System.out.println("Enter the name of book 2");
   Scanner inputs=new Scanner (System.in);
           book2=inputs.nextLine();
           System.out.println("Book one is \n"+book1+ " \n Book two is \n"+book2 );
           break;
   }
   else if(number==3){
   System.out.println("Enter the name of book 1");
   Scanner input=new Scanner (System.in);
   book1=input.nextLine();
   System.out.println("Enter the name of book 2");
   Scanner inputs=new Scanner (System.in);
   book2=input.nextLine();
   System.out.println("Enter the name of book 3");
   Scanner inputa=new Scanner (System.in);
   book3=input.nextLine();
   System.out.println(" Book one is \n "+book1+" \n Book two is \n"+book2+" \n Book three is \n"+book3);
   break;
   }}
   else{
   System.out.println("You are not allowed to check books");
   
   }
    
    
    
    }
    }
    
}
