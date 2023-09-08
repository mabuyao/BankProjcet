package com.xiaoma.banking;

/**
 * ClassName: CheckingAccount
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/7 17:31
 * @Version 1.0
 */
//CheckingAccount 类必须扩展 Account 类
public class CheckingAccount extends Account{
    // 该类必须包含一个类型为 double 的 overdraftProtection 属性
    private double overdraftProtection;

    //该类必须包含一个带有参数（balance）的共有构造器。该构造器必须通过调
    //用 super(balance)将 balance 参数传递给父类构造器。

    public CheckingAccount(double balance) {
        super(balance);
    }

    //给类必须包括另一个带有两个参数（balance 和 protect）的公有构造器。该
    //构造器必须通过调用 super(balance)并设置 overdragtProtection 属性，
    //将 balance 参数传递给父类构造器。
    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    //CheckingAccount 类必须覆盖 withdraw 方法。此方法必须执行下列检
    //查。如 果当前余额足够弥补取款 amount,则正常进行。如果不够弥补但是
    //存在透支 保护，则尝试用 overdraftProtection 得值来弥补该差值
    //（balance-amount）. 如果弥补该透支所需要的金额大于当前的保护级别。
    //则整个交易失败，但余 额未受影响。

    @Override
    public boolean withdraw(double amt) {
        if(amt > 0 && balance >= amt){
            balance -= amt;
            return true;
        }else if(amt >= 0 && balance + overdraftProtection >= amt){
            overdraftProtection -= (amt - balance);
            balance = 0;
            return true;
        }else {
            System.out.println("请输入正确的金额");
            return false;
        }
    }
}
