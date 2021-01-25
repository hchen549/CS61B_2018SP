public class OffByN implements CharacterComparator{
    private int offN;

    public OffByN(int a){
        offN = a;
    }

    @Override
    public boolean equalChars(char x, char y) {
        if (x - y == offN || y - x == offN ){
            return true;
        }
        return false;
    }
}
