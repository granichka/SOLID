package local.nix.solid.project.gym.config.impl;

import local.nix.solid.project.gym.config.ApplicationConfiguration;

public class JavaApplicationConfiguration implements ApplicationConfiguration {

    @Override
    public <T> Class<? extends T> getCurrentImplementation(Class<T> type) {
        return null;
    }
}
