package scala99

import org.scalatest.{FlatSpec, Matchers}

import scala99.P10.encode

class P10Spec extends FlatSpec with Matchers {

  behavior of "P10"

  it should "pack consecutive duplicates - 1" in {
    encode(List(1,1,1)) shouldBe List((3,1))
  }

  it should "pack consecutive duplicates - 2" in {
    encode(List(1,1,1,2,2)) shouldBe List((3,1), (2,2))
  }

  it should "pack consecutive duplicates - 3" in {
    encode(List(1,1,1,2,2,3)) shouldBe List((3,1), (2,2), (1,3))
  }

  it should "pack consecutive duplicates - 4" in {
    encode(List(1,1,1,'2','2',3)) shouldBe List((3,1), (2,'2'), (1,3))
  }

  it should "pass the given example" in {
    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
      List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }
}
