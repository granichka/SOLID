package local.nix.solid.project.gym.service.impl;

import local.nix.solid.project.gym.service.AirConditioningService;
import local.nix.solid.project.gym.service.CoachResponsibilityService;
import local.nix.solid.project.gym.service.TreadMillService;

public class MainCoachResponsibilityServiceImpl implements CoachResponsibilityService {

    private AirConditioningService airConditioningService = new AirConditioningServiceImpl();
    private TreadMillService treadMillService = new TreadMillServiceImpl();

    public void startWorkOutResponsibility() {
        System.out.println("Включает музыку");
        airConditioningService.turnOn();
        treadMillService.turnOn();
    }

    public void finishWorkOutResponsibility() {
        System.out.println("Контролирует уборку в зале");
    }
}
