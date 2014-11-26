package net.robbytu.hanze.kantine;/* vim: set expandtab tabstop=4 shiftwidth=4 softtabstop=4: */

/**
 * CashRegister
 *
 * @author R. de Vries <r.devries@robbytu.net>
 * @version 1.0.0
 * @date 26-11-14
 * @copyright 2014 RobbytuProjects
 * @license MIT License
 */
public class CashRegister {
    CheckoutLine line;
    int amountOfArticles;
    double amountOfMoney;

    /**
     * Initializes a new instance of the CashRegister class
     * @param line Corresponding CheckoutLine
     */
    public CashRegister(CheckoutLine line) {
        this.line = line;

        this.resetRegister();
    }

    /**
     * Do a checkout for specified person
     * @param person Person to check out
     */
    public void checkout(Person person) {
        int amountOfArticles = person.getAmountOfArticles();
        double grandtotalPrice = person.getGrandTotal();

        this.amountOfArticles += amountOfArticles;
        this.amountOfMoney += grandtotalPrice;
    }

    /**
     * Returns the amount of articles that have passed the register since the last reset
     * @return Amount of articles that have have passed the register
     */
    public int getAmountOfArticles() {
        return this.amountOfArticles;
    }

    /**
     * Returns the amount of money in the register since the last reset
     * @return Amount of money in the register
     */
    public double getAmountOfMoney() {
        return this.amountOfMoney;
    }

    /**
     * Resets all counters
     */
    public void resetRegister() {
        this.amountOfArticles = 0;
        this.amountOfMoney = 0;
    }
}