(ns puppetlabs.services.ca.certificate-authority-disabled-service
  (:require [puppetlabs.services.protocols.ca :refer [CaService]]
            [puppetlabs.trapperkeeper.core :as tk]))

(tk/defservice certificate-authority-disabled-service
               "Contains a NOOP version of the certificate authority service. This is
                 required to maintain service loading order on installations which are not
                 running a CA service."
  CaService
  [])
