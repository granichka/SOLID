package local.nix.solid.project.gym.config;


public class ObjectFactory {

    private static ObjectFactory instance;


    private ObjectFactory() { }

    public static ObjectFactory getInstance() {
        if (instance == null) {
            instance = new ObjectFactory();
        }
        return instance;
    }
}
