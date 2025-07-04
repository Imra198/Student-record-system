
public class Server {


    private Node[] nodes;
    private int currentIndex = 0;

    public Server(int size)   {
        nodes = new Node[size];
    }

    public int size() { return nodes.length; }

    public void add(Node n){
        nodes[currentIndex] = n;
        if(currentIndex < size()) currentIndex++;
    }

    public String toString() {

        String s = "";

        for(Node n : nodes){
            s += n.toString() + "\n";
        }

        return s;
    }

}