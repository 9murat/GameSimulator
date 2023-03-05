package dataAccess.abstracts;

import entities.concretes.Gamer;

public interface IUserValidationService {
    boolean validate(Gamer gamer);
}
