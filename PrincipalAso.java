public class PrincipalAso {
    public static void main(String[] args) {
        BancoAso banco = new BancoAso("AvVillas");
        EmpleadoAso empleado = new EmpleadoAso("Calos Peña");
        System.out.println(empleado.getNombre() + " trabaja en el banco "+ banco.getNombre());
    }
}
