public class Arreglos {
    public static void main(String[] args){
        String[] ciudades = {"Cali","Medellín","Montería","Bogotá"};
        int[] numeros = {45,21,80,10,56};
        System.out.println(ciudades[2]);
        System.out.println(ciudades.length);
        // recorrer el array con un for clásico 
        for (int i = 0; i < ciudades.length; i++){
            System.out.println(ciudades[i]);
        }
        // recorrer arreglo con un for each
        for(String city: ciudades){
            System.out.println(city);
        }

        for (int num: numeros){
            System.out.println(num);
        }


    }
}
