import java.util.Scanner;

public class Ejercicio1 {
    //atributos o variables de la clase
    //métodos o funciones de la clase
    // main
    private String nombre; //atributos o variables de la clase
    private Double estatura;
    private Scanner sc;

    //métodos o funciones de la clase
    public void capturar(){
        sc = new Scanner(System.in);
        System.out.println("Digite el nombre");
        nombre = sc.nextLine();
        System.out.println("Digite su estatura");
        estatura = sc.nextDouble();
    }

    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Estatura: " + estatura);
    }

    public void clasificar(){
        if(estatura > 1.60){
            System.out.println("Aceptado");
        }else{
            System.out.println("No aceptado");
        }
        
    }

    public static void main(String[] args){
        Ejercicio1 objeto1;
        objeto1 = new Ejercicio1();
        objeto1.capturar();
        objeto1.imprimir();
        objeto1.clasificar();
    }




    
}
