import java.util.Scanner;  
import java.util.ArrayList;

public class Menu {

    
    public static void main(String[] args){ 
        
        
        Scanner sc = new Scanner(System.in);
        Funciones fn = new Funciones();

        System.out.println("Ingrese un numero binario de 8 bits positivo");
        System.out.println("Ingresara numero por numero, sea cuidadoso");
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese el digito " + i);
            int num1 = sc.nextInt();
            fn.getNum().add(num1);

        }
        System.out.println("En magnitud y signo: ");
        System.out.println(fn.magnitudSigno());
        String n1 = fn.ceroauno();

        System.out.println("En complemento a2: ");
        System.out.println(fn.C2(n1));

        // System.out.println("En decimal: ");
        // System.out.println(fn.bin2(n1));

    }
}
