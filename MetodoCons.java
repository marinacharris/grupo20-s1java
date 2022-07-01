public class MetodoCons {
    String nombre;
    int edad;
    // El método constructor se ejecuta cuando se realiza una instacia de la clase
    // El nombre del método constructor debe ser el mismo nombre de la clase.
    // El método constructor no retorna valores
    // y su principal función es inicializar los atributos de la clase
    public MetodoCons(){
        nombre = "Ana";
        edad = 38;
    }
    public static void main(String[] args) {
        MetodoCons obj1 = new MetodoCons();
        System.out.println(obj1.nombre);
        System.out.println(obj1.edad);;
    }


}
