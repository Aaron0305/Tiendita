// aaro estrada
package tienditaMaster;

public class proveedor extends persona{
    private int idProveedor;
    private int fechaRegistros;

    public proveedor(int idProveedor, int fechaRegistros, String nombre, String apellidoPaterno, String apellidoMaterno, String curp, int telefono, int calleNo, String colonia, String ciudad, String pais) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais);
        this.idProveedor = idProveedor;
        this.fechaRegistros = fechaRegistros;
    }
   
    public int getIdProvedor() {
        return idProveedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProveedor = idProvedor;
    }

    public int getFechaDeregistro() {
        return fechaRegistros;
    }

    public void setFechaDeregistro(int fechaDeregistro) {
        this.fechaRegistros = fechaDeregistro;
    }
    public void mostrarDatos(){
    System.out.println("el nombre del empleado es-> "+getNombre()+
            "el apellido paterno es->"+getApellidoPaterno()+
            "el apellido materno es:"+getApellidoMaterno()+
            "su curp es->"+getCurp()+"telefono->"+getTelefono()
            +"calleNo->"+getCalleNo()+"colonia:"+getColonia()+"ciudad->"
            +getCiudad()+"pais->"+getPais()+"el id del Provedor es-> "
            +getIdProvedor()+"la fecha de regristo es->"+getFechaDeregistro());
    }
}
