package scala99

import java.util.NoSuchElementException

import scala.annotation.tailrec

object P03 {

  @tailrec
  def nth[T](n: Int, l: List[T]): T = (n, l) match {
    case (0, h :: _)    => h
    case (n, _ :: tail) => nth(n - 1, tail)
    case (_, Nil)       => throw new NoSuchElementException
  }

//    n match {
//    case _ if n>=l.size => throw new NoSuchElementException()
//    case 0 => l.head
//    case _ => nth(n-1, l.tail)
//  }

}
