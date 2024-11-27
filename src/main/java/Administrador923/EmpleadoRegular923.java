package Administrador923;

public class EmpleadoRegular923 {
    //Atributos
    String nombreEmpleado, emailEmpleado, rolEmpleado;

    //Metodos
    public EmpleadoRegular923(String nombreEmpleado, String emailEmpleado, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    public String mostrarDetalles(){
        return "el empleado con nombre "+ nombreEmpleado+" tiene como email "+emailEmpleado+" y su rol dentro de la empresa es "+rolEmpleado;
    }
    public String empleadoDetalles(){
        return "El empleado hace tareas básicas";
    }

}
