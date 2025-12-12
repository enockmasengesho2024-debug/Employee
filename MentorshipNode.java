public class MentorshipNode extends StoryNode {

    public MentorshipNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public String getSceneText(Employee emp) {
        return emp.getFullName()
             + " decides to mentor a new teammate. "
             + "Together, " + emp.getSubj()
             + " walk through daily tasks, answer questions, "
             + "and build confidence on the team.";
    }
}
