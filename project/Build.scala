import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "Time_Trotter"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "mysql" % "mysql-connector-java" % "5.1.18",
    "org.azeckoski" % "reflectutils" % "0.9.19",
    "org.apache.commons" % "commons-email" % "1.2",
    "org.mybatis" % "mybatis" % "3.1.1",
     "org.activiti" % "activiti-engine" % "5.12.1",
     "org.springframework" % "spring-context" % "3.0.7.RELEASE",
     "org.springframework" % "org.springframework.asm" % "3.0.1.RELEASE",
     "com.typesafe" %% "play-plugins-mailer" % "2.1.0",
     "org.apache.poi" % "poi" % "3.8",
     "org.apache.poi" % "poi-ooxml" % "3.8"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers += "Sakai Maven Repo" at "http://source.sakaiproject.org/maven2" ,
    resolvers += "Alfresco Maven Repository" at "https://maven.alfresco.com/nexus/content/groups/public/",
    resolvers += "ibiblio Repository" at "http://mirrors.ibiblio.org/maven2/",
    resolvers += "Maven Repository 1" at "https://maven-us.nuxeo.org/nexus/content/repositories/public/",   
    resolvers += "Maven Repository 2" at "http://repository.opencastproject.org/nexus/content/repositories/public" 
  )

}
