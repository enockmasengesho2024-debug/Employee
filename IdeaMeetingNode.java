public class IdeaMeetingNode extends StoryNode {

    public IdeaMeetingNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public void play(Employee emp) {
        System.out.println("Your ideas in the meeting inspire the team "
                + "to create a new product!");
    }
}

