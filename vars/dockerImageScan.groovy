  
def call (){

    sh """
    trivy image ${params.DockerHubUser}/${params.ImageName}:${params.ImageTag} > scan.txt
    cat scan.txt
    """
}
