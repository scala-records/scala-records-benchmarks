name := "scala-records-benchmarks"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies <+= (scalaVersion)("org.scala-lang" % "scala-compiler" % _)

libraryDependencies += "com.storm-enroute" %% "scalameter" % "0.6"

libraryDependencies += "com.chuusai" %% "shapeless" % "2.2.5"

libraryDependencies += "ch.epfl.lamp" %% "scala-records" % "0.5-SNAPSHOT"

testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

logBuffered := false

parallelExecution in Test := false
