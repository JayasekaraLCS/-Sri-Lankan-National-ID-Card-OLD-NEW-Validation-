
package lab08_idcard;
import java.util.Scanner;


public class Lab08_idcard {

    
    public static void main(String[] args) {
        Scanner  Sc = new Scanner (System.in);
        
        String id;
        System.out.print ("Enter your ID card number --> ");
        id = Sc.next();
        
        // 200000300671--12  580722040V--10
        
        boolean check01 = true;
        //boolean check02 = true;
        
        
        if(id.length()==10 && id.endsWith("V")){ // validation for old id card number
            
            for(int x=0; x<=id.length()-2;x++){
                char l = id.charAt(x);
                if(!Character.isDigit(l)){
                    check01 = false;
                    //System.out.println("You've entered invalid id card number..!!");
                    break;
                }
            }
        }
        
        else if(id.length()==12){
            
            for(int y=0; y<=id.length()-1;y++){
                char l = id.charAt(y);
                if(!Character.isDigit(l)){
                    check01 = false;
                    //System.out.println("You've entered invalid id card number..!!");
                    break;
                }
            }
            
        }
        
        else{
            
            check01=false;
        }
        
        if( check01 == true && id.length()==10){
            System.out.println("Valid \"OLD\" id number entered..!!");
            
            //580722040V
            
            //calculate the year
            
            String yep;
            yep = id.substring(0,2);
            int year = Integer.parseInt(yep)+1900;
            
            //calculate the month and date
            
            String mop;
            mop = id.substring(2,5);
            int MOP = Integer.parseInt(mop);
            int month,date;
            String gender;
            
            if(MOP>500){
                month = ((MOP-500)/30)+1;
                date =  (MOP-500)%30;
                gender = "Female";
            }
            else{
                month = (MOP/30)+1;
                date = MOP%30;
                gender = "Male";
            }
            
            System.out.println("\n--personal details--\n");
            System.out.println("Date of birth --> "+year+"/"+month+"/"+date+"\nGender --> "+gender);
            
            
            
           
        }
        else if(check01 == true && id.length()==12){
            System.out.println("Valid \"NEW\" id number entered..!!");
            
            //200000300671
            
            //calculate the year
            
            String yep;
            yep = id.substring(0,4);
            int year = Integer.parseInt(yep);
            
            //calculate the month and date
            
            String mop;
            mop = id.substring(4,7);
            int MOP = Integer.parseInt(mop);
            int month,date;
            String gender;
            
            if(MOP>500){
                month = ((MOP-500)/30)+1;
                date =  (MOP-500)%30;
                gender = "Female";
            }
            else{
                month = (MOP/30)+1;
                date = MOP%30;
                gender = "Male";
            }
            
            System.out.println("\n--personal details--\n");
            System.out.println("Date of birth --> "+year+"/"+month+"/"+date+"\nGender --> "+gender);
            
            
        }
        else{
            
            System.out.println("Invalid id number entered..check again..!!");
        }
        
          
        
    }
    
}
