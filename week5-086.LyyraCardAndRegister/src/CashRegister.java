
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        double economical = 2.5;
        if (cashGiven >= economical) {
            cashInRegister += economical;
            economicalSold++;
            return cashGiven - economical;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        double gourmet = 4;
        if (cashGiven >= gourmet) {
            cashInRegister += gourmet;
            gourmetSold++;
            return cashGiven - gourmet;
        } else {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        double economical = 2.5;
        if (card.balance() >= economical) {
            economicalSold++;
            card.pay(economical);
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        double gourmet = 4;
        if (card.balance() >= gourmet) {
            gourmetSold++;
            card.pay(gourmet);
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
