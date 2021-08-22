class Movement(
    private val position: Position,
    private val command: String
){
    fun position(): Position {
        if (command == "M"){
            if ( position.orientation== OrientationEnum.NORTH.letter){
                position.point.axisY += 1
            }
            if ( position.orientation== OrientationEnum.SOUTH.letter){
                position.point.axisY -= 1
            }
        }
        return position
    }
}