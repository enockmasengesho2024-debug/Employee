public abstract class StoryNode {
    private String title;
    private StoryNode[] nextNodes;

    public StoryNode(String title, StoryNode[] nextNodes) {
        this.title = title;
        this.nextNodes = nextNodes;
    }

    public String getTitle() {
        return title;
    }

    public StoryNode[] getNextNodes() {
        if (nextNodes == null) {
            return new StoryNode[0];
        }
        return nextNodes;
    }

    public boolean isEnding() {
        return getNextNodes().length == 0;
    }

    // hild override method
    public abstract void play(Employee emp);
}
