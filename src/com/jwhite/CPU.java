package com.jwhite;

class CPU {

    static void main() {
	System.out.println("Hello world (CPU)123!");
    }

    // Flags: (f register)
        //    Zero (0x80): Set if the last op produced result of 0;
        //    Operation (0x40): Set if the last op was a subtraction;
        //    Half-carry (0x20): Set if last op caused the lower half of the byte to overflow past 15;
        //    Carry (0x10): Set if the last op produced byte > 255 or < 0
        //
    private int a, b, c ,d, e, h, l, f; // 8 bit regs
    private int pc, sp; // 16 bit regs
    private int m, t; // Clocks


}
