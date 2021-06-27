package B_3197;
import java.util.*;
import java.io.*;
public class B_3197 {

    private static int R;
    private static int C;
    private static char[][] map;
    private static int[][] melt;
    private static int day;
    private static int[] x_move = {1, 0, -1, 0};
    private static int[] y_move = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = in.readLine();

        R = Integer.parseInt(firstLine.split(" ")[0]);
        C = Integer.parseInt(firstLine.split(" ")[1]);

        map = new char[R][C];
        List<Point> swan = new ArrayList<>();

        for (int i = 0; i < R; i++) {
            String input = in.readLine();

            for (int j = 0; j < C; j++) {
                map[i][j] = input.charAt(j);

                if (map[i][j] == 'L') {
                    swan.add(new Point(i, j));
                }
            }
        }

        in.close();

        melt = melt();

        int left = 0;
        int right = day;
        int min = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (isReachable(swan.get(0), swan.get(1), mid)) {
                min = Math.min(min, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(min);
    }

    private static boolean isReachable(Point point1, Point point2, int limit) {
        boolean[][] visited = new boolean[R][C];

        Queue<Point> queue = new LinkedList<>();
        queue.add(point1);
        visited[point1.x][point2.y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int k = 0; k < 4; k++) {
                int new_x = point.x + x_move[k];
                int new_y = point.y + y_move[k];
                if (inArea(new_x, new_y) && !visited[new_x][new_y] && melt[new_x][new_y] <= limit) {
                    visited[new_x][new_y] = true;

                    if (new_x == point2.x && new_y == point2.y) {
                        return true;
                    }

                    queue.offer(new Point(new_x, new_y));
                }
            }
        }

        return false;
    }

    private static int[][] melt() {
        boolean[][] visited = new boolean[R][C];
        int[][] melt = new int[R][C];

        Queue<Point> queue = new LinkedList<>();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'L' || map[i][j] == '.') {
                    queue.offer(new Point(i, j));
                    visited[i][j] = true;
                }
            }
        }

        day = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            day++;

            for (int i = 0; i < size; i++) {
                Point point = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int new_x = point.x + x_move[j];
                    int new_y = point.y + y_move[j];
                    if (inArea(new_x, new_y) && !visited[new_x][new_y] && map[new_x][new_y] == 'X') {
                        melt[new_x][new_y] = day;
                        visited[new_x][new_y] = true;

                        queue.offer(new Point(new_x, new_y));
                    }
                }
            }
        }

        return melt;
    }

    private static boolean inArea(int x, int y) {
        return x >= 0 && y >= 0 && x < R && y < C;
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}