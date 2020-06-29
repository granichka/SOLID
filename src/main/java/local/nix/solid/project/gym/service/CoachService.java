package local.nix.solid.project.gym.service;

import local.nix.solid.project.gym.data.Client;
import local.nix.solid.project.gym.data.Coach;


public interface CoachService extends AbstractService<Coach> {

    void startWorkOut(Client client);


}
