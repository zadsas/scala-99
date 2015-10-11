package scala99

object P07 {

  def flatten(l: List[Any]): List[Any] = l flatMap {
    case l:List[_] => flatten(l)
    case e => List(e)
  }

}