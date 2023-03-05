package entities.concretes;

public class Gamer {
    private String tcKimlikNo;
    private String name;
    private String lastName;
    private String dogumYılı;
    private  double totalBalance;

    public Gamer() {
    }

    public Gamer(String tcKimlikNo, String name, String lastName, String dogumYılı,double totalBalance) {
        this.setTcKimlikNo(tcKimlikNo);
        this.setName(name);
        this.setLastName(lastName);
        this.setDogumYılı(dogumYılı);
        this.setTotalBalance(totalBalance);
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDogumYılı() {
        return dogumYılı;
    }

    public void setDogumYılı(String dogumYılı) {
        this.dogumYılı = dogumYılı;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
}
