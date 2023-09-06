def call(Map cloudParams){
    echo '${cloudParams}'
    bat 'mvn deploy -DmuleDeploy -Pcloudhub1 -DappName=${cloudParams.appName} -DdeployEnv=${cloudParams.deployEnv} -Dregion=${cloudParams.region} -Dworkers=${cloudParams.workers} -DworkerType=${cloudParams.workerType} -DplatformClientId=${cloudParams.platformClientId} -DplatformClientSecret=${cloudParams.platformClientSecret}'
}