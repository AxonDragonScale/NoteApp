package com.axondragonscale.noteapp.domain.util

/**
 * Created by Ronak Harkhani on 27/11/21
 */
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
