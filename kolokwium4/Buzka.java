public class Buzka implements PrzedstawiaEmocje, Rysowalny {
    private boolean x = false;
    private char znak = '(';
    public Buzka(char c) {
        char smile = c;
        if(smile==')'){
            this.x = true;
            znak = ')';
        }
    }


    @Override
    public boolean czySieUsmiecha() {
        return this.x;

    }

    @Override
    public void przestanSieUsmiechac() {
        this.x = false;
    }

    @Override
    public void draw() {
        System.out.println(":-"+this.znak);
    }
}
