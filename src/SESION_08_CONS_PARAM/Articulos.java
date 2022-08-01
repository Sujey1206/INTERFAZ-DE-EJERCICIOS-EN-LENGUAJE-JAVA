/*
REALICE UN PROGRAMA QUE INGRESE LOS DATOS DE LOS ARTICULOS DE UN ALMACEN: 
CODIGO, DESCRIPCION. TIPO DE ARTICULO (ALFA, BETA O GAMMA), COSTO UNITARIO, 
CANTIDAD, COSTO DE MANTENIMIENTO (SOLO  PARA BETA), COSTO DE TRASLADO 
(SOLO ALFA Y BETA). SE PIDE INFORME Y AL PIE DEL REPORTE DEBERA IMPRIMIR 
EL PROMEDIO DE LOS COSTOS TOTALES POR TIPO DE ARTICULO. APLIQUE FORMULARIO
 */
package SESION_08_CONS_PARAM;

public class Articulos {
    private String cod,desc,tipo;
    private int cant;
    private float cu,cm,ct;

    public Articulos(String cod, String desc, String tipo, int cant, float cu, float cm, float ct) {
        this.cod = cod;
        this.desc = desc;
        this.tipo = tipo;
        this.cant = cant;
        this.cu = cu;
        this.cm = cm;
        this.ct = ct;
    }
    
    public float costo_total(){
        float total=0;
        if (tipo.compareTo("Alfa")==0) {
            cm=0;
            total=(ct+cu)*cant;
        }
        if (tipo.compareTo("Beta")==0) {
            total=(cm+ct+cu)*cant;
        }
        if (tipo.compareTo("Gamma")==0) {
            cm=0;
            ct=0;
            total=cu*cant;
        }        
        return total; 
    }
    
    @Override
    public String toString() {
        return "Articulos{" + "cod=" + cod + ", desc=" + desc + ", cant=" + cant + ", tipo=" + tipo + ", cu=" + cu + ", cm=" + cm + ", ct=" + ct +", costo total="+costo_total()+ '}';
    }   
}
