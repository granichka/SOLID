package local.nix.solid.project.gym;

public class CoachResponsibility {

    public void startWorkOutResponsibility(AirConditioning airConditioning, TreadMill treadMill) {
                airConditioning.turnOn();
                treadMill.turnOn();
    }

    public void finishWorkOutResponsibility() {
        System.out.println("Убирает за клиентами спортивное оборудование");
    }
}
