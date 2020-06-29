package local.nix.solid.project.gym.service.impl;

import local.nix.solid.project.gym.config.ObjectFactory;
import local.nix.solid.project.gym.data.AirConditioning;
import local.nix.solid.project.gym.data.TreadMill;
import local.nix.solid.project.gym.service.AirConditioningService;
import local.nix.solid.project.gym.service.CoachResponsibilityService;
import local.nix.solid.project.gym.service.TreadMillService;

public class CoachResponsibilityServiceImpl implements CoachResponsibilityService {

    private AirConditioningService airConditioningService = ObjectFactory.getInstance().createObject(AirConditioningService.class);
    private TreadMillService treadMillService = ObjectFactory.getInstance().createObject(TreadMillService.class);

    public void startWorkOutResponsibility() {
        airConditioningService.turnOn();
        treadMillService.turnOn();
    }

    public void finishWorkOutResponsibility() {
        System.out.println("Убирает за клиентами спортивное оборудование");
    }

}
