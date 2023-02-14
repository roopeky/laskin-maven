package laskin;

public class Laskin {

    private double tulos;  	// Muuttuja tulokselle

    public void nollaa() {  // Nollaa tulosmuuttuja
        tulos = 0;
    }

    public double annaTulos() {
        return tulos;
    }

    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n;
    }

    public void kerro(int n) {
        tulos = tulos * n;
    }

    public void jaa(int n) {
    	if (n==0) throw new ArithmeticException("Nollalla ei voi jakaa");
        tulos = tulos / n;
    }

    public double nelio(int n) {
        tulos = n * n;
        return tulos;
    }

    public double neliojuuri(int n) {
        if (n < 0) throw new IllegalArgumentException("Negatiivisen luvun neliöjuuri ei ole määritelty");
    	tulos = (int) Math.sqrt(n);
        return tulos;
    }

    public void virtaON() {
        // Tähän voisi laittaa alkutoimet
        tulos = 0;
    }

    public void virtaOFF() {
        // Tähän voisi laittaa lopputoimet
    }

}
