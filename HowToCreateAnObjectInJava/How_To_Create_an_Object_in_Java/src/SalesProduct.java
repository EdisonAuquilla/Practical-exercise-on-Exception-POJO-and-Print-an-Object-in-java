public class SalesProduct {
    private String name;
    private String brand;
    private double price;
   public SalesProduct(String name,String brand,double price){ //constructor para los parametros
       this.name = name;
       this.brand = brand;
       this.price = price;
   }
    public String getName() { //obtenemos la cadena de name
        return name;
    }
    public void setName(String name) {    //asignamos la cadena

        this.name = name;
    }

    public String getBrand() {//obtenemos la cadena de brand

        return brand;
    }
    public void setBrand(String brand) {    //asignamos la cadena

        this.brand = brand;
    }
    public double getPrice() {    //obtenemos el valor de price

        return price;
    }
    public void setPrice(double price) {    //asignamos el valor al atributo
        this.price = price;
    }
    //metodo
    // esto se imprimira cuando se llame al metodo
    public String toString() {
        return "Product{" +
                "Name=" + name +
                ", Brand="
                + brand+
                ", Price=$"
                + price +
                '}';
    }
}
