import javafx.scene.paint.Color;

public class BrickRow {
    private int pointValue;
    private Color color;
    private boolean[] brickmask;


    public BrickRow() {
        this.setPointValue(0);
        this.setColor(null);
        this.brickmask = null;
    }
    public BrickRow(int pointValue, Color color, String bMask) {
        this.setPointValue(pointValue);
        this.setColor(color);
        this.brickmask = new boolean[bMask.length()];
        for (int i = 0; i < bMask.length(); i++) {
            if (bMask.charAt(i) == '1') {
                this.brickmask[i] = true;
            } else {
                this.brickmask[i] = false;
            }
            }
    }

    public boolean getBrickMaskValue(int index){
        return brickmask[index];
    }

    public void setBrickMaskValue(int index, boolean value){
        brickmask[index] = value;
    }

    public int getBrickMaskLength(){
        return this.brickmask.length;
    }



    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        int r = (int) (color.getRed() * 255);
        int g = (int) (color.getGreen() * 255);
        int b = (int) (color.getBlue() * 255);
        String toString = pointValue + "\n" + r + " " + g + " " + b + "\n";
        for (int i = 0; i < brickmask.length; i++) {
            toString += brickmask[i];
        }
        return toString;

    }
}

