public class Vehicle {
//atributos de los vehiculos en private para encapsularlos
    private String brand;
    private String model;
    private int year;
    private double price;
    public Vehicle (String brand,String model,int year,double price){ //constructor con los parametros
        this.brand = brand ;
        this.model = model ;
        this.year = year ;
        this.price = price ;
        }
    //1 metodo para obtener  brand
    public String getBrand(){
        return brand;
    }
    //asiganamos los valores a los atributos
    public void setBrand(String brand){
        this.brand=brand;
    }
    //2 metodo para obtener el model
    public String getModel(){
        return model;
    }
    //asiganamos los valores a los atributos
    public void setModel(String model){
        this.model=model;
    }
    //3 metodo para obtener el Year
    public int getYear(){
        return year;
    }
    //asiganamos los valores a los atributos
    public void setYear(int year){
        this.year=year;
    }
    //4 metodo para obtener el price
    public double getPrice(){
        return price;
    }
    //asiganamos los valores a los atributos
    public void setPrice(double price){
        this.price=price;
    }
    //imprimimos la informacion del vehiculo
    public String toString (){
            return "Vehicle {" +
                    "\nBrand: " + brand +
                    "\nModel: " + model +
                    "\nYear: " + year +
                    "\nPrice: $" + price +
                    "\n}";
    }
}





