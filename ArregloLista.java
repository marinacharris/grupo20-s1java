import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
public class ArregloLista {
    public static void main(String[] args) {
        ArrayList<CarroArObj> carrosLista = new ArrayList<CarroArObj>();
        ArrayList<String> carrosLista2 = new ArrayList<String>();
        carrosLista.add(new CarroArObj("Nissan")); //añado elementos a la lista con add
        carrosLista.add(new CarroArObj("Audi"));
        carrosLista.add(new CarroArObj("Renault"));
        carrosLista2.add("Fiat");
        carrosLista2.add("Mazda");
        carrosLista2.add("Nissan");
        carrosLista2.add("Audi");

        // set, se utiliza para modificar una elemento del arrayList (indice, nuevo elemento)
        carrosLista.set(0, new CarroArObj("Toyota"));
        carrosLista2.set(0, "Mercedes");
        //carrosLista.remove(1);

        for (int i = 0; i < carrosLista.size(); i++){
            System.out.println(carrosLista.get(i).getMarca()); //obtiene un valor del arraylist
        }
        System.out.println("--------------------");
        for (int i= 0; i < carrosLista2.size(); i++){
            System.out.println(carrosLista2.get(i));
        }
        System.out.println("---------------------");
        Collections.sort(carrosLista2);
        for (int i=0; i < carrosLista2.size(); i++){
            System.out.println(carrosLista2.get(i));
        }
        System.out.println("--------------------");
        //LinkedList
        LinkedList<String> carrosLista3 = new LinkedList<String>();
        carrosLista3.add("Volvo");
        carrosLista3.add("Mazda");
        carrosLista3.add("BMW");
        System.out.println(carrosLista3);
        carrosLista3.addFirst("Renault");
        System.out.println(carrosLista3);
        carrosLista3.add(1,"Fiat");
        System.out.println(carrosLista3);
        if (carrosLista3.contains("Fiat")){
            System.out.println("Fiat esta en la lista");
        }
        //HashMap

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("green", "verde"); 
        map1.put("yellow", "amarillo");
        map1.put("blue", "azul");   
        map1.put("black", "negro"); 
        for(String i: map1.values()){
            System.out.println(i);
        }
        for(String i: map1.keySet()){
            System.out.println(i);
        }
        System.out.println("green en español es: "+ map1.get("green"));
        System.out.println("red en español es: "+ map1.getOrDefault("red","No existe"));

        // hashMap con objeto CarroArObj
        Map<CarroArObj,String> map2 = new HashMap<CarroArObj,String>();
        map2.put(new CarroArObj("Mazda"), "Azul");
        map2.put(new CarroArObj("BMW"),"Plateado");
        map2.put(new CarroArObj("Fiat"),"Rojo");
        System.out.println(map2.size());
        for(CarroArObj i: map2.keySet()){
            System.out.println(i.getMarca()+" - " + map2.get(i));
        } 
        
        //hashSet
        HashSet<String> ciudades = new HashSet<String>();
        ciudades.add("Cali");
        ciudades.add("Barranquilla");
        ciudades.add("Bucaramangan");
        ciudades.add("Cali");
        System.out.println(ciudades);

    }

  

}
