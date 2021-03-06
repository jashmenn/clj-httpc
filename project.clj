(defproject com.atti.wdm/clj-httpc "1.4.3-SNAPSHOT"
  :description "HTTP client"
  :java-source-path "src"
  :warn-on-reflection true
  :repositories
    {"clojars" "http://clojars.org/repo"}
  :dependencies
    [[org.clojure/clojure "1.2.0"]
     [org.clojure/clojure-contrib "1.2.0"]
     [org.apache.httpcomponents/httpclient "4.0.3" :exclusions
       [org.apache.httpcomponents/httpcore]]
     [org.apache.httpcomponents/httpcore "4.1"]
     [commons-logging "1.0.4"]
     [log4j/log4j "1.2.15" :exclusions
       [javax.mail/mail
        javax.jms/jms
        com.sun.jdmk/jmxtools
        com.sun.jmx/jmxri]]
     [commons-codec "1.4"]
     [commons-io "1.4"]
     [com.google.gdata/core "1.0"]]
  :dev-dependencies
    [[lein-javac "1.2.1-SNAPSHOT"]
     [swank-clojure "1.2.1"]
     [ring/ring-jetty-adapter "0.2.5"]
     [ring/ring-devel "0.2.5"]])
