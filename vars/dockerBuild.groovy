//def call(String project, String ImageTag, String hubUser){
    
def call (customImage = docker.build("${params.ImageName}:${params.ImageTag}")){

// Exécutez des commandes à l'intérieur du conteneur Docker (optionnel)
customImage.inside {
    // ...
  }
}
