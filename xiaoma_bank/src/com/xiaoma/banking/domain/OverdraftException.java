package com.xiaoma.banking.domain;

/**
 * ClassName: OverdraftException
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/8 10:41
 * @Version 1.0
 */
//在 banking.domain 包中建立一个共有类 OverdraftException. 这个类
//扩展 Exception 类。
public class OverdraftException extends Exception{
    static final long serialVersionUID = -33875229948L;
    //添加一个 double 类型的私有属性 deficit.增加一个共有访问方法
    //getDeficit
    private double deficit;

    public double getDeficit() {
        return deficit;
    }

    //添加一个有两个参数的共有构造器。deficit 参数初始化 deficit 属性
    public OverdraftException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }
}
