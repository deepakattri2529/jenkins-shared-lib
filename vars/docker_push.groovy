def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'docker-hub-cred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerUserHub')]) {
      sh "docker login -u ${dockerUserHub} -p ${dockerHubPass}"
  }
  sh "docker push ${dockerUserHub}/${Project}:${ImageTag}"
}
