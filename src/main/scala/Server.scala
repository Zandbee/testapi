package com.example

import org.test.unfilttr.handler.UnfilttrHandler

/** embedded server */
object Server {
  def main(args: Array[String]): Unit = {
    unfiltered.netty.Server.local(8080)
      .handler(Palindrome)
      .handler(Time)
      .handler(UnfilttrHandler)
      .run { s =>
        unfiltered.util.Browser.open(s.portBindings.head.url + "/unfilttr")
      }
    dispatch.Http.default.shutdown()
  }
}
