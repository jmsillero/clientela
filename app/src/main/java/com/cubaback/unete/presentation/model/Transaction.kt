package com.cubaback.unete.data.model

import java.util.*

data class Transaction(val id : Long, val clientAccountId : Long,
                       val businessAccountId : Long,
                       val createdAt : Date,
                       val updatedAt : Date)