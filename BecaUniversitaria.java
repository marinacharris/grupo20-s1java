public class BecaUniversitaria {
    //atributos:
    int pTiempo;
    double pMonto;
    double pInteres;
    //Contructor:
    public BecaUniversitaria(){
        pTiempo = 0;
        pMonto = 0;
        pInteres = 0;
    }
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres){
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;   
        this.pInteres = pInteres;
    }
    //Metodos:
    public double calcularInteresSimple(){
        double interesSimple = pMonto * (pInteres/100) * pTiempo;
        return Math.round(interesSimple);
    }
    public double calcularInteresCompuesto(){
        double interesCompuesto = pMonto *(Math.pow(1+pInteres/100,pTiempo)-1);
        return Math.round(interesCompuesto);
    }
    public String compararInversion(){
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        if (diferencia == 0){
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }else{
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        }
        
    }
    public String compararInversion(int pTiempo, double pMonto, double pInteres){
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;   
        this.pInteres = pInteres;
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        if (diferencia == 0){
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }else{
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        }
    
    }
    public static void main(String[] args) {
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria(); 
        System.out.println(becaUniversitaria.calcularInteresSimple()); 
        System.out.println(becaUniversitaria.calcularInteresCompuesto()); 
        System.out.println(becaUniversitaria.compararInversion(60,13000,1.4)); 
        BecaUniversitaria becaUniversitaria2 = new BecaUniversitaria(48,10000,2); 
        System.out.println(becaUniversitaria2.calcularInteresSimple()); 
        System.out.println(becaUniversitaria2.calcularInteresCompuesto()); 
        System.out.println(becaUniversitaria2.compararInversion());
        BecaUniversitaria becaUniversitaria3 = new BecaUniversitaria(); 
        System.out.println(becaUniversitaria3.calcularInteresSimple()); 
        System.out.println(becaUniversitaria3.calcularInteresCompuesto()); 
        System.out.println(becaUniversitaria3.compararInversion());
    }

}
