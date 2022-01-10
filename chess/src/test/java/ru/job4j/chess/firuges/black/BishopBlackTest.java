package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell result = bishopBlack.position();
        assertThat(result, is(Cell.A1));
    }

    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure bishop = bishopBlack.copy(Cell.A1);
        Cell rsl = bishop.position();
        assertThat(rsl, is(Cell.A1));
    }
}