package obousmerny;

import jednosmerny.Uloha;

public class MyLinkedListObousmerny {

    private Node head; // začátek seznamu
    private Node tail; // konec seznamu
    private Node currentPlay;
    // Přidání nového prvku na konec seznamu
    public void add(String nazev, String interpret, double cas) {
        Song song = new Song(nazev, interpret, cas);
        Node newNode = new Node(song);
        if (tail == null) { // seznam je prázdný
            head = newNode; // nový uzel je první...
            tail = newNode; // ...a zároveň poslední
            return;
        }

// propojení starého konce a nového uzlu
        tail.setNext(newNode);
        newNode.setPrev(tail);
// aktualizace ukazatele tail
        tail = newNode;
    }

    // Výpis všech prvků od začátku
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " <-> ");
            current = current.getNext();
        }
        System.out.println();
    }


//Přidej song na začátek playlistu
    public void addFirst(String nazev, String interpret, double cas) {
        Song s = new Song(nazev, interpret, cas);
        obousmerny.Node newNode = new obousmerny.Node(s);

        if (head == null) { // pokud je seznam prázdný
            head = newNode; // nový prvek je zároveň první
            tail = newNode;
        }

        newNode.setNext(head);
        head.setPrev(newNode);
        head = newNode;

    }

//Přehraj první song playlistu - vypiš název a stopáž
    public void playFirst(){
        System.out.println("Přehrává se: " +head.getData().getNazev()+ " - " +head.getData().getDelka());
        currentPlay = head;

    }

//Přehraj píseň na určité pozici - vypiš název a stopáž
    public void playOnPosition(int position){
        if (position==1) {
            System.out.println("Přehrává se: " +head.getData().getNazev()+ " - " +head.getData().getDelka());
            currentPlay = head;
        }else{
            position = position - 1;
            obousmerny.Node current = head;

            if (head == null) {
                IO.println("Seznam neobsahuje žádné prvky");
            }else{
                for (int i = 0; i < position; i++) {
                    current = current.getNext();
                }
                System.out.println("Přehrává se: " +current.getData().getNazev()+ " - " +current.getData().getDelka());
                currentPlay = current;

            }
        }

    }

//Přepni a přehraj na další song - vypiš název a stopáž
    public void playNext(){
        if (currentPlay==null){
            playFirst();
        } else if (currentPlay.getNext()==null) {
            playFirst();
        }else{
            currentPlay = currentPlay.getNext();
            System.out.println("Přehrává se: " +currentPlay.getData().getNazev()+ " - " +currentPlay.getData().getDelka());
        }

    }


//Přepni a přehraj na předchozí song - vypiš název a stopáž
    public void playPrev(){
        if (currentPlay==null){
            playFirst();
        } else if (currentPlay.getPrev()==null) {
            playFirst();
        }else{
            currentPlay = currentPlay.getPrev();
            System.out.println("Přehrává se: " +currentPlay.getData().getNazev()+ " - " +currentPlay.getData().getDelka());
        }

    }

//Odeber první song
    public void removeFirst() {

        if (head == null) {
            IO.println("Seznam neobsahuje žádné prvky");
        }else{
            head = head.getNext();
        }
    }

//Odeber píseň z určité pozice
    public void removeFromPosition(int position) {
        if (position==1) {
            removeFirst();
        }else{
            position = position - 2;
            obousmerny.Node current = head;

            if (head == null) {
                //IO.println("Seznam neobsahuje žádné prvky");
            }else{
                for (int i = 0; i < position; i++) {
                    current = current.getNext();
                }

                current.setNext(current.getNext().getNext());
                current.setPrev(current.getPrev().getPrev());

            }
        }

    }

//Přidej píseň na určitou pozici
    //nefunguje uplne
public void addToPosition(int position, String nazev, String interpret, double cas) {
    Song s = new Song(nazev, interpret, cas);
    obousmerny.Node newNode = new obousmerny.Node(s);
    obousmerny.Node current = head;

    if (head == null) { // pokud je seznam prázdný
        add(nazev, interpret, cas);
    }else{
        if (position==1) {
            addFirst(nazev, interpret, cas);
        }else {
            position = position - 2;
            for (int i = 0; i < position; i++) {
                current = current.getNext();
            }

            newNode.setNext(current.getNext());
            newNode.setPrev(current.getPrev());
            current.setNext(newNode);
        }
    }

}














}
