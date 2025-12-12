public class WellnessChampionEndingNode extends StoryNode {

    public WellnessChampionEndingNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public String getSceneText(Employee emp) {
        return "At the next all-hands meeting, leadership announces a new "
             + "\"Wellness Champion\" recognition. "
             + emp.getFullName() + " receives the award for helping the "
             + "office feel healthier, kinder, and more connected.";
    }
}
