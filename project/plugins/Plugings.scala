import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info){

  val libResolverRepo = "LibResolver Github Repo" at "http://remeniuk.github.com/maven/"
  val libResolver = "com.vasilrem" % "sbt-libresolver-plugin" % "0.1"
}

