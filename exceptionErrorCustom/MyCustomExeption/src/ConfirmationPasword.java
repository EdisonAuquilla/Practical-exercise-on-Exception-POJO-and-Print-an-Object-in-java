public class ConfirmationPasword { //en esta clase se dan las exepciones, clase vacia
    public ConfirmationPasword(){
    //creamos un constructor vacio
     }
     public void PaswordValidation(String pasword,String repeatPasword) throws  MyCustomExceptioninJava{
        if(pasword.equals(repeatPasword)==false){
            //lanzamos el error
            throw new MyCustomExceptioninJava("The passwords do not match ");
        }
        if (pasword.length() <12) {
            throw new MyCustomExceptioninJava("the password is not long enough ");
        }

     }
}
