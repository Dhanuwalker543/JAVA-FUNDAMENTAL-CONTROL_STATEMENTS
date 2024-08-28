
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int a=sc.nextInt();
		if(a>0){
		    System.out.println("POSITIVE");
		}
		else if(a<0){
		    System.out.println("Negative");
		}
		else if(a==0){
		    System.out.println("ZERO");
		}
		else{
		    System.out.println("PLZ ENTER A NUMBER");
		}
		System.out.println("lets print all the number ranges inside the gvn number");
		for(int i=1;i<=a;i++){
		    System.out.println(i);
		}
		System.out.println("lets print it in reverse order");
		for(int i=a;i>=1;i--){
		    System.out.println(i);
		}
		System.out.println("print 1to 3 Integer using do while");
			 int j=1;
            do{
              System.out.println(j);
              j++;
            }while(j<=3);
		System.out.println("let print the week day of the number");
		switch(a){
		    case 1:
		        System.out.println("sunday");
		        break;
		    case 2:
		        System.out.println("MONDAY");
		        break;
		    case 3:
		        System.out.println("tuesday");
		        break;
		    case 4:
		        System.out.println("wednesday");
		        break;
		    case 5:
		        System.out.println("thursday");
		        break;
		    case 6:
		        System.out.println("friday");
		        break;
		    case 7:
                System.out.println("saturday");
                break;
            default:{
                System.out.println("please enter a digit between the range of 1 to 7");
            }
           
		}
	}
}