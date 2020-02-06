import java.util.Scanner;

public class TwojaTablica {
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbê która bêdzie iloœci¹ elementów w twojej tabeli");
    int tabelLength=scanner.nextInt();
    System.out.println("Twoja tabela bêdzie mia³a " + tabelLength+" elementów" );
    
    int [] yoursTabel=new int [tabelLength];
    for (int i=0; i<tabelLength;i++)
    {System.out.println("Podaj liczbê która bêdzie na"+ i+"miejscu w tabeli");
    yoursTabel[i]=scanner.nextInt();
//    System.out.println(yoursTabel[i]);
    }
    System.out.println(" ");
System.out.println("tak wygl¹da Twoja tablica");
System.out.print("[");
for (int j=0; j<tabelLength;j++){
     System.out.print(" "+yoursTabel[j]+" ");
}
System.out.print("]");
}
}