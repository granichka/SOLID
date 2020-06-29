package local.nix.solid.project.gym.service.impl;

import local.nix.solid.project.gym.data.Client;
import local.nix.solid.project.gym.service.CoachResponsibilityService;
import local.nix.solid.project.gym.service.CoachService;


public class CoachServiceImpl implements CoachService {

    CoachResponsibilityService coachResponsibilityService = new CoachResponsibilityServiceImpl();

    public void startWorkOut(Client client) {
        coachResponsibilityService.startWorkOutResponsibility();
        train(client);
        coachResponsibilityService.finishWorkOutResponsibility();
    }

    public void train(Client client) {
        System.out.println("Следит за корректностью выполнения упражнений");
        System.out.println("Страхует");

    }
}
