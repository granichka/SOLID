package local.nix.solid.project.gym.config;


import local.nix.solid.project.gym.config.impl.JavaApplicationConfiguration;
import local.nix.solid.project.gym.service.CoachResponsibilityService;
import local.nix.solid.project.gym.service.impl.MainCoachResponsibilityServiceImpl;


import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {

    private static ObjectFactory instance;
    private ApplicationConfiguration config;

    private ObjectFactory() {
        config = new JavaApplicationConfiguration(
                "local.nix.solid.project.gym",
                new HashMap<>(Map.of(CoachResponsibilityService.class, MainCoachResponsibilityServiceImpl.class)));
    }

    public static ObjectFactory getInstance() {
        if (instance == null) {
            instance = new ObjectFactory();
        }
        return instance;
    }

    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getCurrentImplementation(type);
        }
        T t;
        try {
            t = implClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("невозможно создать класс: " + e.getClass().getName() + " " + ",msg: " + e.getMessage());
        }
        return t;
    }

}
