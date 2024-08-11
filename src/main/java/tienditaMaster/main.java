// aaron estrada 
package tienditaMaster;
import java.util.*;
public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<empleado> empleados = new ArrayList<empleado>();
    List<proveedor> proveedor = new ArrayList<proveedor>();
    List<cliente> Cliente = new ArrayList<cliente>();
    List<pedidoCabecera> pedidos = new ArrayList<pedidoCabecera>();
    List<facturaCabecera> factura = new ArrayList<facturaCabecera>();
    

    
    // Pedir datos de empleados
    for (int i = 0; i < 10; i++) {
      System.out.println("Datos del Empleado #" + (i+1));
      System.out.print("Nombre: ");
      String nombre = scanner.nextLine();
      System.out.print("Apellido Paterno: ");
      String apellidoPaterno = scanner.nextLine();
      System.out.print("Apellido Materno: ");
      String apellidoMaterno = scanner.nextLine();
      System.out.print("CURP: ");
      String curp = scanner.nextLine();
      System.out.print("Teléfono: ");
      String telefono = scanner.nextLine();
      System.out.print("Calle y Número: ");
      String calleNo = scanner.nextLine();
      System.out.print("Colonia: ");
      String colonia = scanner.nextLine();
      System.out.print("Ciudad: ");
      String ciudad = scanner.nextLine();
      System.out.print("País: ");
      String pais = scanner.nextLine();
      System.out.print("ID de Empleado: ");
      int idEmpleado = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Puesto: ");
      String puesto = scanner.nextLine();
      System.out.print("Fecha de Ingreso: ");
      String fechaIngreso = scanner.nextLine();
      System.out.print("Sueldo: ");
      double sueldo = scanner.nextDouble();
      scanner.nextLine();
     
    }
    
    
    
    // Pedir datos de pedidos
    for (int i = 0; i < 10; i++) {
      System.out.println("Datos del Pedido #" + (i+1));
      System.out.print("Nombre del Proveedor: ");
      String nombre = scanner.nextLine();
      System.out.print("Apellido Paterno del Proveedor: ");
      String apellidoPaterno = scanner.nextLine();
      System.out.print("Apellido Materno del Proveedor: ");
      String apellidoMaterno = scanner.nextLine();
      System.out.print("CURP del Datos del Proveedor: ");
      String curp = scanner.nextLine();
      System.out.print("Teléfono del Proveedor: ");
      String telefono = scanner.nextLine();
      System.out.print("Calle y Número del Proveedor: ");
      String calleNo = scanner.nextLine();
      System.out.print("Colonia del Proveedor: ");
      String colonia = scanner.nextLine();
      System.out.print("Ciudad del Proveedor: ");
      String ciudad = scanner.nextLine();
      System.out.print("País del Proveedor: ");
      String pais = scanner.nextLine();
      System.out.print("ID de Proveedor: ");
      int idEmpleado = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Puesto del Proveedor: ");
      String puesto = scanner.nextLine();
      System.out.print("Fecha de Registro del Proveedor: ");
      String fechaIngreso = scanner.nextLine();
      System.out.print("Sueldo del Proveedor: ");
      double sueldo = scanner.nextDouble();
      scanner.nextLine();
      System.out.print("Folio de Pedido: ");
      int folioPedido = (int) scanner.nextDouble();
      scanner.nextLine();
        System.out.println("Fecha del Pedido: ");
        scanner.nextLine();
        
        
        
              }
    //PEDIR DATOS DE LA FACTURA.
    for (int i = 0; i < 10; i++) {
      System.out.println("Datos de la factura: " + (i+1));
      System.out.print("Nombre del Empleado: ");
      String nombre = scanner.nextLine();
      System.out.print("Apellido Paterno del Empleado: ");
      String apellidoPaterno = scanner.nextLine();
      System.out.print("Apellido Materno del Empleado: ");
      String apellidoMaterno = scanner.nextLine();
      System.out.print("CURP del Empleado: ");
      String curp = scanner.nextLine();
      System.out.print("Teléfono del Empleado: ");
      String telefono = scanner.nextLine();
      System.out.print("Calle y Número del Empleado: ");
      String calleNo = scanner.nextLine();
      System.out.print("Colonia del Empleado: ");
      String colonia = scanner.nextLine();
      System.out.print("Ciudad del Empleado: ");
      String ciudad = scanner.nextLine();
      System.out.print("País del Empleado: ");
      String pais = scanner.nextLine();
      System.out.print("ID de Empleado: ");
      int idEmpleado = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Puesto del Empleado: ");
      String puesto = scanner.nextLine();
      System.out.print("Fecha de Ingreso del Empleado: ");
      String fechaIngreso = scanner.nextLine();
      System.out.print("Sueldo del Empleado: ");
      double sueldo = scanner.nextDouble();
      scanner.nextLine();
    }
  }
}
