//Creates a Node
public class Node {
	
	int key;
	String name;
	boolean visited;

	Node leftChild;
	Node rightChild;

	Node(int key, String name) {

		this.key = key;
		this.name = name;

	}

	public String toString() {

		return name + " has the key " + key;
    }
	
	public static void main(String[] args) {
		
		Node firstNode = new Node(0, "A");
		String result = firstNode.toString();
		System.out.println(result);
	}
}
