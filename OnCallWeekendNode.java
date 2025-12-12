public class OnCallWeekendNode extends StoryNode {

    public OnCallWeekendNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public String getSceneText(Employee emp) {
        return "The systems go down on Friday night, and "
             + emp.getFullName() + " volunteers to cover the on-call weekend. "
             + emp.getSubj() + " juggle tickets, phone calls, and status updates.";
    }
}

