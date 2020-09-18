pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('mypartner-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/thexeons/mypartner.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}