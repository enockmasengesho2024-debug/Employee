public class IdeaMeetingNode extends StoryNode {

    public IdeaMeetingNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public String getSceneText(Employee emp) {
        return "Your ideas in the meeting inspire the team "
             + "to create a new product!";
    }
}

