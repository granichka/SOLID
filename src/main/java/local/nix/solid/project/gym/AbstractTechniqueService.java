package local.nix.solid.project.gym;

public abstract class AbstractTechnique {

    private boolean isTurnedOn;

    public void turnOn() {
        isTurnedOn = true;
    }

    public void turnOff() {
        isTurnedOn = false;
    }


}
