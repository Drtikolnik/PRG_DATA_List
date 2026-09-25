package obousmerny;

public class Ukol02 {
    void main(){

        MyLinkedListObousmerny list = new MyLinkedListObousmerny();

// přidání prvků
        list.add("chtěl bych být stále mlááááááááád", "karel Ghot", 3.30);
        list.add("ššš, ššš, šššššššš šepotá", "nevim", 999999999);
        list.add("Erika", "buhví", 19.45);

        list.addFirst("nnnnn", "i", 69);

        list.printAll();

        list.addToPosition(2, "OOOO", "OO", 5);

//odstraňování prvků
        //list.removeFirst();
        list.removeFromPosition(4);

// výpis prvků
        list.printAll();
        list.playFirst();
        list.playOnPosition(2);
        list.playNext();
        list.playPrev();











    }

















}
