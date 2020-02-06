import java.util.Scanner;

public class NamesTabel {
   
   
    public static void main(String args[]) {
		System.out.println("Podaj ile imion znajduje sie na Twojej liscie");
		Scanner scanner= new Scanner(System.in);
		int a= scanner.nextInt();
		System.out.println( "Lista ma"+ a);
        String[] names = new String[a];
			  
	for (int i=0; i<names.length; i++){
	    
		System.out.println("Podaj imie ktore znajduje sie na " + (i+1)+ " miejscu na Twojej liscie");
		String name= scanner.next();
		names[i]=name;
		System.out.println(names[i]);
	}
	System.out.print("[");
	for (int j=0; j<names.length; j++){
		System.out.print(names[j].toUpperCase().charAt(0)+names[j].substring(1,names[j].length()).toLowerCase() +" ");}
System.out.print("]");
}}