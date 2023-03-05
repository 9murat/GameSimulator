package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public interface IGameSaleService {
    void saleGame(Game game, Campaign campaign, Gamer gamer);
}
