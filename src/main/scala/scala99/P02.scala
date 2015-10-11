package scala99

import java.util.NoSuchElementException

import scala.annotation.tailrec

object P02 {

  @tailrec
  def penultimate[T](l: List[T]): T = l match {
    case h :: _ :: Nil => h
    case _ :: tail     => penultimate(tail)
    case _             => throw new NoSuchElementException
  }
}
