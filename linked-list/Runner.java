// import java.util.LinkedList;

public class Runner {
    public static void main(String[] arg) {
        Linklist list = new Linklist();
        list.show();
        list.insert(12);
        list.insert(213);
        list.insert(85);
        list.insert(1651);
        System.out.println("ONLY INSERT");
        list.show();

        list.insertAtStart(200);
        list.insertAtStart(200);
        list.insertAt(2, 250);
        System.out.println("ONLY INSERT more insert");
        list.show();
        list.deleteAt(0);
        list.deleteAt(1);
        list.deleteAt(2);
        list.deleteAt(3);
        list.deleteAt(4);
    }
}