package br.com.erudio

import org.apache.el.lang.ELArithmetic
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.Exception
import java.util.concurrent.atomic.AtomicLong

@RestController
class MathController {
  val cont: AtomicLong = AtomicLong();

  @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
  fun sum(@PathVariable(value = "numberOne") numberOne: String?,
          @PathVariable(value = "numberTwo") numberTwo: String?): Double {
    if(!ELArithmetic.isNumber(numberOne) || !ELArithmetic.isNumber((numberTwo))) {
      throw Exception()
      return convertToDouble(numberOne) + convertToDouble(numberTwo)
    }


    return 4.0
  }
  private fun convertToDouble(numberOne: String?):Double {
    return 0.0
  }
}