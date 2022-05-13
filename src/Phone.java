public class Phone {
    public int number;
    String model;
    public String ownerName;
    double weight;
    ///////////////////////////////////////////////////////////
    public Phone() {
    }
    public Phone(int number, String model, String ownerName, double weight) {
        this.number = number;
        this.model = model;
        this.ownerName = ownerName;
        this.weight = weight;
    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    //////////////////////////////////////////////////////////////////
    public void reciveCall(String ownerName) {
        System.out.println("Calling: " + ownerName);
    }
    public int getNumber() {
        return number;
    }
    public void receiveCall(String ownerName, int number) {
    }
    /////////////////////////////////////////////////////////////////
    public void sendMessage(Phone a, String message){
        a.receiveMessage(message);
    }
    public void receiveMessage(String message){
        System.out.println(message);
    }
}









