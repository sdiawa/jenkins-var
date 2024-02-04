def call (){

// Utilisez les credentials Docker Hub
withCredentials([usernamePassword(credentialsId: params.DockerHubCredentialsId, usernameVariable: 'DOCKERHUB_USERNAME', passwordVariable: 'DOCKERHUB_PASSWORD')]) {
    // Connexion à Docker Hub
    sh "docker login -u $DOCKERHUB_USERNAME -p $DOCKERHUB_PASSWORD"

    // Ajoutez la commande docker tag
    sh "docker tag ${params.ImageName}:${params.ImageTag} ${params.DockerHubUser}/${params.ImageName}:${params.ImageTag}"

    // Poussez l'image avec le tag spécifié
    sh "docker push ${params.DockerHubUser}/${params.ImageName}:${params.ImageTag}"
}

// Exécutez des commandes à l'intérieur du conteneur Docker (optionnel)
customImage.inside {
    // ...
  }
}

//def call(String aws_account_id, String region, String ecr_repoName){
    
 //   sh """
 //    aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
//     docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
//    """
//}
