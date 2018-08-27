package sandbox_v3213

import com.example.HelperBean

class MyDomain {

    HelperBean helperBean

    static transients = ['helperBean']

    String name

    static constraints = {
    }

    static mapping = {
        autowire true
    }
}
