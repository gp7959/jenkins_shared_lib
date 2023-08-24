def call(map stageParams){

    checkout([
        $class: 'GitSCM',
        branches: [[ name: stageParams.branch ]],
        userRemoteConfig: [[ url: stageParams.url ]]
    ])
}