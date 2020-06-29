package local.nix.solid.project.gym;

public class Coach {

    public void startWorkOut(Client client) {
        System.out.println("Включает беговую дорожку");
        System.out.println("Включает кондиционер");
        train(client);
        System.out.println("Убирает за кем-то спортивное оборудование");


    }

    public void train(Client client) {
        System.out.println("Начинает тренировку");
        System.out.println("Следит за корректностью выполнения упражнений");
        System.out.println("Страхует");
        System.out.println("Заканчивает тренировку");

    }
}
