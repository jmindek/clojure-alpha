(defproject clojure-alpha "0.0.9-SNAPSHOT"
 	:description "String calculator kata"
 	:dependencies [[org.clojure/clojure "1.5.0"]]
 	:profiles {:dev {:dependencies [[speclj "2.5.0"]]}}
	:plugins [[speclj "2.5.0"]]
	:test-paths ["spec/"]
	:main string-calc.core)