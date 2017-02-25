package Programming1_1;

/**
 * Created by mingyuanli on 15/11/13.
 */
public class ATMbankAmerica
{
    private String pin;

    public boolean verifyPIN(String pin)
    {
        if (this.pin.equals(pin))
            return true;
        else
            return false;
    }
}
