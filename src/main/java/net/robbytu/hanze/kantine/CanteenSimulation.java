package net.robbytu.hanze.kantine;/* vim: set expandtab tabstop=4 shiftwidth=4 softtabstop=4: */

/**
 * CanteenSimulation
 *
 * @author R. de Vries <r.devries@robbytu.net>
 * @version 1.0.0
 * @date 26-11-14
 * @copyright 2014 RobbytuProjects
 * @license MIT License
 */
public class CanteenSimulation {

    private Canteen canteen;

    public CanteenSimulation() {
        this.canteen = new Canteen();
    }

    public void simulate(int days) {
        for(int currentDay = 0; currentDay < days; currentDay ++) {
            // Add people in line
            for(int personToLetIn = 0; personToLetIn < currentDay + 10; personToLetIn ++)
                this.canteen.addInLine();

            // Process those people
            this.canteen.processCheckoutLine();

            // Print today's profits
            int amountOfArticles = this.canteen.getAmountOfArticles();
            double amountOfMoney = this.canteen.getAmountOfMoneyInCashRegister();

            System.out.println(String.format("On day %d, %d articles were sold, resulting in a sales volume of € %.2f",
                                             currentDay + 1, amountOfArticles, amountOfMoney));
        }
    }

}