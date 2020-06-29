package local.nix.solid.project.gym;

public class Coach {

    private AirConditioning airConditioning = new AirConditioning();
    private TreadMill treadMill = new TreadMill();
    CoachResponsibility coachResponsibility = new CoachResponsibility();

    public void startWorkOut(Client client) {
        coachResponsibility.startWorkOutResponsibility(airConditioning, treadMill);
        train(client);
        coachResponsibility.finishWorkOutResponsibility();
    }

    public void train(Client client) {
        System.out.println("Следит за корректностью выполнения упражнений");
        System.out.println("Страхует");

    }
}
