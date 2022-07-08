public class PrincipalComp {
    public static void main(String[] args) {
       LibroComp libro1 = new LibroComp("Introduction to algorithms", "Tomas Cormen");
       LibroComp libro2 = new LibroComp("The algorithm design manual", "Steven Skiena" );
       LibroComp libro3 =  new LibroComp("Algorithms", "Kevin Wayne");
       String[] libros = {libro1.titulo, libro2.titulo, libro3.titulo};
       BibliotecaComp biblioteca = new BibliotecaComp(libros);
       String[] librosBibloteca = biblioteca.getLibros();
       for(String i: librosBibloteca){
            System.out.println(i);
       }
    }
}
