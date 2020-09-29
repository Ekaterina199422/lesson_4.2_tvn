package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionAmount_ForMasterCard() {
        val cardType = "MasterCard"
        val monthTransfer = 32_000_00L
        val transfer = 2_000_00L
        val result = commissionAmount(
            cardType = cardType,
            monthTransfer = monthTransfer,
            transfer = transfer
        )
        assertEquals(result, 0)
    }

    @Test
    fun commissionAmount_ForMasterCardWithComm() {
        val cardType = "MasterCard"
        val monthTransfer = 62_000_00L
        val transfer = 20_000_00L
        val result = commissionAmount(
            cardType = cardType,
            monthTransfer = monthTransfer,
            transfer = transfer
        )
        assertEquals(result, 14000)
    }

    @Test
    fun commissionAmount_ForMaestroCard() {
        val cardType = "Maestro"
        val monthTransfer = 32_000_00L
        val transfer = 2_000_00L
        val result = commissionAmount(
            cardType = cardType,
            monthTransfer = monthTransfer,
            transfer = transfer
        )
        assertEquals(result, 0)
    }

    @Test
    fun commissionAmount_ForVisaCard() {
        val cardType = "Visa"
        val monthTransfer = 32_000_00L
        val transfer = 2_000_00L
        val result = commissionAmount(
            cardType = cardType,
            monthTransfer = monthTransfer,
            transfer = transfer
        )
        assertEquals(result, 3500)
    }

    @Test
    fun commissionAmount_ForVisaCardWithComm() {
        val cardType = "Visa"
        val monthTransfer = 32_000_00L
        val transfer = 20_000_00L
        val result = commissionAmount(
            cardType = cardType,
            monthTransfer = monthTransfer,
            transfer = transfer
        )
        assertEquals(result, 15000)
    }

    @Test
    fun commissionAmount_ForMirCard() {
        val cardType = "Мир"
        val monthTransfer = 32_000_00L
        val transfer = 2_000_00L
        val result = commissionAmount(
            cardType = cardType,
            monthTransfer = monthTransfer,
            transfer = transfer
        )
        assertEquals(result, 3500)
    }

    @Test
    fun commissionAmount_ForVKPay() {
        val cardType = "VK Pay"
        val monthTransfer = 32_000_00L
        val transfer = 2_000_00L
        val result = commissionAmount(
            cardType = cardType,
            monthTransfer = monthTransfer,
            transfer = transfer
        )
        assertEquals(result, 0)
    }

    @Test
    fun commissionAmount_ForOtherCard() {
        val cardType = "AmericanExpress"
        val transfer = 2_000_00L
        val result = commissionAmount(
            cardType = cardType,
            transfer = transfer
        )
        assertEquals(result, 0)
    }

}