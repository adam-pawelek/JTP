public class Main {

    public static void main(String[] args) {
        Anchor lista = new Anchor();
        lista.insertAtTheEnd(11);
        lista.insertAtTheEnd(12);
        lista.insertAtTheEnd(13);
        lista.insertAtTheEnd(14);
        System.out.println(lista.toString() + "\n");
        lista.insertAtTheFront(16);
        lista.printLinkedList();
        lista.removeLast();
        lista.printLinkedList();



        System.out.println("\n" +  lista.toString());
        lista.removeFirst();
        System.out.println("\n" +  lista.toString());
    }




}
