// aaron estrada
package tienditaMaster;

public class cliente extends persona{
    private int idCliente;
    private int fechaRegistro;

    public cliente(int idCliente, int fechaRegistro, String nombre, String apellidoPaterno, String apellidoMaterno, String curp, int telefono, int calleNo, String colonia, String ciudad, String pais) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais);
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
    }
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getFechaRegristro() {
        return fechaRegistro;
    }

    public void setFechaRegristro(int fechaRegristro) {
        this.fechaRegistro = fechaRegristro;
    } 
    public void mostrarDatos(){
    System.out.println("el nombre del empleado es-> "+getNombre()+
            "el apellido paterno es->"+getApellidoPaterno()+
            "el apellido materno es:"+getApellidoMaterno()+
            "su curp es->"+getCurp()+"telefono->"+getTelefono()
            +"calleNo->"+getCalleNo()+"colonia:"+getColonia()+"ciudad->"
            +getCiudad()+"pais->"+getPais()+"el id delCliente es->"
            +getIdCliente()+"la fecha del Registro es->"+getFechaRegristro());
    }
    
}
