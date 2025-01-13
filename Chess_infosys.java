import java.util.Scanner;
import java.lang.Math;

public class Chess_infosys {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input for the first rectangle
        int xl1 = scan.nextInt();
        int xr1 = scan.nextInt();
        int yl1 = scan.nextInt();
        int yr1 = scan.nextInt();

        // Input for the second rectangle
        int xl2 = scan.nextInt();
        int xr2 = scan.nextInt();
        int yl2 = scan.nextInt();
        int yr2 = scan.nextInt();

        // Calculate the result
        int result = countPlacements(xl1, xr1, yl1, yr1, xl2, xr2, yl2, yr2);
        System.out.print(result);
    }

    public static int countPlacements(int xl1, int xr1, int yl1, int yr1,int xl2, int xr2, int yl2, int yr2) {
        // Handle single-cell rectangles explicitly
        if (xl1 == xr1 && yl1 == yr1 && xl2 == xr2 && yl2 == yr2) {
            // Both rectangles are single cells
            if ((xl1 == xl2 && yl1 == yl2) || ((xl1 + yl1) % 2 != (xl2 + yl2) % 2)) {
                // Same cell or different colors
                return 0;
            }
            // Same color, different cells
            return 1;
        }

        // Calculate black and white cells in both rectangles
        int[] first = countCells(xl1, xr1, yl1, yr1);
        int[] second = countCells(xl2, xr2, yl2, yr2);

        int blackFirst = first[0], whiteFirst = first[1];
        int blackSecond = second[0], whiteSecond = second[1];

        // Calculate overlap rectangle
        int overlapX1 = Math.max(xl1, xl2);
        int overlapX2 = Math.min(xr1, xr2);
        int overlapY1 = Math.max(yl1, yl2);
        int overlapY2 = Math.min(yr1, yr2);

        int overlapBlack = 0, overlapWhite = 0;
        if (overlapX1 <= overlapX2 && overlapY1 <= overlapY2) {
            int[] overlap = countCells(overlapX1, overlapX2, overlapY1, overlapY2);
            overlapBlack = overlap[0];
            overlapWhite = overlap[1];
        }

        // Calculate total valid placements
        int totalBlackPlacements = (blackFirst * blackSecond) - overlapBlack;
        int totalWhitePlacements = (whiteFirst * whiteSecond) - overlapWhite;

        return totalBlackPlacements + totalWhitePlacements;
    }

    // Function to count black and white cells in a rectangle
    public static int[] countCells(int xl, int xr, int yl, int yr) {
        int totalCells = (xr - xl + 1) * (yr - yl + 1);

        // Top-left corner's color determines the starting color
        int blackCells, whiteCells;
        if ((xl + yl) % 2 == 0) {
            blackCells = (totalCells + 1) / 2;
            whiteCells = totalCells / 2;
        } else {
            blackCells = totalCells / 2;
            whiteCells = (totalCells + 1) / 2;
        }

        return new int[]{blackCells, whiteCells};
    }
}
