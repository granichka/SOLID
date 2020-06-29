package local.nix.solid.project.gym.service.impl;

import local.nix.solid.project.gym.service.AirConditioningService;

public class AirConditioningServiceImpl implements AirConditioningService {


    @Override
    public void turnOn() {
        System.out.println("Кондиционер включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Кондиционер выключен");
    }
}
