public class MyCustomExceptioninJava extends Exception{
    public static final long serialVersionID =470;
    //Pasamos un parametro de tipo texto
    public MyCustomExceptioninJava(String menssage){ //cuando se crea una nueva exepcion se manda un mensaje del porque se llama la exepcion
        //Se llama al metodo
        super(menssage);
    }


}
