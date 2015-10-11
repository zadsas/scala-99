package scala99

object P09 {

  def pack(ls: List[Any]): List[Any] = {
    val (packed, next) = ls span { _ == ls.head }
    next match {
      case Nil => List(packed)
      case _   => packed :: pack(next)
    }
  }

}