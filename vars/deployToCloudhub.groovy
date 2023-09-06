def call(){
    bat 'mvn deploy -DmuleDeploy -Pcloudhub1 -DappName=${appName} -DdeployEnv=${deployEnv} -Dregion=${region} -Dworkers=${workers} -DworkerType=${workerType} -DplatformClientId=${platformClientId} -DplatformClientSecret=${platformClientSecret}'
}