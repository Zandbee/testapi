package org.test.unfilttr.model

import java.time._

case class Unfilttr(userId: Long, content: String) {
  val date = Instant.now().toEpochMilli
}
