package policine;

/**
 *
 * @author Usuario
 */
public class Sala {
    
    String tipoSala;
    int numeroTickets;
    double total;

    public Sala(String tipoSala, int numeroTickets, double total) {
        this.tipoSala = tipoSala;
        this.numeroTickets = numeroTickets;
        this.total = total;
    }
}
