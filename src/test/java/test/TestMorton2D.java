package test;

import junit.framework.*;
import com.erenck.mortonlib.Morton2D;
import java.util.Arrays;

/**
 * Morton 2D test
 *
 * @author eren-ck
 */
public class TestMorton2D extends TestCase {

    protected Morton2D mortonTest;

    // assigning the values
    protected void setUp() {
        mortonTest = new Morton2D();
    }

    public void testEncode() {
        try {
            for (int i = 0; i < 1024; i++) {
                int x = (int) (Math.random() * 16777216);
                int y = (int) (Math.random() * 16777216);
                mortonTest.encode(x, y);
            }
            fail("My method didn't throw when I expected it to");
        } catch (Throwable ex) {
        }
        assertEquals(mortonTest.encode(0, 0), 0);
        assertEquals(mortonTest.encode(0, 1), 2);
        assertEquals(mortonTest.encode(1, 0), 1);
        assertEquals(mortonTest.encode(15, 3), 95);
        assertEquals(mortonTest.encode(3, 15), 175);
        assertEquals(mortonTest.encode(15, 0), 85);
        assertEquals(mortonTest.encode(0, 15), 170);
        assertEquals(mortonTest.encode(3, 12), 165);
        assertEquals(mortonTest.encode(8, 38), 2152);
        assertEquals(mortonTest.encode(88, 114), 15176);
        assertEquals(mortonTest.encode(89, 34), 6473);
        assertEquals(mortonTest.encode(74, 89), 12998);
        assertEquals(mortonTest.encode(7, 55), 2623);
        assertEquals(mortonTest.encode(29, 63), 3067);
        assertEquals(mortonTest.encode(110, 10), 5340);
        assertEquals(mortonTest.encode(46, 112), 11860);
        assertEquals(mortonTest.encode(22, 57), 2966);
        assertEquals(mortonTest.encode(44, 29), 1778);
        assertEquals(mortonTest.encode(64, 106), 14472);
        assertEquals(mortonTest.encode(48, 60), 4000);
        assertEquals(mortonTest.encode(126, 100), 15732);
        assertEquals(mortonTest.encode(82, 52), 6948);
        assertEquals(mortonTest.encode(33, 111), 11435);
        assertEquals(mortonTest.encode(30, 56), 3028);
        assertEquals(mortonTest.encode(52, 44), 3504);
        assertEquals(mortonTest.encode(53, 82), 10009);
        assertEquals(mortonTest.encode(15, 96), 10325);
        assertEquals(mortonTest.encode(84, 28), 5040);
        assertEquals(mortonTest.encode(49, 58), 3977);
        assertEquals(mortonTest.encode(112, 14), 5544);
        assertEquals(mortonTest.encode(5720, 3022), 27177448);
        assertEquals(mortonTest.encode(12711, 20252), 631981749);
        assertEquals(mortonTest.encode(26239, 15091), 513589087);
        assertEquals(mortonTest.encode(15952, 9917), 226270114);
        assertEquals(mortonTest.encode(20174, 30111), 980865790);
        assertEquals(mortonTest.encode(16582, 4846), 302577852);
        assertEquals(mortonTest.encode(1556, 3519), 11963322);
        assertEquals(mortonTest.encode(8851, 2711), 76333871);
        assertEquals(mortonTest.encode(28526, 21803), 913775838);
        assertEquals(mortonTest.encode(3371, 10679), 148082287);
        assertEquals(mortonTest.encode(13038, 20313), 632190678);
        assertEquals(mortonTest.encode(23785, 25452), 962231521);
        assertEquals(mortonTest.encode(22010, 13068), 454776292);
        assertEquals(mortonTest.encode(25710, 2369), 345125974);
        assertEquals(mortonTest.encode(14393, 13126), 256517481);
        assertEquals(mortonTest.encode(22231, 16087), 465367871);
        assertEquals(mortonTest.encode(20748, 969), 285974738);
        assertEquals(mortonTest.encode(18996, 17440), 811863312);
        assertEquals(mortonTest.encode(7334, 2074), 30426780);
        assertEquals(mortonTest.encode(1175, 980), 1762101);
        assertEquals(mortonTest.encode(24200, 14607), 467026154);
        assertEquals(mortonTest.encode(6862, 26021), 694605942);
        assertEquals(mortonTest.encode(29605, 23694), 933610681);
        assertEquals(mortonTest.encode(9321, 5786), 104371913);
        assertEquals(mortonTest.encode(4660, 17185), 554568978);
        assertEquals(mortonTest.encode(2623, 9863), 141329791);
    }

    public void testDecode() {
        try {
            for (int i = 0; i < 1024; i++) {
                int c = (int) (Math.random() * 141329791);
                mortonTest.decode(c);
            }
            fail("My method didn't throw when I expected it to");
        } catch (Throwable ex) {
        }
        assertTrue(Arrays.equals(mortonTest.decode(141329791), new int[]{2623, 9863}));
        assertTrue(Arrays.equals(mortonTest.decode(187510395777190L), new int[]{66, 16480845}));
        assertTrue(Arrays.equals(mortonTest.decode(11590137678067L), new int[]{13, 3912493}));
        assertTrue(Arrays.equals(mortonTest.decode(11135284291522L), new int[]{56, 3465049}));
        assertTrue(Arrays.equals(mortonTest.decode(152464932864329L), new int[]{25, 12556034}));
        assertTrue(Arrays.equals(mortonTest.decode(185405864029763L), new int[]{41, 15499121}));
        assertTrue(Arrays.equals(mortonTest.decode(11038773230507L), new int[]{81, 3372671}));
        assertTrue(Arrays.equals(mortonTest.decode(44702567510802L), new int[]{84, 7229009}));
        assertTrue(Arrays.equals(mortonTest.decode(149671702437071L), new int[]{107, 10776107}));
        assertTrue(Arrays.equals(mortonTest.decode(151777743866356L), new int[]{30, 11770156}));
        assertTrue(Arrays.equals(mortonTest.decode(4746028006911L), new int[]{2964607, 111}));
        assertTrue(Arrays.equals(mortonTest.decode(70729592750438L), new int[]{9316506, 5}));
        assertTrue(Arrays.equals(mortonTest.decode(88051212638788L), new int[]{13056202, 48}));
        assertTrue(Arrays.equals(mortonTest.decode(93754841389789L), new int[]{16450255, 58}));
        assertTrue(Arrays.equals(mortonTest.decode(71490875777016L), new int[]{9677308, 62}));
        assertTrue(Arrays.equals(mortonTest.decode(71473960077284L), new int[]{9560250, 28}));
        assertTrue(Arrays.equals(mortonTest.decode(74840090439916L), new int[]{10834378, 78}));
        assertTrue(Arrays.equals(mortonTest.decode(75041942274190L), new int[]{11029506, 11}));
        assertTrue(Arrays.equals(mortonTest.decode(92377298765118L), new int[]{14853686, 7}));
        assertTrue(Arrays.equals(mortonTest.decode(92639241530946L), new int[]{15308712, 113}));
        assertTrue(Arrays.equals(mortonTest.decode(4678566031546L), new int[]{2738756, 79}));
        assertTrue(Arrays.equals(mortonTest.decode(88030740306177L), new int[]{12882385, 32}));
        assertTrue(Arrays.equals(mortonTest.decode(353440158L), new int[]{30038, 11}));
        assertTrue(Arrays.equals(mortonTest.decode(22080426938034L), new int[]{6750500, 61}));
        assertTrue(Arrays.equals(mortonTest.decode(93481327417146L), new int[]{15981812, 23}));
        assertTrue(Arrays.equals(mortonTest.decode(1374407700651L), new int[]{1578817, 79}));
        assertTrue(Arrays.equals(mortonTest.decode(1163148444L), new int[]{48742, 106}));
        assertTrue(Arrays.equals(mortonTest.decode(89405385960786L), new int[]{14470076, 97}));
        assertTrue(Arrays.equals(mortonTest.decode(74858064327231L), new int[]{10981191, 87}));
        assertTrue(Arrays.equals(mortonTest.decode(18968003030130L), new int[]{5830444, 101}));
        assertTrue(Arrays.equals(mortonTest.decode(70455734315240L), new int[]{8819208, 110}));
        assertTrue(Arrays.equals(mortonTest.decode(5571935821469L), new int[]{3529191, 58}));
        assertTrue(Arrays.equals(mortonTest.decode(75047108616152L), new int[]{11118716, 58}));
        assertTrue(Arrays.equals(mortonTest.decode(92656693743654L), new int[]{15457602, 5}));
        assertTrue(Arrays.equals(mortonTest.decode(4742784811072L), new int[]{2924808, 0}));
        assertTrue(Arrays.equals(mortonTest.decode(70666255680248L), new int[]{9155980, 30}));
        assertTrue(Arrays.equals(mortonTest.decode(71747769817765L), new int[]{10055619, 60}));
        assertTrue(Arrays.equals(mortonTest.decode(1185499319384L), new int[]{1456684, 34}));
        assertTrue(Arrays.equals(mortonTest.decode(5583794083157L), new int[]{3564671, 0}));
        assertTrue(Arrays.equals(mortonTest.decode(1397290530615L), new int[]{1831415, 85}));
        assertTrue(Arrays.equals(mortonTest.decode(4467051273379L), new int[]{2380129, 45}));
        assertTrue(Arrays.equals(mortonTest.decode(17953052758253L), new int[]{5128011, 14}));
        assertTrue(Arrays.equals(mortonTest.decode(5571916074502L), new int[]{3524130, 49}));
        assertTrue(Arrays.equals(mortonTest.decode(71469665121464L), new int[]{9494756, 78}));
    }

}
