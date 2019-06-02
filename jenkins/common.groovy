package common

class MyUtilities {
    static void addMyFeature(def job) {
        job.with {
            description('Arbitrary feature')
        }
    }
}

def jsonSlurper = new JsonSlurper()
def object = jsonSlurper.parse(File(""))
 assert object instanceof Map
assert object.simple.class == Integer
assert object.fraction.class == BigDecimal
assert object.exponential.class == BigDecimal