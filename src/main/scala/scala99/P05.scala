package scala99

object P05 {

  def reverse[T](l: List[T]): List[T] = l.foldLeft(List[T]()){ (accList,el) => el::accList }

}
