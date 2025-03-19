
public class Motorino {
    private String colore;
    private double velocita;
    private String tipo;
    private boolean antifurto;

   
    public Motorino(String colore, String tipo, double velocita) {
        this.colore = colore;
        this.tipo = tipo;
        this.velocita = velocita;
        this.antifurto = false; 
    }

   
    public double getVelocita() {
        return velocita;
    }

    
    public void accelera(double incremento) {
        if (!antifurto) {
            velocita += incremento; 
        }
    }

    
    public void inserisciAntifurto() {
        antifurto = true; 
    }
}
