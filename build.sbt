name             := "JCollider"

version          := "1.0.1-SNAPSHOT"

organization     := "de.sciss"

description      := "A Java client for SuperCollider"

homepage         := Some(url("https://github.com/Sciss/" + name.value))

licenses         := Seq("LGPL v2.1+" -> url("http://www.gnu.org/licenses/lgpl-2.1.txt"))

scalaVersion     := "2.13.11"

crossPaths       := false      // this is just a Java only project

autoScalaLibrary := false      // this is just a Java only project

lazy val basicJavaOptions = Seq("-source", "11", "-encoding", "utf8")

javacOptions    ++= basicJavaOptions ++ Seq("-target", "11", "-Xlint")

lazy val basicJavaDocOptions = Seq("-Xdoclint:missing")

Compile / doc / javacOptions := basicJavaOptions ++ basicJavaDocOptions

libraryDependencies ++= Seq(
  "de.sciss" % "netutil"  % "1.1.0",
  "de.sciss" % "scisslib" % "1.1.5"
)

// Configure the resource directory for Test
// test / resourceDirectory := baseDirectory.value / "src" / "main" / "resources"
//resourceDirectory := baseDirectory.value / "src" / "main" / "resources"


Compile / run / mainClass := Some("de.sciss.jcollider.JCollider")



// ---- publishing ----

publishMavenStyle := true

publishTo :=
  Some(if (isSnapshot.value)
    "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
  else
    "Sonatype Releases"  at "https://oss.sonatype.org/service/local/staging/deploy/maven2"
  )

Test / publishArtifact := false

pomIncludeRepository := { _ => false }

pomExtra := { val n = name.value
<scm>
  <url>git@github.com:Sciss/{n}.git</url>
  <connection>scm:git:git@github.com:Sciss/{n}.git</connection>
</scm>
<developers>
  <developer>
    <id>sciss</id>
    <name>Hanns Holger Rutz</name>
    <url>http://www.sciss.de</url>
  </developer>
</developers>
}
