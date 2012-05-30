/*
 * Copyright (c) 2012, ScalaFX Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the ScalaFX Project nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package scalafx.util.converter

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import javafx.util.{ converter => jfxuc }
import scalafx.Includes._

/**
 * ShortStringConverter Spec tests.
 *
 *
 */
@RunWith(classOf[JUnitRunner])
class ShortStringConverterSpec
  extends AbstractStringConverterDelegateSpec[java.lang.Short, jfxuc.ShortStringConverter, Short, ShortStringConverter](classOf[jfxuc.ShortStringConverter], classOf[ShortStringConverter], classOf[Short]) {

  val examples = List((0.toShort, "0"), (123.toShort, "123"), (-123.toShort, "-123"),
    (Short.MaxValue, Short.MaxValue.toString), (Short.MinValue, Short.MinValue.toString))

  protected def convertScalaClassToJavaClass(sfxControl: ShortStringConverter) = {
    val jfxShortStringConverter: jfxuc.ShortStringConverter = sfxControl
    jfxShortStringConverter
  }

  protected def convertJavaClassToScalaClass(jfxControl: jfxuc.ShortStringConverter) = {
    val sfxShortStringConverter: ShortStringConverter = jfxControl
    sfxShortStringConverter
  }

}