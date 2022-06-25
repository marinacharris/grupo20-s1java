public class Ciclos {
    public static void main(String[] args){
        // Ciclo while
        //conteo del 1 al 5
        int conta = 1;
        while (conta <= 5){ //evalua la condición antes de entrar
            System.out.println(conta);
            conta++;
        }
        System.out.println("-----------------------------");
        //ciclo do while
        conta = 1;
        do{  //ejecuta por lo menos una vez las instruccciones y evalúa al final
            System.out.println(conta);
            conta++;
        }while(conta <= 5); 
        System.out.println("-------------------------------");
        // ciclo for
        for (int i=1; i<6; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------------");
        // conteo con for del 0 al 20
        for(int i=0; i<=20; i+=2) {
            System.out.println(i);
        }

        // break, se utiliza para salir del bucle y continue su utiliza para saltar un valor
        System.out.println("-------------------------------");
        for(int i=0; i<=20; i+=2) {
            if(i==10){
                continue; //
            }
            System.out.println(i);
        }
        System.out.println("-------------------------------");
        for(int j=0; j<=20; j+=2) {
            if(j==10){
                break; //
            }
            System.out.println(j);
        }
    }
}

