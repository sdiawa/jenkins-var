  
def call (){

    sh """
    trivy image ${params.ImageName}:${params.ImageTag} > scan.txt
    cat scan.txt
    """
}
