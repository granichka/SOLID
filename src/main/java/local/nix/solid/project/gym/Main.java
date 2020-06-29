package local.nix.solid.project.gym;

import local.nix.solid.project.gym.data.Client;
import local.nix.solid.project.gym.service.impl.CoachServiceImpl;

public class Main {

    public static void main(String[] args) {
        CoachServiceImpl coachServiceImpl = new CoachServiceImpl();
        coachServiceImpl.startWorkOut(new Client());
    }
}
