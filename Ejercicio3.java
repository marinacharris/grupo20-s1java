import java.util.Scanner;
public class Ejercicio3 {
    public void capturaDatos(){
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingrese primer valor");
        float valor1 = numeros.nextFloat();
        System.out.println("Ingrese segundo valor");
        float valor2 = numeros.nextFloat();
        numeros.close();
        float suma, resta, multi, divi;
        suma = suma(valor1, valor2);
        resta = resta(valor1, valor2);
        multi = mul(valor1, valor2);
        divi= div(valor1, valor2);
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);
        System.out.println(divi);
    }
    public float suma(float v1, float v2){
        float suma = v1 + v2;
        return suma;
    }
    public float resta (float v1, float v2){
        float resta = v1 - v2;
        return resta;
    }
    public float mul(float v1, float v2){
        float multi = v1 * v2;
        return multi;
    }
    public float div(float v1, float v2){
        float div = v1/v2;
        return div;
    }    
    public static void main(String[] args){
        Ejercicio3 operaciones = new Ejercicio3();
        operaciones.capturaDatos();
    }
}
