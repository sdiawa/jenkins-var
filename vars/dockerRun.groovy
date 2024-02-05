
def call (){

    sh """

    docker run -d --name ${params.AppName} -p ${params.PortApp} ${params.ImageName}:${params.ImageTag}
    

    """


} 
// docker.image('${params.ImageName}:${params.ImageTag}').run('-p 8080:8080', '--name exemple') -d