package net.liftweb.test.lib

import net.liftweb.common.{Full, Box, Empty}
import net.liftweb.util.{Html5, ContentParser}

import scala.xml.NodeSeq

import org.asciidoctor.Asciidoctor.Factory.create

object AsciiDoctorParser extends ContentParser {
  override def parse(in:String):Box[NodeSeq] = {
    val html = create().convert(in, new java.util.HashMap[String, Object])
    println(html)
    Full(scala.xml.Unparsed(html))
  }
}
