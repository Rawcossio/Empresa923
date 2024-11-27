package Administrador923;

public class Main {
    public static void main(String[] args) {

        Supervisor923 supervisor=new Supervisor923("juan", "super@gmail.com", "Supervisor 1");
        System.out.println(supervisor.mostrarDetalles());
        Administrador923 admin=new Administrador923("jorge", "admin@gmail.com","Admin Principal");
        System.out.println(admin.adminDetalles());
        EmpleadoRegular923 empleado=new EmpleadoRegular923("Raul","raul@empleado.com", "Empleado 4");
        System.out.println(empleado.empleadoDetalles());
        System.out.println(empleado.mostrarDetalles());
    }
}
