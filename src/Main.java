package Game;

public class Main {

    // global definierte Konstanten für die beiden Dimensionen
    final static int DIM1 = 12;
    final static int DIM2 = 12;

    // liefert eine zufällig initialisierte Welt
    public static boolean[][] initWelt() {
        return initWelt();
    }


    // gibt die aktuelle Welt aus
    public static void zeigeWelt(boolean[][] welt) {

    }

    // wendet die 4 Regeln an und gibt die
    // Folgegeneration wieder zurück
    public static boolean[][] wendeRegelnAn(boolean[][] welt) {
        return wendeRegelnAn(welt);
    }

    public static int anzNachbarn(boolean[][] welt, int x, int y) {
        int ret = 0;
        for (int i = x - 1; i <= x + 1; ++i)
            for (int j = y - 1; j <= y + 1; ++j)
                if (welt[i][j])
                    ret += 1;
        // einen Nachbarn zuviel mitgezählt?
        if (welt[x][y])
            ret -= 1;
        return ret;
    }

    public static void main(String[] args) {
        boolean[][] welt = initWelt();
        System.out.println("Startkonstellation");
        zeigeWelt(welt);
        for (int i = 1; i <= 100; i++) {
            welt = wendeRegelnAn(welt);
            System.out.println("Generation " + i);
            zeigeWelt(welt);


        }
    }
}
