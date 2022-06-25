import java.util.Scanner;
public class Lectura {
    public static void main(String[] args){
        // crear un objeto de la clase scanner
        Scanner entObj = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nom = entObj.nextLine();
        System.out.println("Digite su edad");
        int edad = entObj.nextInt();
        entObj.close();
        System.out.println("Tu nombre es "+nom+" y tu edad es "+edad);
    }
}
