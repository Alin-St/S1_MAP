package view;

import controller.Controller;
import model.Apple;
import model.Book;
import model.Cake;
import model.Entity;
import repository.Repository;

public class View {

    public void run() {
        Repository repository = new Repository();
        Controller controller = new Controller(repository);

        addData(repository);
        ShowEntitiesWithAtLeast200Grams(controller);
    }

    void addData(Repository repository) {

        // This is an apple with 100 grams.
        Apple entity1 = new Apple();
        entity1.set_weight(100);
        repository.add(entity1);

        // This is a cake with 150 grams.
        Cake entity2 = new Cake();
        entity2.set_weight(150);
        repository.add(entity2);

        // This is a cake with 250 grams.
        Cake entity3 = new Cake();
        entity3.set_weight(250);
        repository.add(entity3);

        // This is a book with 300 grams.
        Book entity4 = new Book();
        entity4.set_weight(300);
        repository.add(entity4);
    }

    public void ShowEntitiesWithAtLeast200Grams(Controller controller) {
        for (Entity entity : controller.getEntitiesWithMinimumWeight(201)) {
            System.out.println(entity.toString());
        }
    }
}
