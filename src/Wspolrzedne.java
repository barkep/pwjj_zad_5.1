class Wspolrzedna implements Comparable {
    private int x, y;

    public Wspolrzedna(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(Object o) {
        if (this.x>((Wspolrzedna) o).x){
            return 1;
        } else {
            return -1;
        }
    }
}