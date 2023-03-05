import business.concretes.GameSaleManager;
import business.concretes.GamerManager;
import dataAccess.abstracts.IUserValidationService;
import dataAccess.concretes.UserValidation;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer("1999", "Murat", "Onceeel", "1999", 1200);

        Game game = new Game("Strike", 1000);

        Campaign kısKampanyası = new Campaign("Kıs Kampanyası ", 3);

        Campaign yazKampanyası = new Campaign("Yaz Kampanyası", 10);

        IUserValidationService iUserValidationService = new UserValidation();

        GamerManager gamerManager = new GamerManager(new UserValidation());
        gamerManager.addGamer(gamer);

        GameSaleManager gameSaleManager = new GameSaleManager(new UserValidation());
        gameSaleManager.saleGame(game, yazKampanyası, gamer);

    }
}