package local.nix.solid.project.gym;

import local.nix.solid.project.gym.data.Client;
import local.nix.solid.project.gym.service.AirConditioningService;
import local.nix.solid.project.gym.service.TreadMillService;
import local.nix.solid.project.gym.service.impl.AirConditioningServiceImpl;
import local.nix.solid.project.gym.service.impl.TreadMillServiceImpl;

public class CoachService {

    private AirConditioningService airConditioning = new AirConditioningServiceImpl();
    private TreadMillService treadMill = new TreadMillServiceImpl();
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
