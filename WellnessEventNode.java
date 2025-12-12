public class WellnessEventNode extends StoryNode {

    public WellnessEventNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public String getSceneText(Employee emp) {
        return "You lead a company wellness event. "
             + "The office is full of energy and positivity!";
    }
}
