import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TimeTest {
    
    @Test
    public void testValidTimes() {
        assertTrue(Time.timeCheck("00:00"));
        assertTrue(Time.timeCheck("09:15"));
        assertTrue(Time.timeCheck("12:30"));
        assertTrue(Time.timeCheck("23:59"));
        assertTrue(Time.timeCheck("19:00"));
    }

    @Test
    public void testInvalidTimes() {
        assertFalse(Time.timeCheck("24:00"));   // Stunde zu groß
        assertFalse(Time.timeCheck("12:60"));   // Minute zu groß
        assertFalse(Time.timeCheck("25:00"));   // Stunde ungültig
        assertFalse(Time.timeCheck("2:30"));    // kein führendes 0
        assertFalse(Time.timeCheck("09:5"));    // unvollständige Minuten
        assertFalse(Time.timeCheck("09-15"));   // falsches Trennzeichen
    }

    @Test
    public void testCompletelyInvalidStrings() {
        assertFalse(Time.timeCheck("Hello World")); // Klar kein Zeitformat
        assertFalse(Time.timeCheck("abc123"));      // Zufallsstring
        assertFalse(Time.timeCheck("time: 12:30")); // Präfix vor der Zeit
        assertFalse(Time.timeCheck(""));            // Leerer String
        assertFalse(Time.timeCheck(null));          // Nullprüfung
    }
}