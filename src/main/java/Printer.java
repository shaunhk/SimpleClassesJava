public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets(){
        return this.sheets;
    }

    public void print(int pages, int copies){
        int printed = pages * copies;
        int newSheets = this.sheets - printed;
        if(printed < this.sheets && printed < this.toner) {
            this.sheets = newSheets;
            this.toner -= printed;
        }
    }

    public int getToner(){
        return this.toner;
    }
}
