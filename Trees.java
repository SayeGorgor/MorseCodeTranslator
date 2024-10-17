import java.util.HashMap;
import java.util.Scanner;

public class Trees {
    private static Node root;
        Trees(String key, int keyNumber) {
            root = new Node(key, keyNumber);
        }
        Trees() {
            root = null;
        }
        public static void main(String[] args) {
            Trees tree = new Trees();
            //Morse Hashmap for tree traversal
            HashMap<String, Integer> morseMap = new HashMap<>();
            morseMap.put("E", 1);
            morseMap.put("T", 20);
            morseMap.put("I", 2);
            morseMap.put("A", 12);
            morseMap.put("N", 21);
            morseMap.put("M", 31);
            morseMap.put("S", 3);
            morseMap.put("U", 9);
            morseMap.put("R", 13);
            morseMap.put("W", 16);
            morseMap.put("D", 22);
            morseMap.put("K", 28);
            morseMap.put("G", 32);
            morseMap.put("O", 36);
            morseMap.put("H", 4);
            morseMap.put("V", 7);
            morseMap.put("F", 10);
            morseMap.put("L", 14);
            morseMap.put("P", 17);
            morseMap.put("J", 18);
            morseMap.put("B", 23);
            morseMap.put("X", 26);
            morseMap.put("C", 29);
            morseMap.put("Y", 30);
            morseMap.put("Z", 33);
            morseMap.put("Q", 35);
            morseMap.put("5", 5);
            morseMap.put("4", 6);
            morseMap.put("3", 8);
            morseMap.put("2", 11);
            morseMap.put("+", 15);
            morseMap.put("1", 19);
            morseMap.put("6", 24);
            morseMap.put("=", 25);
            morseMap.put("/", 27);
            morseMap.put("7", 34);
            morseMap.put("8", 37);
            morseMap.put("9", 38);
            morseMap.put("0", 39);
            //Morse Tree
            tree.root = new Node(null, -1);
            tree.root.left = new Node("E", 1);
            tree.root.right = new Node("T", 20);
            tree.root.left.left = new Node("I", 2);
            tree.root.left.right = new Node("A", 12);
            tree.root.right.left = new Node("N", 21);
            tree.root.right.right = new Node("M", 31);
            tree.root.left.left.left = new Node("S", 3);
            tree.root.left.left.right = new Node("U", 9);
            tree.root.left.right.left = new Node("R", 13);
            tree.root.left.right.right = new Node("W", 16);
            tree.root.right.left.left = new Node("D", 22);
            tree.root.right.left.right = new Node("K", 28);
            tree.root.right.right.left = new Node("G", 32);
            tree.root.right.right.right = new Node("O", 36);
            tree.root.left.left.left.left = new Node("H", 4);
            tree.root.left.left.left.right = new Node("V", 7);
            tree.root.left.left.right.left = new Node("F", 10);
            tree.root.left.left.right.right = new Node(null, 41);
            tree.root.left.right.left.left = new Node("L", 14);
            tree.root.left.right.left.right = new Node(null, 41);
            tree.root.left.right.right.left = new Node("P", 17);
            tree.root.left.right.right.right = new Node("J", 18);
            tree.root.right.left.left.left = new Node("B", 23);
            tree.root.right.left.left.right = new Node("X", 26);
            tree.root.right.left.right.left = new Node("C", 29);
            tree.root.right.left.right.right = new Node("Y", 30);
            tree.root.right.right.left.left = new Node("Z", 33);
            tree.root.right.right.left.right = new Node("Q", 35);
            tree.root.right.right.right.left = new Node(null, 41);
            tree.root.right.right.right.right = new Node(null, 41);
            tree.root.left.left.left.left.left = new Node("5", 5);
            tree.root.left.left.left.left.right = new Node("4", 6);
            tree.root.left.left.left.right.right = new Node("3", 8);
            tree.root.left.left.right.right.right = new Node("2", 11);
            tree.root.left.right.left.right.left = new Node("+", 15);
            tree.root.left.right.right.right.right = new Node("1", 19);
            tree.root.right.left.left.left.left = new Node("6", 24);
            tree.root.right.left.left.left.right = new Node("=", 25);
            tree.root.right.left.left.right.left = new Node("/", 27);
            tree.root.right.right.left.left.left = new Node("7", 34);
            tree.root.right.right.right.left.left = new Node("8", 37);
            tree.root.right.right.right.right.left = new Node("9", 38);
            tree.root.right.right.right.right.right = new Node("0", 39);
            Scanner sc = new Scanner(System.in);
            boolean quit = false;
            int option;
            //Menu Loop
            do {
                System.out.print("1. Encode Message\n" +
                        "2. Decode Message\n" +
                        "3. Quit\n" +
                        "Please enter which number you would like to do: ");
                option = sc.nextInt();
                switch(option) {
                    case 1:
                        System.out.print("Please enter a message to encode: ");
                        String message = sc.next();
                        System.out.println("Your encoded message is: " + encode(message, morseMap));
                        break;
                    case 2:
                        System.out.print("Please enter a message to decode(include spaces between morse letters): ");
                        String morseMessage = sc.nextLine();
                        morseMessage = sc.nextLine();
                        System.out.println("Your decoded message is: " + decode(morseMessage));
                        break;
                    case 3:
                        quit = true;
                        break;
                }
            }while(!quit);
        }
    static class Node {

        HashMap<String, Integer> key = new HashMap<>();
        String item;
        int itemNumber;

        Node left;
        Node right;
        //Constructor for node class
        public Node(String item, int itemNumber)
        {
            this.item = item;
            this.itemNumber = itemNumber;
            key.put(item, itemNumber);
            left = null;
            right = null;
        }
        public Node getLeft() {
            return left;
        }
        public Node getRight() {
            return right;
        }
        //method to return the item number
        public int getMorseID() {
            return itemNumber;
        }
        //method to return the value
        public String getValue() {
            return item;
        }
    }
    public static String encode(String s, HashMap<String, Integer> map) {
            Node current = root;
            char[] cArray = s.toUpperCase().toCharArray();
            String message = "";
            String s1 = "";
            //searches the morse tree for each letter and adds its value to the message
            for(int i = 0; i < cArray.length; i++) {
                message = message.concat(encodeSearch(current, cArray[i], s1, map)) + " ";
            }
            return message;
    }
    public static String encodeSearch(Node current, char letter, String s, HashMap<String, Integer> map) {
        int letterID = map.get(String.valueOf(letter).toUpperCase());
        if(current.getMorseID() == map.get(String.valueOf(letter).toUpperCase())) {//Base case
            return s;
        } else if(current.getMorseID() > 40) {//repoints if value is null
            if(current.getLeft() != null) {
                return encodeSearch(current.getLeft(), letter, s + ".", map);
            } else {
                return encodeSearch(current.getRight(), letter, s + "-", map);
            }
        }else if(current.getRight() != null && letterID < current.getRight().getMorseID()) {
            return encodeSearch(current.getLeft(), letter, s + ".", map);
        } else if(current.getLeft() != null && letterID > current.getLeft().getMorseID()) {
            return encodeSearch(current.getRight(), letter, s + "-", map);
        }
        return s;
    }

    public static String decode(String s) {//uses the dots and dashes as a guide to find the value in tree
            char[] cArray = s.toCharArray();
            Node current = root;
            String message = "";
            for(int i = 0; i < cArray.length; i++) {
                switch(cArray[i]) {
                    case '-':
                        current = current.getRight();
                        break;
                    case '.':
                        current = current.getLeft();
                        break;
                    case ' ':
                        message += current.getValue();
                        current = root;
                        break;
                }
                if(i == cArray.length - 1) {
                    message += current.getValue();
                }
            }
            return message;
    }
}
