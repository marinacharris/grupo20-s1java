public class Excepciones2 {
    public static void main(String[] args) {
        try{
            chequearEdad(25);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }
        
        
    }
    public static void chequearEdad(int edad) throws ArithmeticException{
        if (edad>18){
            System.out.println("acceso permitido");
        }else{
            throw new ArithmeticException("acceso denegado");
        }
        System.out.println("estuve aquí");


    }
}
