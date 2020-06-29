package local.nix.solid.project.gym.config;

public interface ApplicationConfiguration {

    <T> Class<? extends T> getCurrentImplementation(Class<T> type);
}
