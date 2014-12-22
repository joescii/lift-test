name := "moar-parsers-test"

organization := "net.liftweb"

version := "0.0.1"

liftVersion <<= liftVersion ?? "3.0-SNAPSHOT"

liftEdition <<= liftVersion { _.substring(0,3) }

scalacOptions ++= Seq("-deprecation", "-unchecked")

resolvers ++= Seq(
  "staging"   at "https://oss.sonatype.org/service/local/staging/deploy/maven2",
  "snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "releases"  at "https://oss.sonatype.org/content/repositories/releases"
)

seq(webSettings :_*)

unmanagedResourceDirectories in Test <+= (baseDirectory) { _ / "src/main/webapp" }

libraryDependencies <++= (liftVersion) { (liftVersion) =>
  val liftEdition = lift.substring(0,3)
  Seq(
    "net.liftweb"    %% "lift-webkit"     % liftVersion % "compile",
    "ch.qos.logback" %  "logback-classic" % "1.0.6"
  )
}