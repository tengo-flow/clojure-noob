(defproject clojure-noob "0.1.0-SNAPSHOT"
  :description "firth try at clojure"
  :url "https://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.2"]
                [com.gfredericks.forks.clj-http-fake/clj-http-fake "1.0.3-37e38b42"]
                [clj-http "3.13.1"]]
  :main ^:skip-aot clojure-noob.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
