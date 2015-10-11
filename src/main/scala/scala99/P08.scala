package scala99

object P08 {

  def compress(l: List[Any]): List[Any] =
      l.foldLeft(List[Any]()) { (resultList, el) =>
                    if (resultList.isEmpty || resultList.last != el) resultList :+ el
                    else resultList
                  }

  //l match {
  //case Nil       => Nil
  //case h :: tail => h :: compress(tail.dropWhile(_ == h))
  //}

  //l.distinct and l.toSet.toList do not work because the remove all duplicates

}