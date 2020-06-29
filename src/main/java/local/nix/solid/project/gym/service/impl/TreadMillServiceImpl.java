package local.nix.solid.project.gym.service.impl;

import local.nix.solid.project.gym.service.TreadMillService;

public class TreadMillServiceImpl implements TreadMillService {

    @Override
    public void turnOn() {
        System.out.println("Беговая дорожка включена");
    }

    @Override
    public void turnOff() {
        System.out.println("Беговая дорожка выключена");
    }
}
