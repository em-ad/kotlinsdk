package io.swagger.client.infrastructure

import io.swagger.client.infrastructure.CollectionFormats.CSVParams
import io.swagger.client.utils.StringUtil
import java.util.*

class CollectionFormats {
    open class CSVParams {
        var params: List<String?>? = null

        constructor() {}
        constructor(params: List<String>?) {
            this.params = params
        }

        constructor(vararg params: String?) {
            this.params = listOf(*params)
        }

        override fun toString(): String {
            return StringUtil.join(params!!.toTypedArray(), ",")
        }
    }

    class SSVParams : CSVParams {
        constructor() {}
        constructor(params: List<String>?) : super(params) {}
        constructor(vararg params: String?) : super(*params) {}

        override fun toString(): String {
            return StringUtil.join(params!!.toTypedArray(), " ")
        }
    }

    class TSVParams : CSVParams {
        constructor() {}
        constructor(params: List<String>?) : super(params) {}
        constructor(vararg params: String?) : super(*params) {}

        override fun toString(): String {
            return StringUtil.join(params!!.toTypedArray(), "\t")
        }
    }

    class PIPESParams : CSVParams {
        constructor() {}
        constructor(params: List<String>?) : super(params) {}
        constructor(vararg params: String?) : super(*params) {}

        override fun toString(): String {
            return StringUtil.join(params!!.toTypedArray(), "|")
        }
    }
}