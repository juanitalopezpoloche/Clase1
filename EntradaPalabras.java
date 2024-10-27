import java.util.Scanner;
public class EntradaPalabras {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("Introduzca palabra 1: ");
        var palabra1 = entrada.nextLine();

        System.out.println("Introduzca palabra 2: ");
        var palabra2 = entrada.nextLine();
        
        System.out.println("Introduzca palabra 3: ");
        var palabra3 = entrada.nextLine();
        
        System.out.println("Palabra 1: "+palabra1);
        System.out.println("Palabra 2: "+palabra2);
        System.out.println("Palabra 3: "+palabra3);
    }

}
