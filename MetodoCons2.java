public class MetodoCons2 {
    String nombre;
    int edad;
    int nota;
    String cargo;
    boolean coordinador;

    public MetodoCons2(String nombre, int edad, int nota){
        this.nombre = nombre; //this diferencia los objetos de la clase  de los
        // parámetros del métdodo
        this.edad = edad;
        this.nota = nota;
    }
    public MetodoCons2(String nombre, int edad, String cargo, boolean coordinador){
        this.nombre = nombre;
        this.edad = edad;   
        this.cargo = cargo;
        this.coordinador = coordinador;
    }

    // sobrecarga de métodos: en Java pueden existir dos o mas métodos con el 
    // mismo nombre, pero con diferentes parámetros, ya sea en cantidad o en tipo de datos
    public static void main(String[] args) {
        MetodoCons2 obj1 = new MetodoCons2("Katia", 35, 5);
        MetodoCons2 obj2 = new MetodoCons2("Pedro", 35, "Docente", true);
        System.out.println(obj1.nombre);
        System.out.println(obj1.edad);
        System.out.println(obj2.nombre);

    }
}
