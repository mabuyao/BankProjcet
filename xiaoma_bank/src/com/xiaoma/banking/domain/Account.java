package com.xiaoma.banking.domain;

/**
 * ClassName: Account
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/7 16:29
 * @Version 1.0
 */
public class Account {
    //声明一个私有对象属性：balance，这个属性保留了银行帐户的当前（或 即时）余额。
    //修改 Account 类；将 balance 属性的访问方式改为 protected
    protected double balance;

    //声明一个带有一个参数（ balance ）的公有构造器 ，这个参数为balance 属性赋值。
    public Account(double balance) {
        this.balance = balance;
    }

    //声明一个公有方法 getBalance，该方法用于获取账户余额
    public double getBalance() {
        return balance;
    }

    //声明一个公有方法 deposit,该方法向当前余额增加金额。
    public boolean deposit(double amt){
        if(amt >= 0){
            balance += amt;
            return true;
        }else {
            System.out.println("请输入正确的金额");
            return false;
        }
    }

    //声明一个公有方法 withdraw 从当前余额中减去金额。
    //重写 withdraw 方法使它不返回值（即 void）.声明方法抛出overdraftException
    //修改代码抛出新异常，指明“资金不足”以及不足数额（当前余额扣除请求的数额）
    public void withdraw(double amt) throws OverdraftException {
        if(amt >= 0 && balance >= amt){
            balance -= amt;
        }else {
            throw new OverdraftException("资金不足", amt - balance);
        }
    }
}
