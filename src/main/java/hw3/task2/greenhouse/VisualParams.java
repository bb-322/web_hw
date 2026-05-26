package hw3.task2.greenhouse;

public class VisualParams {
    public String getStemColor() {
        return stemColor;
    }

    public void setStemColor(String stemColor) {
        this.stemColor = stemColor;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public String getAverageSize() {
        return averageSize;
    }

    public void setAverageSize(String averageSize) {
        this.averageSize = averageSize;
    }

    private String stemColor;
    private String leafColor;
    private String averageSize;

    @Override
    public String toString() {
        return "VisualParams{" +
                "stemColor='" + stemColor + '\'' +
                ", leafColor='" + leafColor + '\'' +
                ", averageSize='" + averageSize + '\'' +
                '}';
    }
}
