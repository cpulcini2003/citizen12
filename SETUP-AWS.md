## EKS setup

Log with GloudGate and get CREDENTIALS VALUES

### LOGIN from cli
copy/past in env
copy inside dedault file if needed: /Users/pcarlo/.aws/credentials
> aws configure

### update kubeconfig and test
> aws eks update-kubeconfig --region eu-south-1 --name tap-on-aws
> kubectl get nodes

## INSTALL POSTGRESQL OPERATOR
follow procedure in config/postgresinfo/useful_command.txt

## CLASS BINDING FOR POSTGRESQL SETUP
tanzu service class-claim create citizen --class postgresql-unmanaged -n cpu

pcarlo@pcarlo3C2T5 ~ % tanzu services class-claims get citizen --namespace cpu
Name: citizens
Namespace: cpu
Claim Reference: services.apps.tanzu.vmware.com/v1alpha1:ClassClaim:citizens
Class Reference:
  Name: postgresql-unmanaged
Parameters: None
Status:
  Ready: True
  Claimed Resource:
    Name: 25f6d4fc-e022-4318-a273-ee6d74db2fa6
    Namespace: cpu
    Group:
    Version: v1
    Kind: Secret
pcarlo@pcarlo3C2T5 ~ %
pcarlo@pcarlo3C2T5 ~ % k get ns | grep citizens
citizens-d7w5t                    Active   109s
pcarlo@pcarlo3C2T5 ~ %

pcarlo@pcarlo3C2T5 ~ % kubectl get storageclasses
NAME            PROVISIONER             RECLAIMPOLICY   VOLUMEBINDINGMODE      ALLOWVOLUMEEXPANSION   AGE
ebs-sc          ebs.csi.aws.com         Delete          WaitForFirstConsumer   false                  8d
gp2 (default)   kubernetes.io/aws-ebs   Delete          WaitForFirstConsumer   false                  10d
pcarlo@pcarlo3C2T5 ~ %

### CONNECT TO CLAIMED DB
tanzu services class-claims get citizen --namespace cpu | yq '.Status' | grep Name | yq '.Name'
>>>e27cd893-2589-49b9-b6a5-4c9801d0e9e9

kubectl get secret e27cd893-2589-49b9-b6a5-4c9801d0e9e9 -n cpu -o yaml | yq '.data.database' | base64 -d
echo
kubectl get secret e27cd893-2589-49b9-b6a5-4c9801d0e9e9 -n cpu -o yaml | yq '.data.username' | base64 -d
echo
kubectl get secret e27cd893-2589-49b9-b6a5-4c9801d0e9e9 -n cpu -o yaml | yq '.data.password' | base64 -d
echo

kubectl exec -it citizen-v4v9s-0 -n citizen-v4v9s -- psql -d citizen-v4v9s -U postgres



