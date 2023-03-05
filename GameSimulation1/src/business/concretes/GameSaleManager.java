package business.concretes;

import business.abstracts.IGameSaleService;
import dataAccess.abstracts.IUserValidationService;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class GameSaleManager implements IGameSaleService {
    IUserValidationService iUserValidationService;

    public GameSaleManager(IUserValidationService iUserValidationService) {
        this.iUserValidationService = iUserValidationService;
    }

    @Override
    public void saleGame(Game game, Campaign campaign, Gamer gamer) {
        if (gamer.getTotalBalance() >= game.getGamePrice() && iUserValidationService.validate(gamer)) {
            System.out.println("Bakiye :" + gamer.getTotalBalance());
            System.out.println("Game Pice :" + game.getGamePrice());
            double newPrice = game.getGamePrice() - (game.getGamePrice() * campaign.getCampaignDiscount() / 100);
            System.out.println("New game price : " + newPrice);
            System.out.println(gamer.getName() + " isimli oyuncu " + game.getGameName() + " isimli oyunu " + newPrice + " fiyata satın aldı");
            System.out.println(" yeni bakiye :" + (gamer.getTotalBalance() - newPrice));

        }
        else if (gamer.getTotalBalance() <= game.getGamePrice() && !iUserValidationService.validate(gamer)) {
            System.out.println("Kimlik doğrulaması ve bakiye yetersiz  oldugu için satın alım gecersiz");
            System.out.println("Bakiye :" + gamer.getTotalBalance());
            System.out.println("Game Pice :" + game.getGamePrice());
            System.out.println("Kimlik doğrulaması ve bakiye yetersiz  oldugu için satın alım gecersiz");
        }
        else if (gamer.getTotalBalance() <= game.getGamePrice()) {
            System.out.println("Bakiye :" + gamer.getTotalBalance());
            System.out.println("Game Pice :" + game.getGamePrice());
            System.out.println("Bakiye az olduğu icin satın alım gecersiz");
        }
        else if (!iUserValidationService.validate(gamer)) {
            System.out.println("Kimlik doğrulaması yanlış oldugu için satın alım gecersiz");
        }
    }
}

