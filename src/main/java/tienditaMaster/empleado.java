// aaron estrada
package tienditaMaster;

public class empleado extends persona{
     private int idEmpleado;
    private String puesto;
    private String fechaIngreso;
    private int sueldo;
   public empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String curp, int telefono, int calleNo, String colonia, String ciudad, String pais){
   super(nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais);
   }
    public empleado(int idEmpleado, String puesto, String fechaIngreso, int sueldo, String nombre, String apellidoPaterno, String apellidoMaterno, String curp, int telefono, int calleNo, String colonia, String ciudad, String pais) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais);
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
    }
   

   

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public void mostrarDatos(){
    System.out.println("el nombre del empleado es-> "+getNombre()+
            "el apellido paterno es->"+getApellidoPaterno()+
            "el apellido materno es:"+getApellidoMaterno()+
            "su curp es->"+getCurp()+"telefono->"+getTelefono()
            +"calleNo->"+getCalleNo()+"colonia:"+getColonia()+"ciudad->"
            +getCiudad()+"pais->"+getPais()+"ideEmpleado"+getIdEmpleado()+"puesto:"
            +getPuesto()+"fecha de ingreso:"+getFechaIngreso()+"sueldo:"+getSueldo());
    }
}
