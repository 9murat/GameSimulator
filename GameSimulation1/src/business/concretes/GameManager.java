package business.concretes;

import business.abstracts.IGameService;
import entities.concretes.Game;

public class GameManager implements IGameService {
    @Override
    public void addGame(Game game) {
        System.out.println(game.getGameName()+" isimli oyun"+ game.getGamePrice()+ " fiyatı ile eklendi");
    }
}
