package com.xiaoma.banking.domain;

/**
 * ClassName: SavingAccount
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/7 17:30
 * @Version 1.0
 */
//创建 SavingAccount 类，该类继承 Account 类
public class SavingAccount extends Account {
    //该类必须包含一个类型为 double 的 interestRate 属性
    private double interestRate;

    //该类必须包括带有两个参数（balance 和 interestRate）的公有构造器。
    //该构造器必须通过调用 super(balance)将 balance 参数传递给父类构造器。
    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
