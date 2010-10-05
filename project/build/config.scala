import sbt._

class CircumflexProject(info: ProjectInfo) extends DefaultWebProject(info) {

    val cxVer = "1.2"
    override val jettyPort = 8180

    override def libraryDependencies = Set(
        "ru.circumflex" % "circumflex-core" % cxVer % "compile->default",
        "ru.circumflex" % "circumflex-orm" % cxVer % "compile->default",
        "ru.circumflex" % "circumflex-ftl" % cxVer % "compile->default",
        "ru.circumflex" % "circumflex-md" % cxVer % "compile->default",
        "ru.circumflex" % "circumflex-docco" % cxVer % "compile->default",

        "javax.servlet" % "servlet-api" % "2.5" % "compile->default",

        "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
        "junit" % "junit" % "4.5" % "test->default"
    ) ++ super.libraryDependencies
}
