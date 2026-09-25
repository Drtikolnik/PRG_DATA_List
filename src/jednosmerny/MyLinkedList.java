package jednosmerny;

class MyLinkedList {
    private Node head; // začátek seznamu
    // přidání na konec seznamu
    public void add(String nazev, int priorita) {
        Uloha u = new Uloha(nazev, priorita);
        Node newNode = new Node(u);
        if (head == null) { // pokud je seznam prázdný
            head = newNode; // nový prvek je zároveň první
            return;
        }
        Node current = head;
        while (current.getNext() != null) { // projdu až na konec
            current = current.getNext();
        }
        current.setNext(newNode);       //current.setNext() = newNode; // připojím nový prvek

    }


    // přidání na začátek seznamu
    public void addFirst(String nazev, int priorita) {
        Uloha u = new Uloha(nazev, priorita);
        Node newNode = new Node(u);

        if (head == null) { // pokud je seznam prázdný
            head = newNode; // nový prvek je zároveň první
        }else{
          newNode.setNext(head);
          head = newNode;
        }
    }

    // odebrání prvínho prvku
    public void removeFirst() {

        if (head == null) {
            //IO.println("Seznam neobsahuje žádné prvky");
        }else{
            head = head.getNext();
        }
    }


    // odebrání prvku z pozice
    public void removeFromPosition(int position) {
        if (position==0) {
            removeFirst();
        }else{
            position = position - 1;
            Node current = head;

            if (head == null) {
                //IO.println("Seznam neobsahuje žádné prvky");
            }else{
                for (int i = 0; i < position; i++) {
                    current = current.getNext();
                }

                current.setNext(current.getNext().getNext());

            }
        }


    }


    //pridani prvku na pozici
    public void addToPosition(int position, String nazev, int priorita) {
        Uloha u = new Uloha(nazev, priorita);
        Node newNode = new Node(u);
        Node current = head;

        if (head == null) { // pokud je seznam prázdný
            head = newNode; // nový prvek je zároveň první
        }else{
            if (position==0) {
                addFirst(nazev, priorita);
            }else {
                position = position - 1;
                for (int i = 0; i < position; i++) {
                    current = current.getNext();
                }

                newNode.setNext(current.getNext());
                current.setNext(newNode);
            }
        }

    }


    // odebrání prvků s nazvem
    public void removeWithName(String nazev) {
        Node current = head;

        if (head == null) {
                //IO.println("Seznam neobsahuje žádné prvky");
        }else{
            while (current != null) {
                if (current.getData().getNazev().equals(nazev)) {
                    current.setNext(current.getNext().getNext());
                }
                current = current.getNext();

            }




        }

    }
















    // výpis všech prvků
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("");
    }


    // výpis prvků s urcitou prioritou
    public void printPriority(int priorita) {
        Node current = head;
        while (current != null) {
            if (current.getData().getPriorita() == priorita){
                System.out.print(current.getData() + " -> ");
            }
            current = current.getNext();
        }
        System.out.println("");
    }
}