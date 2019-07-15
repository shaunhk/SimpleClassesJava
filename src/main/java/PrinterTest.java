import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {printer = new Printer (200);}

    @Test
    public void hasSheets(){
        assertEquals(200, printer.getSheets());
    }

    @Test
    public void canPrint(){
        printer.print(5, 4);
        assertEquals(180, printer.getSheets());
    }
}
