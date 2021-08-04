package com.willsuttner.panko

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.willsuttner.panko.data.model.Message

object APIClient {
    private val db = Firebase.firestore

    private enum class Collection(val collectionName: String) {
        Messages("messages"),
        Users("users"),
    }

    fun post(msg: Message) {
        db.collection(Collection.Messages.collectionName)
            .add(msg)
            .addOnSuccessListener { documentReference -> println("Success ${documentReference.id}") }
            .addOnFailureListener { e -> println("Failure $e")}
    }
}
