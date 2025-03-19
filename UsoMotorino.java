
public class UsoMotorino {
    public static void main(String[] args) {
       
        Motorino motorino1 = new Motorino("grigiometallizzato", "Piaggio Liberty", 40.5);
        
        
        MotorinoMatricolato motorino2 = new MotorinoMatricolato("rosso", "Aprilia Scarabeo", 30.5, 60, "CVI234");

        
        double velocitaMotorino1 = motorino1.getVelocita();
        System.out.println("Velocità del motorino1: " + velocitaMotorino1);

       
        double maxVelocitaMotorino2 = motorino2.getMax();
        System.out.println("Velocità massima di motorino2: " + maxVelocitaMotorino2);

        motorino1.accelera(30.7);
        motorino2.accelera(30.7);

        System.out.println("Nuova velocità del motorino1: " + motorino1.getVelocita());
        System.out.println("Nuova velocità del motorino2: " + motorino2.getVelocita());
    }
}


