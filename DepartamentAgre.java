public class DepartamentAgre {
     String nombre;
     private String[] estudiantes;
     DepartamentAgre(String nombre, String[] estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
     }
     // getter
     public String[] getEstudiantes(){
        return estudiantes;
     }
    
}
