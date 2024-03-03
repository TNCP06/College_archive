public class Dragon27 {
    int x, y, width, height;

    public Dragon27(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        x--;
        printPosition();
        detectCollision();
    }
    void moveRight() {
        x++;
        printPosition();
        detectCollision();
    }
    void moveUp() {
        y++;
        printPosition();
        detectCollision();
    }
    void moveDown() {
        y--;
        printPosition();
        detectCollision();
    }
    void printPosition() {
        System.out.printf("(%d, %d) ", x,y);
    }
    void detectCollision() {
        if (x <= 0 || y <= 0 || x >= width || y >= height) {
            System.out.println("Game Over");
        }
    }

    public static void main(String[] args) {
        Dragon27 player = new Dragon27(10, 102, 100, 100);
        player.moveDown();
        player.moveDown();
        player.moveLeft();
    }
}