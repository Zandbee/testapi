package org.test

import com.google.gson.Gson
import unfiltered.response.{ComposeResponse, JsonContent, ResponseString}

package object unfilttr {

  val gson = new Gson()

  case class ResponseJson(obj: AnyRef) extends
    ComposeResponse(JsonContent ~> ResponseString(gson.toJson(obj)))

}
