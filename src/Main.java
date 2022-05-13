public class Main {
    public static void main(String[] args) {
        Phone P1 = new Phone(8550066, "Xiomi 10A", "djek", 0.140);
        Phone P3 = new Phone(2455788, "Xiomi readmi 9");


        P1.reciveCall(P1.ownerName);
        P1.reciveCall(P1.ownerName);
        P1.reciveCall(P1.ownerName);


        P1.receiveCall(P1.ownerName, Phone1.number);


        System.out.println(P1.getNumber());;


        Phone1.receiveMessage("hi world");
    }
}