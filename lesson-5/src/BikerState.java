public class BikerState {
    public static void main(String[] args) {
Biker biker = new Biker("Vaso", 180);
Caretaker caretaker = new Caretaker();

caretaker.setMemento(biker.save());
biker.restore(caretaker.getMemento());
    }
}
