package InterfaceATM;

/**
 * Created by mingyuanli on 15/11/13.
 */
public interface ATM
{
    boolean verifyPIN(String pin);
    String selectAccount();
    boolean withDraw(String account, double amount);
    void display(String account, double amount, boolean success);
    void display(String pin, boolean success);
    void showBalance(String amount);
}
