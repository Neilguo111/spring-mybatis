package com.neil.mybatis;

/**
 * 测试switch语句是否有跳过的情况
 * php中switch入参为0则直接判断失败，进入default代码块
 */
public class SwitchCaseTest {

    public static void main(String[] args) {
        int d = 0;
        switch (d){
            case 0:
                System.out.println("等于0");
                break;
            case 1:
                System.out.println("等于1");
                break;
            case 2:
                System.out.println("等于2");
                default:
                    System.out.println("default");
        }
    }

}
