package com.lpicanco.nes

import kotlin.properties.Delegates

class CPU {
    private var pc: Register16 by Delegates.notNull()
    private var a: Register8 by Delegates.notNull()
    private var x: Register8 by Delegates.notNull()
    private var y: Register8 by Delegates.notNull()
    private var sp: Register8 by Delegates.notNull()
    private var carryFlag: Flag by Delegates.notNull()
    private var zeroFlag: Flag by Delegates.notNull()
    private var interruptDisableFlag: Flag by Delegates.notNull()
    private var decimalModeFlag: Flag by Delegates.notNull()
    private var breakCommandFlag: Flag by Delegates.notNull()
    private var overflowFlag: Flag by Delegates.notNull()
    private var negativeFlag: Flag by Delegates.notNull()

    init {
        reset()
    }

    private fun reset() {
        pc = 0u
        a = 0u
        x = 0u
        y = 0u
        sp = 0u
        carryFlag = false
        zeroFlag = false
        interruptDisableFlag = false
        decimalModeFlag = false
        breakCommandFlag = false
        overflowFlag = false
        negativeFlag = false

    }
}