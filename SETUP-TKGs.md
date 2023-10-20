qIRlczC8FgOSf1*$EL8

kubectl vsphere login --server=10.220.8.34 --vsphere-username administrator@vsphere.local --insecure-skip-tls-verify

CHECK
pcarlo@pcarlo3C2T5 tanzu % k get tkc -n client1
No resources found in client1 namespace.

CREATE CLUSTER with file wl1-cluster.yaml <<k apply -f wl1-cluster.yaml>>
apiVersion: run.tanzu.vmware.com/v1alpha2
kind: TanzuKubernetesCluster
metadata:
  name: wl1-cluster
  namespace: client1
spec:
  topology:
    controlPlane:
      replicas: 1
      vmClass: best-effort-2xlarge
      storageClass: vc01cl01-t0compute
      tkr:
        reference:
          name: v1.23.8---vmware.3-tkg.1
    nodePools:
    - name: tkg-cluster-nodeool-1
      replicas: 5
      vmClass: best-effort-4xlarge
      storageClass: vc01cl01-t0compute
      tkr:
        reference:
          name: v1.23.8---vmware.3-tkg.1
      volumes:
      - capacity:
          storage: 60Gi
        mountPath: /var/lib/containerd
        name: containerd
  settings:
    network:
      pods:
        cidrBlocks:
        - 100.96.0.0/11
      services:
        cidrBlocks:
        - 100.64.0.0/13
    storage:
      defaultClass: vc01cl01-t0compute


pcarlo@pcarlo3C2T5 tanzu % k get tkc -n client1
NAME          CONTROL PLANE   WORKER   TKR NAME                   AGE     READY   TKR COMPATIBLE   UPDATES AVAILABLE
wl1-cluster   1               5        v1.23.8---vmware.3-tkg.1   3m51s   False   True
pcarlo@pcarlo3C2T5 tanzu %

kubectl vsphere login --server=10.220.8.34 --vsphere-username administrator@vsphere.local --tanzu-kubernetes-cluster-name wl1-cluster --tanzu-kubernetes-cluster-namespace client1 --insecure-skip-tls-verify