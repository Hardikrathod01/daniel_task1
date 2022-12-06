package org.daniel

class LoadParameters implements Serializable {
  def steps
  
  LoadParameters(steps) {
    this.steps = steps
  }
  
  def load(param) {
    steps.bat "echo load parameters from jenkins: ${param}"
    steps.properties([
                        parameters([
                            [
                                $class: 'ChoiceParameter',
                                choiceType: 'PT_CHECKBOX',
                                name: 'services',
                                script: [
                                    $class: 'GroovyScript',
                                    script: [
                                        sandbox: true,
                                        script: '''return [
                                            "admin-service",
                                            "user-service",
                                            "product-service",
                                        ]'''.stripIndent()
                                    ]
                                ]
                            ],
                        ])
                    ])
  }
  
}