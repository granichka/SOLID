package local.nix.solid.project.gym;

public class Main {

    public static void main(String[] args) {
        Coach coach = new Coach();
        coach.startWorkOut(new Client());
    }
}
