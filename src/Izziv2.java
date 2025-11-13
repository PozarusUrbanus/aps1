public class Izziv2 {
    public static void main(String[] args) throws CollectionException {
        Stack<String> s = new ArrayDeque<>();
        Deque<String> d = new ArrayDeque<>();
        Sequence<String> z = new ArrayDeque<>();

        s.push("ABC");
        s.push("DEF");
        s.push("GHI");

        System.out.println("Sklad: ");
        while (!s.isEmpty()) {
            System.out.println(s.top() + " ");
            d.enqueueFront(s.pop());
        }
    }
}
