package local.nix.solid.project.gym;

public class Main {

    public static void main(String[] args) {
        CoachService coachService = new CoachService();
        coachService.startWorkOut(new Client());
    }
}
