package Administrador923;

public class Administrador923 {
    //Atributos
    String nombreAdmin, emailAdmin, rolAdmin;

    //Metodos

    public Administrador923(String nombreAdmin, String emailAdmin, String rolAdmin) {
        this.nombreAdmin = nombreAdmin;
        this.emailAdmin = emailAdmin;
        this.rolAdmin = rolAdmin;
    }

    public String mostrarDetalles(){
        return "el Administrador con nombre "+ nombreAdmin+" tiene como email "+emailAdmin+" y su rol dentro de la empresa es "+rolAdmin;
    }

    public String adminDetalles(){
        return"El administrador puede gestionar todos los usuarios (crear, eliminar, modificar), además de ver la información completa de cualquier usuario";
    }
}
