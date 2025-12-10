public class TrainingNode extends StoryNode {

    public TrainingNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public void play(Employee emp) {
        System.out.println("You patiently help train a new employee. "
                + "They’re grateful and you gain a new friend.");
    }
}

