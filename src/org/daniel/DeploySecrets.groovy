package org.daniel

import hudson.model.ChoiceParameterDefinition

class DeploySecrets implements Serializable {
  def steps
  
  DeploySecrets(steps) {
    this.steps = steps
  }
  
  def deploySecrets() {
    steps.bat "echo this is deploy secrets stage"
  }
  
}
