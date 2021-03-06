package net.robbytu.hanze.kantine;/* vim: set expandtab tabstop=4 shiftwidth=4 softtabstop=4: */

/**
 * CashPaymentMethod
 *
 * @author R. de Vries <r.devries@robbytu.net>
 * @version 1.0.0
 * @date 06-01-15
 * @copyright 2014 RobbytuProjects
 * @license MIT License
 */
public class CashPaymentMethod extends PaymentMethod {

    /**
     * Perform a payment
     * @param due Amount due
     * @return Wether or not the payment succeeded
     */
    @Override
    public void pay(double due) throws TooLittleMoneyException
    {
        // Check if we can afford this...
        if(due <= this.balance) {
            this.balance -= due;
        }
        else {
            // Seems like we can't
            throw new TooLittleMoneyException();
        }
    }

}
