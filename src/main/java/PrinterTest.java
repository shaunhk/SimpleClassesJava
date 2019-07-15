import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {printer = new Printer (200, 100);}

    @Test
    public void hasSheets(){
        assertEquals(200, printer.getSheets());
    }

    @Test
    public void canPrint(){
        printer.print(5, 4);
        assertEquals(180, printer.getSheets());
    }

    @Test
    public void cantPrintWithoutPaper(){
        printer.print(600, 2000);
        assertEquals(200, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void depletesToner(){
        printer.print(4,4);
        assertEquals(84, printer.getToner());
    }

    @Test
    public void cantPrintWithoutToner(){
        printer.print(110, 1);
        assertEquals(200, printer.getSheets());
    }
}
