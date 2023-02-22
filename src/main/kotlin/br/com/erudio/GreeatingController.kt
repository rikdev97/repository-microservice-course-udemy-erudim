package br.com.erudio

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {
  val cont: AtomicLong = AtomicLong();

  @RequestMapping("/greeting")
  fun greeting(@RequestParam(value="name", defaultValue="World") name: String?): Greeting  {
    return Greeting( cont.incrementAndGet(), content = "Hello,  $name! -")
  }
}