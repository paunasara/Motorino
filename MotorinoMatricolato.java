
public class MotorinoMatricolato extends Motorino {
    private double maxVelocita;
    private String targa;

   
    public MotorinoMatricolato(String colore, String tipo, double velocita, double maxVelocita, String targa) {
        super(colore, tipo, velocita); 
        this.maxVelocita = maxVelocita;
        this.targa = targa;
    }

    
    public double getMax() {
        return maxVelocita;
    }
    @Override
    public void accelera(double incremento) {
        double nuovaVelocita = getVelocita() + incremento;

        if (nuovaVelocita <= maxVelocita) {
        
            super.accelera(incremento);
        } else {
            
            super.accelera(maxVelocita - getVelocita());
        }
    }
}

