public class MentorAwardEndingNode extends StoryNode {

    public MentorAwardEndingNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public String getSceneText(Employee emp) {
        return "Months later, the company hosts an awards breakfast. "
             + emp.getFullName() + " is surprised to hear "
             + emp.getSubj() + " name called for "
             + "\"Mentor of the Year\". The new hires give a standing ovation.";
    }
}
