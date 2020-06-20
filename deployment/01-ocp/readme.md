# Installing idepo App in Openshift

## Download

Download this project from git

## Parameter changes

Change the below values according to your cluster.

## Installation

Goto `install` folder in command prompt

### 1. Install the application

1. Login into the cluster with ` oc login`  command

2. Run the below command to install.

```
sh 01-install.sh
```

The application get installed in the oc cluster.

## Accessing the installed application

2. Run the below command to find the routes installed.

```
oc get route -n idepo-kube-app-ns
```

It may result like the below.
```
Jeyas-MacBook-Pro:install jeyagandhi$ oc get route -n idepo-kube-app-ns
NAME              HOST/PORT                                                        PATH   SERVICES          PORT      TERMINATION   WILDCARD
idepo-bankweb      idepo-bankweb-idepo-kube-app-ns.apps.ganocp43.os.fyre.ibm.com      /      idepo-bankweb      my-http                 None
idepo-commission   idepo-commission-idepo-kube-app-ns.apps.ganocp43.os.fyre.ibm.com   /      idepo-commission   my-http                 None

```

3. Copy the route from the above output and open the url in the browser.

ex:
```
http://idepo-bankweb-idepo-kube-app-ns.apps.ganocp43.os.fyre.ibm.com 
```

4. Click on the `commission` link.