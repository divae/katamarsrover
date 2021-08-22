import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RoverShould {

    @Test
    fun `knows its landing zone`() {
        val axisX = 5
        val axisY = 5
        val orientation = "N"
        val point = Point(axisX, axisY)
        val command = ""
        val rover = Rover(point, orientation)
        
        rover.move(command)
        val position = rover.position()

        val finalPosition = "5,5,N"
        assertEquals(finalPosition, position)
    }

    @Test
    fun `North oriented When receives the command "M" Then it moves forward`() {
        val axisX = 1
        val axisY = 2
        val point = Point(axisX, axisY)
        val orientation = "N"
        val command = "M"
        val rover = Rover(point, orientation)

        rover.move(command)
        val position = rover.position()

        val finalPosition = "1,3,N"
        assertEquals(finalPosition, position)
    }

    @Test
    fun `South oriented When receives the command "M" Then it moves forward`() {
        val axisX = 1
        val axisY = 2
        val point = Point(axisX, axisY)
        val orientation = "S"
        val command = "M"
        val rover = Rover(point, orientation)

        rover.move(command)
        val position = rover.position()

        val finalPosition = "1,1,S"
        assertEquals(finalPosition, position)
    }

}