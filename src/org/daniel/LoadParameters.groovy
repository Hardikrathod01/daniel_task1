package org.daniel

class LoadParameters implements Serializable {
  def steps
  
  LoadParameters(steps) {
    this.steps = steps
  }
  
  def load(param) {
    steps.bat "echo load parameters from jenkins: ${param}"
  }
  
}
