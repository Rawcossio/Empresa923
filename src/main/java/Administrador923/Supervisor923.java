package Administrador923;

public class Supervisor923 {

    //Atributos
    String nombreSupervisor, emailSupervisor, rolSupervisor;

    //Metodos

    public Supervisor923(String nombreSupervisor, String emailSupervisor, String rolSupervisor) {
        this.nombreSupervisor = nombreSupervisor;
        this.emailSupervisor = emailSupervisor;
        this.rolSupervisor = rolSupervisor;
    }

    public String mostrarDetalles(){
        return "el Supervisor con nombre "+ nombreSupervisor+" tiene como email "+emailSupervisor+" y su rol dentro de la empresa es "+rolSupervisor;
    }
    public String supervisorDetalles(){
        return "El supervisor puede ver detalles de todos los empleados y supervisar su trabajo";
    }
}
