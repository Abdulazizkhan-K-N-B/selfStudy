package com.aknb.tasks.bySubject;

import com.aknb.tasks.bySubject.conditions.IfElse;
import com.aknb.tasks.bySubject.conditions.SwitchCase;
import com.aknb.tasks.bySubject.loop.ForLoop;
import com.aknb.tasks.bySubject.loop.WhileLoop;
import com.aknb.tasks.bySubject.math.MathEx;

public class BySubject {

    public static void main(String[] args) {

        MathEx.mathRun();

        IfElse.ifRun();

        SwitchCase.switchRun();

        ForLoop.forRun();

        WhileLoop.whileRun();
    }
}
