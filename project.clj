(defproject swank-clojure "1.3.0-SNAPSHOT"
  :description "Swank server connecting Clojure to Emacs SLIME"
  :url "http://github.com/technomancy/swank-clojure"
  :dependencies [[org.clojure/clojure "1.3.0-master-SNAPSHOT"]]
  :shell-wrapper {:main swank.swank})
