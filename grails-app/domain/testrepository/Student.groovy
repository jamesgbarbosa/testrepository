package testrepository

class Student {

    String firstName
    String lastName

    static constraints = {
        firstName(size:1..20,nullable:false,blank:false)
        lastName(size:1..20,nullable:false,blank:false)
    }
}
