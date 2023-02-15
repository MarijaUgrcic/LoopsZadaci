public class UgnjezdeniWhile {

    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        while (i < 5) {
            while (j < 10) {
                System.out.println("Iterator i je: " + i + ", brojac j je: " + j);
                j++;
            }
            i++;
            j = 0;
        }
    }
}
// kada izadjemo iz ugnjezdene petlje moramo dodeliti 0 brojacu j kako bi kada se i poveca za 1 ponovo usao
// u ugnjezdenu petlju. Ovako bi j ostao 10 i ne bismo dalje ulazili u ugnjezdenu petlju i stampali podatke.