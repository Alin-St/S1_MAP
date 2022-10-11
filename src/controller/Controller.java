package controller;

import model.Entity;
import repository.Repository;

import java.util.ArrayList;

public class Controller {

    Repository _repository;

    public Controller(Repository repository) {
        _repository = repository;
    }

    public ArrayList<Entity> getEntitiesWithMinimumWeight(int weight)  {

        ArrayList<Entity> result = new ArrayList<>();

        for (Entity entity : _repository.getEntities()) {
            if (entity.get_weight() > weight)
                result.add(entity);
        }

        return result;
    }
}
