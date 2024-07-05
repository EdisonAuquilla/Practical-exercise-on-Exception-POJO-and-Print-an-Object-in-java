//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Vehicle VehicleType = new Vehicle("Chevrolet","Camaro",2017,399700);
    //impresion por metodo getter para tener un control detallado sobre los atributos
        System.out.println("Brand: "+VehicleType.getBrand());
        System.out.println("Model: "+VehicleType.getModel());
        System.out.println("Year: "+VehicleType.getYear());
        System.out.println("Price:"+VehicleType.getPrice());
//espacio para settear camibio//

        //segunda impresion por toString que incluye todos los atributos en un solo lugar sirve para setear cambios,se imprime un objeto
        System.out.println(VehicleType.toString());

    }
}