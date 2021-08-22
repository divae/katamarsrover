import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class PositionShould {

    @Test
    fun `Print his position`() {
        val position = Position(Point(2,2), "N")

        assertEquals("2,2,N", "$position")
    }

}