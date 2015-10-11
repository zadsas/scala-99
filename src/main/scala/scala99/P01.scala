package scala99

import java.util.NoSuchElementException

import scala.annotation.tailrec

object P01 {

  @tailrec
  def last[T](l: List[T]): T = l match {
    case h :: Nil   => h
    case _ :: tail  => last(tail)
    case _          => throw new NoSuchElementException
  }

  //    if (l.size==0) throw new NoSuchElementException
  //    else if (l.size==1) l.head
  //    else last(l.tail)

}
