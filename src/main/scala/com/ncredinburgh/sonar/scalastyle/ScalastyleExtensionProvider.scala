package com.ncredinburgh.sonar.scalastyle

import com.ncredinburgh.sonar.scalastyle.core.Scala
import org.sonar.api.resources.Languages
import org.sonar.api.{ExtensionProvider, ServerExtension}

import scala.collection.mutable.ListBuffer

class ScalastyleExtensionProvider(languages: Languages) extends ExtensionProvider with ServerExtension {

  override def provide(): Object = {
    val result = ListBuffer[Object]()

    if (languages.get(Constants.ScalaKey) == null) {
      // Fix issue with multiple Scala plugins, copied from sonar-scoverages
      result += classOf[Scala]
    }

    result
  }
}
