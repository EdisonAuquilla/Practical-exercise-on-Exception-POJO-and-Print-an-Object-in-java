import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String email="edison@gmail.com";
       String pasword="contraseña";
       String repeatPasword="contraseña";
       ConfirmationPasword call= new ConfirmationPasword(); //creamos una nueva instancia que nos ayuda a registrar el usuario
            try {
                call.PaswordValidation(pasword,repeatPasword); // le pasamos las contraseñas para que se confirme
            }catch (MyCustomExceptioninJava e){
                e.printStackTrace();
            }
    }
}