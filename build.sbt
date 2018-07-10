scalaVersion := "2.12.6"

resolvers ++= Seq(
  "Sonatype Public" at "https://oss.sonatype.org/content/groups/public/",
  "bintary/non" at "http://dl.bintary.com/non/maven"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.7")

libraryDependencies += "com.github.mpilquist" %% "simulacrum" % "0.12.0"