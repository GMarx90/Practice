import java.util.Scanner;

public class TwojaTablica {
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczb� kt�ra b�dzie ilo�ci� element�w w twojej tabeli");
    int tabelLength=scanner.nextInt();
    System.out.println("Twoja tabela b�dzie mia�a " + tabelLength+" element�w" );
    
    int [] yoursTabel=new int [tabelLength];
    for (int i=0; i<tabelLength;i++)
    {System.out.println("Podaj liczb� kt�ra b�dzie na"+ i+"miejscu w tabeli");
    yoursTabel[i]=scanner.nextInt();
//    System.out.println(yoursTabel[i]);
    }
    System.out.println(" ");
System.out.println("tak wygl�da Twoja tablica");
System.out.print("[");
for (int j=0; j<tabelLength;j++){
     System.out.print(" "+yoursTabel[j]+" ");
}
System.out.print("]");
}
}