public class CarroArObj{
    private String marca;
    private Double precio;
    public CarroArObj(String marca){
        this.marca = marca;
    }
    public CarroArObj(String marca, Double precio){
        this.marca = marca;
        this.precio = precio; 
    }
    public String getMarca(){
        return marca;
    }
    public Double getPrecio(){ 
        return precio;
    }
}
