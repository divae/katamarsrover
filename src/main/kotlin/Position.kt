data class Position(
    val point: Point,
    val orientation: String
){
  override fun toString(): String  = "${point.axisX},${point.axisY},$orientation"
}