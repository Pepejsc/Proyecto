package policine;

/**
 *
 * @author Usuario
 */
public class Sala {
    
    String tipoSala;
    int numeroTickets;
    String horario;

    public Sala(String tipoSala, int numeroTickets, String horario) {
        this.tipoSala = tipoSala;
        this.numeroTickets = numeroTickets;
        this.horario = horario;
    }
    
    public int asignarButaca(){
       int numero1=(int)(Math.random()*30);
       return  numero1;
    }
    
    public int asignarSala(){
       int numero2=(int)(Math.random()*10);
       return  numero2;
    }
    
    
    public String toString(){
        int numeroButaca=asignarButaca();
        int numeroSala=asignarSala();
        return "\nTipo Sala: "+tipoSala+"\nNúmero Sala: "+numeroSala+"\nAsiento:"+numeroButaca+"\n"
                +"Hora función: "+horario;
    }

}
