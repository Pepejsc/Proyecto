
package policine;

import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class Factura {
    
    public int anio,dia,mes,hora,minuto,segundos;
    public double total;
    
    public String mostrarFecha(){//metodo para calcular la fecha y hora actual
        Calendar calendario= Calendar.getInstance();
        String fecha;
        anio=calendario.get(Calendar.YEAR);//obtiene el año actual
        dia=calendario.get(Calendar.DATE);//obtiene el dia actual
        mes=calendario.get(Calendar.MONTH)+1;//obtiene el mes actual
        hora=calendario.get(Calendar.HOUR_OF_DAY);//obtiene la hora actual
        minuto=calendario.get(Calendar.MINUTE);//obtiene los minutos actuales
        segundos=calendario.get(Calendar.SECOND);//obtiene los segundos actuales
        String cadena = "Fecha: "+dia+"/"+mes+"/"+anio+"\t\tHora: "+hora+":"+minuto+":"+segundos+"\n";
        return cadena;
    }
}
