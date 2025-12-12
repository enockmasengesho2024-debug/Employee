public class FixIssueNode extends StoryNode {

    public FixIssueNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public String getSceneText(Employee emp) {
        return "You solved a critical system issue! "
             + "The IT team celebrates your quick thinking.";
    }
}


