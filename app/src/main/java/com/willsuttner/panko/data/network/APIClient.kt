package com.willsuttner.panko

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

object APIClient {
    private val db = Firebase.firestore

    fun dataPush(reminder: Reminder) {
        db.collection("test")
            .add(reminder)
            .addOnSuccessListener { documentReference -> println("Success ${documentReference.id}") }
            .addOnFailureListener { e -> println("Failure $e")}
    }
}
data class Reminder(
    val id: Int,
    val userName: String,
    val userVerified: Boolean
    )
