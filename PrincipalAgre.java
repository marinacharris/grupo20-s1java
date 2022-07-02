public class PrincipalAgre {
    public static void main(String[] args) {
        EstudianteAgre estudiante1 = new EstudianteAgre("Juan",32585697,"MAT");
        EstudianteAgre estudiante2 = new EstudianteAgre("Ana", 1025487986, "CIE");
        EstudianteAgre estudiante3 = new EstudianteAgre("María", 36589741, "MAT");

        String[] estudiantesMAT = {estudiante1.name, estudiante3.name};
        String[] estudiantesCIE = {estudiante2.name};

        DepartamentAgre dep1 = new DepartamentAgre("MAT", estudiantesMAT);
        DepartamentAgre dep2 = new DepartamentAgre("CIE", estudiantesCIE);


    }
}
