package scala99

import scala.annotation.tailrec

object P04 {

  def length[T](l: List[T]): Integer = {

    @tailrec
    def count(acc:Int, l:List[T]): Integer = l match {
      case Nil        => acc
      case h :: tail  => count(acc+1, tail)
    }

    count(0, l)
  }

  //l.foldLeft(0) { (c, _) => c + 1 }

}
