name := "gcs"

libraryDependencies ++= Seq(
  "com.google.cloud" % "google-cloud-storage" % "1.109.0",
  "com.google.cloud" % "google-cloud-nio"     % "0.121.1" % Test
)
