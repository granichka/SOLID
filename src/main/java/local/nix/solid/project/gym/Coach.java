package local.nix.solid.project.gym;

public class Coach {

    private AirConditioning airConditioning = new AirConditioning();
    private TreadMill treadMill = new TreadMill();

    public void startWorkOut(Client client) {
        treadMill.turnOn();
        airConditioning.turnOn();
        train(client);
        System.out.println("Убирает за кем-то спортивное оборудование");
    }

    public void train(Client client) {
        System.out.println("Следит за корректностью выполнения упражнений");
        System.out.println("Страхует");


    }
}
