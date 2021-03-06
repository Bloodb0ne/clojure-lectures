(defproject lectures "0.1.0-SNAPSHOT"
  :description "The lectures for the Clojure course in FMI Sofia"
  :url "http://fmi.clojure.bg/lectures"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [org.blancas/kern "0.5.0"]
                 [hiccup "1.0.2"]
                 [clj-yaml "0.4.0"]
                 [me.raynes/fs "1.4.0"]
                 [cheshire "5.0.2"]]
  :main lectures.core)
