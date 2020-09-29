package ru.netology

fun main() {
    val cardType = "VK Pay"
    val monthTransfer = 32_000_00L
    val transfer = 20_000_00L
    val result = commissionAmount(
        cardType,
        monthTransfer,
        transfer)
    println("Total commission: $result")
}

fun commissionAmount(
    cardType: String = "VK Pay",
    monthTransfer: Long = 0L,
    transfer: Long
): Long {
    return when (cardType) {
        "MasterCard", "Maestro" -> calForMasterMaestroCard(monthTransfer, transfer)
        "Visa", "Мир" -> calForVisaMirCard(transfer)
        "VK Pay" -> 0
        else -> 0
    }
}

fun calForVisaMirCard(transfer: Long): Long {
    val commission = transfer * 0.0075
    return if (commission > 3500) {
        commission.toLong()
    } else {
        3500
    }
}

fun calForMasterMaestroCard(monthTransfer: Long, transfer: Long): Long {
    return if (monthTransfer + transfer <= 7_500_000) {
        0
    } else {
        val commission = transfer * 0.006 + 2000
        commission.toLong()
    }
}