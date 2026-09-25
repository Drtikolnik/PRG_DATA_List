package jednosmerny;

public class Ukol01 {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

// přidání prvků
        list.add("Naucit se AI", 4);
        list.add("Naucit se JAVAFX", 4);
        list.add("Zdokumentovat JavaFX", 3);
        list.add("Zdokumentovat AI", 2);
        list.addFirst("chci byt prvni", 1);
        list.removeFirst();

        list.removeFromPosition(1);
        list.addToPosition(1, "kk mam byt druhej", 4);

        list.removeFromPosition(3);



// výpis prvků
        list.printAll();
        list.printPriority(3);
    }












}
