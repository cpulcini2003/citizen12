USEFUL COMMANDS
tanzu package installed list -n tap-install
tanzu package installed update tap -p tap.tanzu.vmware.com -v 1.6.1 --values-file tap-value.yaml -n tap-install
kubectl get ServiceAccount default -o yaml | tail -5
kubectl edit clusterpolicy sandbox-namespace-limits


GET tap-value.yaml
kubectl get secret -n tap-install tap-tap-install-values -o json | jq '.data["values.yaml"]' -r | base64 -d > tap-value.yaml


MODIFY tap-value.yaml tap-gui section
<CONFIGURE c7137caa89c364683f0d ON GITHUB including tap gui path : https://tap-gui.tapv-magical-gelding.tapsandbox.com/
tap_gui:
  service_type: ClusterIP
  metadataStoreAutoconfiguration: true
  app_config:
    integrations: 
      github:
        - host: github.com
    auth:
      allowGuestAccess: true
      environment: development
      providers:
        github:
          development:
            clientId: c7137caa89c364683f0d
            clientSecret: 9e03b1bad05a998c5f4fccc77f5ceb3e7f82e96a   
  tls:
    secretName: tap-wildcard-cert
    namespace: cert-manager  


MODIFY tap-value.yaml  NAMESPACE PROVISIONER
namespace_provisioner:
  controller: true
  default_parameters:
    supply_chain_service_account:
      secrets:
      - git-secret

APPLY CHANGES
tanzu package installed list -n tap-install (check version)
tanzu package installed update tap -p tap.tanzu.vmware.com -v 1.6.3 --values-file tap-value.yaml -n tap-install


CREATE ACCELERATOR


CREATE DEVELOPER NAMESPACE (cpu)
kubectl create ns cpu
kubectl label namespaces cpu  apps.tanzu.vmware.com/tap-ns=""
kubectl get secrets,serviceaccount,rolebinding,pods,workload,configmap,limitrange -n cpu


CREATE GIT SECRET IN CPU NAMESPACE
kubectl apply -f config/gitsecret.yaml -n cpu
---
apiVersion: v1
kind: Secret
metadata:
  name: git-secret
  annotations:
    tekton.dev/git-0: https://github.com
type: kubernetes.io/basic-auth
stringData:
  username: cpulcini2003
  password: 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   <CHANGE IF NEEDED>




TEST ACCELERATOR TO BE ABLE TO CREATE GIT REPO FOR THE OUTPUT
THE CLONE LOCALLY THE APP
pcarlo@pcarlo3C2T5 Development % git clone https://github.com/cpulcini2003/citizen10
Cloning into 'citizen10'...
remote: Enumerating objects: 42, done.
remote: Counting objects: 100% (42/42), done.
remote: Compressing objects: 100% (34/34), done.
remote: Total 42 (delta 0), reused 42 (delta 0), pack-reused 0
Receiving objects: 100% (42/42), 73.05 KiB | 1.11 MiB/s, done.
pcarlo@pcarlo3C2T5 Development %



________________READY

PREPARE DATABASE BINDING
tanzu service class-claim create citizen --class postgresql-unmanaged -n cpu
tanzu services class-claims get citizen --namespace cpu

APPLY WORKLOAD
kubectl apply -f config/workload.yaml -n cpu   <<<<< REVIEW SETTINGS>>>>>


CHECK STATUS
tanzu apps workload get citizen-test -n cpu
