
def call (){

    sh """

    docker run -p ${PortApp.ImageName} --name ${params.AppName} ${params.ImageName}:${params.ImageTag} -d   

    """


} 
// docker.image('${params.ImageName}:${params.ImageTag}').run('-p 8080:8080', '--name exemple') -d