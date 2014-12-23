package net.liftweb.test.lib

import net.liftweb.common.{Box, Empty}
import net.liftweb.util.{Html5, ContentParser}

import scala.xml.NodeSeq

import org.asciidoctor.Asciidoctor.Factory.create

object AsciiDoctorParser extends ContentParser {
  override def parse(in:String):Box[NodeSeq] = {
    Html5.parse(create().convert(in, new java.util.HashMap[String, Object]))
  }
}
