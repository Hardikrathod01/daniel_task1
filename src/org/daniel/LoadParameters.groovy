package org.daniel

import hudson.model.ChoiceParameterDefinition

class LoadParameters implements Serializable {
  def steps
  
  LoadParameters(steps) {
    this.steps = steps
  }
  
  def load(param) {
    steps.bat "echo load parameters from jenkins: ${param}"
    steps.properties([
      steps.parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
      }
  }
  
}
