package edu.knoldus.operations

class Operations {

  def reversingList(list: List[Int]): List[Int] = {

    def reverse(list: List[Int], resultList: List[Int]): List[Int] = {

      list match {
        case head :: tail => reverse(tail, head :: resultList)
        case Nil => resultList
      }
    }
    reverse(list, List())
  }

  def happySadNumber(number: Int): String = {

    def checkNumber(number: Int, sumOfProduct: Int): String = {
      number match {
        case number if number == 0 && sumOfProduct == 1 => "happy Number"
        case number if number == 0 && sumOfProduct != 1 => happySadNumber(sumOfProduct)
        case number => checkNumber(number % 10, sumOfProduct + (( number / 10) * (number / 10)))
      }
    }
    val sumOfProduct = 1
    s"${number} is ${checkNumber(number,sumOfProduct)}"
  }

  def compress(list: List[Int]): List[Int] = {

    def duplicateCheck(list: List[Int], resultList: List[Int]): List[Int] = {
      list match {
        case head :: head2 :: tail if head == head2 => duplicateCheck(head2 :: tail, resultList)
        case head :: head2 :: tail if head != head2 => duplicateCheck(head2 :: tail,head :: resultList)
        case head :: tail => duplicateCheck(tail, head :: resultList)
        case _ => resultList
      }
    }
    duplicateCheck(list, List()).reverse

  }

}
