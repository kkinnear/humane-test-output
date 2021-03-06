(ns pjstadig.run-all
  (:require [doo.runner :as doo :include-macros true]
            [pjstadig.humane-test-output]
            [pjstadig.humane-test-output.formatting-test]
            [pjstadig.humane-test-output.records-test]
            [pjstadig.humane-test-output.reporting-test]))

(enable-console-print!)

(doo/doo-all-tests #"pjstadig.*-test")
