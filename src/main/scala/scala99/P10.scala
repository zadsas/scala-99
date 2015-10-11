package scala99

object P10 {

  def encode(ls: List[Any]): List[Any] = {
    val (packedList, nextList) = ls span { _ == ls.head }
    val newTupleInResultList = (packedList.length, packedList.head)
    nextList match {
      case Nil => List(newTupleInResultList)
      case _   => newTupleInResultList :: encode(nextList)
    }
  }

  //P09.pack(ls) map { e => (e.length, e.head) }

}