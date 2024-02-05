
def call (){

    sh """

    docker run -p ${params.PortApp} --name ${params.AppName} ${params.ImageName}:${params.ImageTag}
    

    """


} 
// docker.image('${params.ImageName}:${params.ImageTag}').run('-p 8080:8080', '--name exemple') -d