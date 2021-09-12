package model

data class Snake(
    override val id: Int,
    override val startPoint: Int,
    override val endPoint: Int
) : Transporter