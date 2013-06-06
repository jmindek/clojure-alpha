(defproject yahtzee "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.5.0"]]
  :profiles {:dev {:dependencies [[speclj "2.5.0"]]}}
	:plugins [[speclj "2.5.0"]]
	:test-paths ["spec/"]
  :main yahtzee.core)
