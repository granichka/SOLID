package local.nix.solid.project.gym;

import local.nix.solid.project.gym.data.AirConditioning;
import local.nix.solid.project.gym.data.TreadMill;
import local.nix.solid.project.gym.service.AirConditioningService;
import local.nix.solid.project.gym.service.TreadMillService;

public class CoachResponsibility {

    public void startWorkOutResponsibility(AirConditioningService airConditioning, TreadMillService treadMill) {
                airConditioning.turnOn();
                treadMill.turnOn();
    }

    public void finishWorkOutResponsibility() {
        System.out.println("Убирает за клиентами спортивное оборудование");
    }
}
