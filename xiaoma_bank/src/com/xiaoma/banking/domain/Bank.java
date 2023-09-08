package com.xiaoma.banking.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: Bank
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/7 17:20
 * @Version 1.0
 */
public class Bank {
    //为 Bank 类 增 加 两 个 属 性 ： customers(Customer对象的数组 ) 和
    //numberOfCustomers(整数，跟踪下一个 customers 数组索引)
//    private Customer[] customers;
    //将 Customer 属性的声明修改为List 类型，不再使用
    //numberOfCustomers 属性
    private List<Customer> customers;
//    private int numberOfCustomer;
    //单个的实例应是静态属性，且为私有。同样，Bank 构造器也应该是私有的
    private static Bank bank = new Bank();

    //添加公有构造器，以合适的最大尺寸（至少大于 5）初始化 customers 数组。
    //修改 Bank 构造器，将 customers 属性的声明修改为List 类型，不再使用
    //numberOfcustomers 属性
    private Bank() {
        customers = new ArrayList<>();
    }

    //修改 Bank 类，创建名为 getBanking 的公有静态方法，它返回一个 Bank
    //类的实例。
    public static Bank getBank(){
        return bank;
    }

    //添加 addCustomer 方法。该方法必须依照参数（姓，名）构造一个新的Customer对象
    //然后把它放到 customer 数组中。还必须把 numberofCustomers属性的值加 1。
    //修改 addCustomer 方法，使用 add 方法
    public void addCustomer(String f,String l){
        customers.add(new Customer(f,l));
    }

    //添加 getNumOfCustomers 访问方法，它返回 numberofCustomers 属性值。
//    public int getNumOfCustomers(){
//        return numberOfCustomer;
//    }

    //修改 getNumofCustomer 方法，使用 size 方法
    public int getNumOfCustomers(){
        return customers.size();
    }



    //添加 getCustomer方法。它返回与给出的index参数相关的客户。
//    public Customer getCustomer(int index){
//        return customers[index];
//    }

    //修改 getCustomer 方法，使用 get 方法
    public Customer getCustomer(int index){
        return customers.get(index);
    }

    public Iterator<Customer> getCustomers(){
        return customers.iterator();
    }
}
