package local.nix.solid.project.gym;

import local.nix.solid.project.gym.data.AbstractTechnique;

public interface AbstractTechniqueService<T extends AbstractTechnique> {

    void turnOn();
    void turnOff();

}
