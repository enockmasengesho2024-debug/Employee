public class TrainingNode extends StoryNode {

    public TrainingNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public String getSceneText(Employee emp) {
        return "You patiently help train a new employee. "
             + "They’re grateful and you gain a new friend.";
    }
}
