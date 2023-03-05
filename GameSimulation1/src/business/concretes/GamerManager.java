package business.concretes;

import business.abstracts.GamerService;
import dataAccess.abstracts.IUserValidationService;
import dataAccess.concretes.UserValidation;
import entities.concretes.Gamer;

public class GamerManager implements GamerService {
   IUserValidationService iUserValidationService;

    public GamerManager(IUserValidationService iUserValidationService) {
        this.iUserValidationService = iUserValidationService;
    }


    @Override
    public void addGamer(Gamer gamer) {
        if (iUserValidationService.validate(gamer)){
            System.out.println(gamer.getName()+ " Oyunucusu eklendi");
        }
        else {
            System.out.println("Oyuncu kaydedilemedi");
        }
    }

}
