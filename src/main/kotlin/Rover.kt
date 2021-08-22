class Rover(
    point: Point,
    orientation: String
)
{
    var position = Position(point,orientation)

    fun move(command: String) {
        position = Movement(position, command).position()
    }

    fun position() = position.toString()
}