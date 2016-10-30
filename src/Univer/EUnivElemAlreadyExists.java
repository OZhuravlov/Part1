package Univer;

import org.jetbrains.annotations.NonNls;

class EUnivElemAlreadyExists extends RuntimeException{
    EUnivElemAlreadyExists(@NonNls String message) {
        super(message);
    }
}
