package org.daniel

Class GitSCMCheckout implements Serializable {
  def steps
  
  GitSCMCheckout(steps) {
    this.steps = steps
  }
  
  def gitCheckout(repository) {
    steps.bat "Checkout from repository: ${repository}"
  }
  
}
