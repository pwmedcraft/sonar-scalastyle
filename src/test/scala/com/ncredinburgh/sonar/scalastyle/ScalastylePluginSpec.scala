/*
 * Sonar Scalastyle Plugin
 * Copyright (C) 2014 All contributors
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package com.ncredinburgh.sonar.scalastyle

import com.ncredinburgh.sonar.scalastyle.core.Scala
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

/**
 * Tests ScalastylePlugin
 */
@RunWith(classOf[JUnitRunner])
class ScalastylePluginSpec extends FlatSpec with Matchers {

  val testee = new ScalastylePlugin

  "a scalastyle plugin" should "provide a scalastyle sensor" in {
    assert(testee.getExtensions.contains(classOf[ScalastyleSensor]))
  }

  it should "provide a scalastyle repository" in {
    assert(testee.getExtensions.contains(classOf[ScalastyleRepository]))
  }

  ignore should "provide a scala language" in {
    assert(testee.getExtensions.contains(classOf[Scala]))
  }

  it should "provide a scalastyle quality profile" in {
    assert(testee.getExtensions.contains(classOf[ScalastyleQualityProfile]))
  }
}
