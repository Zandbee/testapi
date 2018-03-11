package org.test.unfilttr.handler

import org.test.unfilttr.ResponseJson
import org.test.unfilttr.model.Unfilttr
import unfiltered.netty._
import unfiltered.request._
import unfiltered.response._

object UnfilttrHandler extends cycle.Plan
  with cycle.ThreadPool with ServerErrorResponse {

  def intent = {
    case GET(Path("/unfilttr")) =>
      Ok ~> ResponseJson(Unfilttr(1L, "Breaking news!"))
  }

}
