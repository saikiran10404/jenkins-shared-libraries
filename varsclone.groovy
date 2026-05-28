def call(string url, string branch){
  echo "This is code cloning"
  git branch: "${branch}",
  git url: "${url}",
  echo "Code clone succesful"  
}
