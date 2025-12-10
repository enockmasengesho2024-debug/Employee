public class BigProjectNode extends StoryNode {

    public BigProjectNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public void play(Employee emp) {
        System.out.println("You take on the big project. It’s challenging, "
                + "but your hard work impresses your boss!");
    }
}

