import java.awt.*;

public class Brick {
    private int x; // 벽돌의 x 좌표
    private int y; // y 좌표
    private int width;
    private int height;
    private Color color;
    private boolean isVisible; // 벽돌이 보이는지 여부

    public Brick(int x, int y, int width, int height, Color color) { // Brick 사용자 정의 생성자 선언
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isVisible = true; // 벽돌 보임.
    }

    public void draw(Graphics g) { // 벽돌 비쥬얼
        if (isVisible) {
            g.setColor(color.WHITE);
            g.fillRect(x, y, width, height);
            g.setColor(Color.black);
            g.drawRect(x, y, width, height);
        }
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

}

