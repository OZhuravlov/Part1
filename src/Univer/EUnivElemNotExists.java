package Univer;

import org.jetbrains.annotations.NonNls;

class EUnivElemNotExists extends RuntimeException {
    EUnivElemNotExists(@NonNls String message) {
        super(message);
    }
}
