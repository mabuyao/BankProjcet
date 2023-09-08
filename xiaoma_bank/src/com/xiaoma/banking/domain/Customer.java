package com.xiaoma.banking.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: Customer
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/7 16:46
 * @Version 1.0
 */

/*
修改 Customer 类来处理具有多种类型的联合账户。
（例如用数组表示多重性一节所作的，该类必须包括以下的公有方法：
addAccount(Account)，getAccount(int)和 getNumOfAccounts()。
每个 Customer 可以有多个 Account。（声明至少有 5 个）
 */
public class Customer {
    //声明三个私有对象属性：firstName、lastName 和 account
    private String firstName;
    private String lastName;
//    private SavingAccount savingAccount;
//    private CheckingAccount checkingAccount;

    // 修改 Customer 类，使用 ArrayList 实现多重的账户关系。修改方法同Bank
    private List<Account> accounts;

    //声明一个公有构造器，这个构造器带有两个代表对象属性的参数（firstName 和 lastName）
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new ArrayList<>();
    }

    //声明两个公有存取器来访问该对象属性，方法 getFirstName 和 getLastName返回相应的属性
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//    public SavingAccount getSavings() {
//        return savingAccount;
//    }
//
//    public void setSavings(SavingAccount savingAccount) {
//        this.savingAccount = savingAccount;
//    }
//
//    public CheckingAccount getChecking() {
//        return checkingAccount;
//    }
//
//    public void setChecking(CheckingAccount checkingAccount) {
//        this.checkingAccount = checkingAccount;
//    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    //声明 getAccount 方法以获取 account 属性
    public Account getAccount(int index) {
        return accounts.get(index);
    }

    public int getNumOfAccounts(){
        return accounts.size();
    }

    public Iterator<Account> getAccounts(){
        return accounts.iterator();
    }

    //声明 setAccount 方法来对 account 属性赋值
//    public void setAccount(Account account) {
//        this.account = account;
//    }
}
