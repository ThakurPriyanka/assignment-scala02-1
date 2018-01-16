package edu.knoldus

import edu.knoldus.operations.Operations
import org.apache.log4j.Logger

object Application {

  def main(args: Array[String]): Unit = {

    val log = Logger.getLogger(this.getClass)
    val num1 = 1
    val num2 = 2
    val num3 = 6
    val num4 = 6
    val num5 = 6
    val operationObject = new Operations
    val list = List(num1, num2, num3, num4, num5)
    log.info(s"Reversed List ${operationObject.reversingList(list)}")
    log.info(s"List without duplication ${operationObject.compress(list)}")

  }
}

