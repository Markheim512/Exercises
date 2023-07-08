public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (color == oldColor) return image;
        fill(image.length, image[0].length, sr, sc, color, oldColor, image);
        return image;
    }

    private void fill(int size_x, int size_y, int x, int y, int color, int oldColor, int[][] image) {
        image[x][y] = color;
        if (x - 1 >= 0 && image[x - 1][y] == oldColor) fill(size_x, size_y, x - 1, y, color, oldColor, image);
        if (x + 1 < size_x && image[x + 1][y] == oldColor) fill(size_x, size_y, x + 1, y, color, oldColor, image);
        if (y - 1 >= 0 && image[x][y - 1] == oldColor) fill(size_x, size_y, x, y - 1, color, oldColor, image);
        if (y + 1 < size_y && image[x][y + 1] == oldColor) fill(size_x, size_y, x, y + 1, color, oldColor, image);
    }
}
