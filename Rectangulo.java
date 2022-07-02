public class Rectangulo extends Area { // clase hija
    private String figura = "Rectangulo";
    public double area(){
        return dimension1*dimension2;
    }
    public static void main(String[] args) {
        Rectangulo obj1 = new Rectangulo();
        System.out.println(obj1.figura);
        obj1.mostrarDimensiones();
        System.out.println(obj1.area());

    }
}
