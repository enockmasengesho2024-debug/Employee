public class BurnoutEndingNode extends StoryNode {

    public BurnoutEndingNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public String getSceneText(Employee emp) {
        return "By Monday, " + emp.getFullName()
             + " feels completely exhausted. The team schedules a check-in, "
             + "and together they design healthier boundaries and workload plans. "
             + "It’s a tough lesson about burnout, but an important one.";
    }
}

