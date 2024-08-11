// aaron estrada
package tienditaMaster;
import java.util.ArrayList;
public class lista {
    private ArrayList <empleado> listaempleado;
    private ArrayList <proveedor> listaproveedor;
    private ArrayList <cliente> listacliente;
    private ArrayList <pedidoCabecera> listapedidoCabecera;
    private ArrayList <facturaCabecera> listafacturaCabecera;
    public lista(){
   listaempleado=new ArrayList <empleado>();
   listaproveedor=new ArrayList <proveedor>();
   listacliente=new ArrayList<cliente>();
   listapedidoCabecera=new ArrayList<pedidoCabecera>();
   listafacturaCabecera=new ArrayList<facturaCabecera>();
    }
   
    public void addempleado( empleado empleado,proveedor proveedor,cliente cliente,pedidoCabecera pedidoCabecera,facturaCabecera facturaCabecera){
    listaempleado.add(empleado);
    listaproveedor.add(proveedor);
    listacliente.add(cliente);
    listapedidoCabecera.add(pedidoCabecera);
    listafacturaCabecera.add(facturaCabecera);
    }
    public  void lista(){
        System.out.println("mostrar datos de la lista->");
        for(empleado tmp: listaempleado){
        tmp.mostrarDatos();
        }
        System.out.println("mostrar datos de la lista->");
        for(proveedor tmp: listaproveedor){
        tmp.mostrarDatos();
        }
         System.out.println("mostrar datos de la lista->");
        for(cliente tmp: listacliente){
        tmp.mostrarDatos();
    }
     System.out.println("mostrar datos de la lista->");
        for(pedidoCabecera tmp: listapedidoCabecera){
        tmp.mostrarDatos();
        }
        System.out.println("mostrar datos de la lista->");
        for(facturaCabecera tmp: listafacturaCabecera){
        tmp.mostrarDatos();
        }
    }   
}

