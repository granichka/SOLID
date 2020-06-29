package local.nix.solid.project.gym.service.impl;

import local.nix.solid.project.gym.data.AirConditioning;
import local.nix.solid.project.gym.data.TreadMill;
import local.nix.solid.project.gym.service.AirConditioningService;
import local.nix.solid.project.gym.service.CoachResponsibilityService;
import local.nix.solid.project.gym.service.TreadMillService;

public class CoachResponsibilityServiceImpl implements CoachResponsibilityService {

    private AirConditioningService airConditioningService = new AirConditioningServiceImpl();
    private TreadMillService treadMillService = new TreadMillServiceImpl();

    public void startWorkOutResponsibility() {
        airConditioningService.turnOn();
        treadMillService.turnOn();
    }

    public void finishWorkOutResponsibility() {
        System.out.println("Убирает за клиентами спортивное оборудование");
    }

}
