package com.kemp.testjava;

/**
 * Created by wangkp on 2017/12/7.
 */
public class TestException {
    public static void main(String[] args) {
        test1();
    }

    private static void test1(){
        try {
            try {
                throw new Sneeze();
            } catch (Annoyance a) {
//                if(a instanceof Sneeze){
//                    System.out.println("a instanceof Sneeze");
//                }
                System.out.println("Caught Annoyance");
                throw a;
            }
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
            return;
        } finally {
            System.out.println("Hello World!");
        }
    }

    private static void test2(){
        int $aaa = 1;
        Aa a = new SubAa();
//        a.foo();����ʧ��
    }
}

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}

class Aa {

    void foo() throws Exception{
        throw new Exception();
    }
}

class SubAa extends Aa{
    void foo(){
        System.out.println("A ");
    }
}
