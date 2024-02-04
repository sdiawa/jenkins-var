def call(){
    
  sh """
  docker rmi ${params.ImageName}:${params.ImageTag}
  docker rmi ${params.DockerHubUser}/${params.ImageName}:${params.ImageTag}

"""
}
