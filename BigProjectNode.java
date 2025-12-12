public class BigProjectNode extends StoryNode {

    public BigProjectNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public String getSceneText(Employee emp) {
        return "You take on the big project. It’s challenging, "
             + "but your hard work impresses your boss!";
    }
}

