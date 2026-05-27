package services;

import entities.EntitiesPerson;
import exceptions.ExceptionDuplicateId;
import repository.RepositoryPerson;


public class ServicePerson {

    private RepositoryPerson repository = new RepositoryPerson();

    public void register(EntitiesPerson p)
        throws ExceptionDuplicateId {

            if (repository.search(p.getId()) != null) {

                throw new ExceptionDuplicateId(
                        "Ya existe un dueño con esa cédula");
            }
            if (!p.getEmail().contains("@")) {

                throw new IllegalArgumentException(
                        "El email debe contener @");
            }
        repository.save(p);
    }
}

