public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //definir una variable: tipoVariable nombreVariable = valorInicial
        int num = 5;
        var num2 = 5.5F; //Java infiere el tipo de variable cuando se usa "var"
        String nombre = "Juan";
        System.out.println(num);
        System.out.println(nombre.getClass().getSimpleName());
        System.out.println(((Object)num2).getClass().getSimpleName()); //casting
        System.out.println("Barranquilla es conocida como \"La Arenosa\"");
        //  \", \' \\
        Ejercicio3 obj1 = new Ejercicio3(); 
        System.out.println(obj1.suma(5, 9));
    }
}
