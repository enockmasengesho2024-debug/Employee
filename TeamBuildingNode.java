public class TeamBuildingNode extends StoryNode {

    public TeamBuildingNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public String getSceneText(Employee emp) {
        return "After the wellness event, " + emp.getFullName()
             + " organizes a small team-building workshop. "
             + "Coworkers share strengths, communication styles, "
             + "and a lot of laughter.";
    }
}

