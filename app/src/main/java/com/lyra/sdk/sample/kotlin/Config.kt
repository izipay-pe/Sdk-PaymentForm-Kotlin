package com.lyra.sdk.sample.kotlin

object Config {

    const val SERVER_URL = "https://api.micuentaweb.pe/api-payment/V4/Charge" // without / at the end, example https://myserverurl.com

    const val API_SERVER_NAME = "https://api.micuentaweb.pe" // without / at the end, example https://myapiservername.com

    // FIXME: change by your public key
    const val PUBLIC_KEY = "~~CHANGE_ME_PUBLIC_KEY~~"

    // Environment TEST or PRODUCTION, refer to documentation for more information
    // FIXME: change by your targeted environment
    const val PAYMENT_MODE = "TEST"


    // TRUE to display a "register the card" switch in the payment form
    const val ASK_REGISTER_PAY = false

    // Payment parameters
    // FIXME: change currency for your targeted environment
    const val CURRENCY = "PEN"
    const val AMOUNT = "1000"
    const val ORDER_ID = "test-1"

    //Customer informations
    const val CUSTOMER_EMAIL = "customer@gmail.com"
    const val CUSTOMER_REFERENCE = "customer-1"

    //Basic auth
    // FIXME: set your basic auth credentials
    const val SERVER_AUTH_USER = "~~CHANGE_ME_BACKOFFICE_USER~~"
    const val SERVER_AUTH_TOKEN = "~~CHANGE_ME_BACKOFFICE_TEST/PRODUCTION PASSWORD~~"
    const val CREDENTIALS: String = "$SERVER_AUTH_USER:$SERVER_AUTH_TOKEN"
}