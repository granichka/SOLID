package local.nix.solid.project.gym.service;

import local.nix.solid.project.gym.data.AbstractTechnique;

public interface AbstractTechniqueService<T extends AbstractTechnique> {

    void turnOn();
    void turnOff();

}
