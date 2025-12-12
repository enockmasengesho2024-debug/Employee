public class PromotionEndingNode extends StoryNode {

    public PromotionEndingNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public String getSceneText(Employee emp) {
        return "A week later, your manager calls you into the office. "
             + "Because of the successful project, " + emp.getFullName()
             + " is officially promoted! The whole team celebrates "
             + emp.getPossAdj() + " new role.";
    }
}

