public class addChar {
    char A;
    char B;
    char C;
    char D;

    addChar(char A, char B, char C, char D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }
    @Override
    public String toString() {
        return A+""+B+C+D;
    }

    public static void main(String[] args) {
        addChar language = new addChar('J', 'A', 'V', 'A');
        System.out.println(language);
    }

}
