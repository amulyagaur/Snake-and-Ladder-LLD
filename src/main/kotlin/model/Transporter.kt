package model

interface Transporter {
    val id: Int
    val startPoint: Int
    val endPoint: Int
}