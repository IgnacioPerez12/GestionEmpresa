package GestionEmpresa;

public class Empleado extends Persona{

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    public static void setContadorEmpleados(int aContadorEmpleados) {
        contadorEmpleados = aContadorEmpleados;
    }
    
    private int idEmpleado;
    private Double sueldo;
    private static int contadorEmpleados;
    
    
    //Constructor
    public Empleado(Double sueldo, String nombre, String direccion, char genero, int edad) {
        super(nombre, direccion, genero, edad);
        this.sueldo = sueldo;
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }

    //Getter and setter
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }


    
}

