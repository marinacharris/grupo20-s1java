public class Atributos {
    int x = 5;
    final int CODIGO = 2580;
    public static void main(String[] args) {
        Atributos obj1 = new Atributos();
        System.out.println(obj1.x);
        obj1.x = 25;
        System.out.println(obj1.x);
        System.out.println(obj1.CODIGO);
        
    }
}
