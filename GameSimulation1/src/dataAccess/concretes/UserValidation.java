package dataAccess.concretes;

import dataAccess.abstracts.IUserValidationService;
import entities.concretes.Gamer;

public class UserValidation implements IUserValidationService {


    @Override
    public boolean validate(Gamer gamer) {
        if (gamer.getTcKimlikNo()=="1999"&&gamer.getName()=="Murat"&&gamer.getLastName()=="Oncel"){
            return true;
        }
        else {
            return false;
        }

    }

}
