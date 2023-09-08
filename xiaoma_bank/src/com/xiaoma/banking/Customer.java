package com.xiaoma.banking;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

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
    private Account[] accounts;
    private int numberOfAccounts;

    {
        accounts = new Account[5];
    }

    //声明一个公有构造器，这个构造器带有两个代表对象属性的参数（firstName 和 lastName）
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //声明两个公有存取器来访问该对象属性，方法 getFirstName 和 getLastName返回相应的属性
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account account){
        accounts[numberOfAccounts] = account;
        numberOfAccounts++;
    }

    //声明 getAccount 方法以获取 account 属性
    public Account getAccount(int index) {
        return accounts[index];
    }

    public int getNumOfAccounts(){
        return numberOfAccounts;
    }

    //声明 setAccount 方法来对 account 属性赋值
//    public void setAccount(Account account) {
//        this.account = account;
//    }
}
