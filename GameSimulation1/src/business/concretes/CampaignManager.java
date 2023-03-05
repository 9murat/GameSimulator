package business.concretes;

import business.abstracts.ICampaignSeervice;
import entities.concretes.Campaign;

public class CampaignManager implements ICampaignSeervice {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" isimli kampanya "+ campaign.getCampaignDiscount()+ " indirimi ile eklendi");
    }
}
