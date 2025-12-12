public class LateNightNode extends StoryNode {

    public LateNightNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public String getSceneText(Employee emp) {
        return "You decide to stay late to finish the project. "
             + emp.getSubj() + " work through the evening, "
             + "double-checking every detail before " + emp.getObj()
             + " finally head home.";
    }
}
