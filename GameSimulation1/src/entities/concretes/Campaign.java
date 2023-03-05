package entities.concretes;

public class Campaign {
    private String campaignName;
    private double campaignDiscount;

    public Campaign() {
    }

    public Campaign(String campaignName, double campaignDiscount) {
        this.setCampaignName(campaignName);
      this.setCampaignDiscount(campaignDiscount);
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }


    public double getCampaignDiscount() {
        return campaignDiscount;
    }

    public void setCampaignDiscount(double campaignDiscount) {
        this.campaignDiscount = campaignDiscount;
    }
}