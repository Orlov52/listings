package list2;
// вычисление длины гипотенузы по теореме Пифагора
class HypotDemo {
    public static void main(String[] args) {
        double cathetus1, cathetus2, hypot;
        cathetus1=3; //длина первого катета
        cathetus2=4; //длина второго катета
        hypot=Math.sqrt((cathetus1*cathetus1)+(cathetus2*cathetus2));
        System.out.println(" длинна гипотенузы равна "+hypot);
    }//main(String[])
}//class HypotDemo