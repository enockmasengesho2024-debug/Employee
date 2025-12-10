public class WellnessEventNode extends StoryNode {

    public WellnessEventNode(String title, StoryNode[] nextNodes) {
        super(title, nextNodes);
    }

    @Override
    public void play(Employee emp) {
        System.out.println("You lead a company wellness event. "
                + "The office is full of energy and positivity!");
    }
}

