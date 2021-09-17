package edu.attractor;

public class Main {

    private static Key key1 = new Key("K1", "AAA,BBB,CCC");
    private static Key key2 = new Key("K2", "AAA,BBB");
    private static Key key3 = new Key("K3", "AAA,DDD");
    private static Key key4 = new Key("K4", "AAA,2,01/01/2015");
    private static Key key5 = new Key("K5", "3,ZZZ,5623");

    public static void main(String args[]) {

        print();





    }

    private static void print(){
        System.out.println("Key Value");
        System.out.println(key1.getKey() +"  "+ key1.getValue());
        System.out.println(key2.getKey() +"  "+ key2.getValue());
        System.out.println(key3.getKey() +"  "+ key3.getValue());
        System.out.println(key4.getKey() +"  "+ key4.getValue());
        System.out.println(key5.getKey() +"  "+ key5.getValue());
    }
}