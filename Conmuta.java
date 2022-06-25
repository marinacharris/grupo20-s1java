import java.util.Scanner;

public class Conmuta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el número del mes");
        int mes = sc.nextInt();
        sc.close();
        String mesLetra = "";
        switch (mes) {
            case 1:
                mesLetra = "Enero";
                break;
            case 2:
                mesLetra = "Febrero";   
                break;
            case 3:
                mesLetra = "Marzo";
                break;
            case 4:
                mesLetra = "Abril";
                break;
            case 5:
                mesLetra = "Mayo";  
                break;
            case 6:
                mesLetra = "Junio";
                break;
            case 7:
                mesLetra = "Julio";
                break;
            case 8: 
                mesLetra = "Agosto";
                break;
            case 9:
                mesLetra = "Septiembre";
                break;
            case 10:
                mesLetra = "Octubre";
                break;
            case 11:
                mesLetra = "Noviembre";
                break;
            case 12:
                mesLetra = "Diciembre";
                break;
            default:
                System.out.println("Digite un mes válido");
                      
        }
        System.out.println("El mes es "+mesLetra);
        String color = "Amarillo";
        switch (color){
            case "Amarillo":
                System.out.println("Prevención");
                break;
            case "Rojo":
                System.out.println("Deténgase");
                break;
            case "Verde":
                System.out.println("Avance");
                break;
        }


    }
}
