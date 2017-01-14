// Outline for ReturnObjectImpl

public class ReturnObjectImpl implements ReturnObject {
    private ErrorMessage error;
    private Object value;

    public ReturnObjectImpl(Object value){
        this.value = value;
        error = ErrorMessage.NO_ERROR;
    }

    public ReturnObjectImpl(ErrorMessage errormsg){
        error = errormsg;
        value = null;
    }

    public boolean hasError(){
        return error != ErrorMessage.NO_ERROR;
    }

    public ErrorMessage getError(){
        if (! hasError())
            return ErrorMessage.NO_ERROR;
        return error;
    }
    
    public Object getReturnValue(){
        if (hasError())
            return null;
        else
            return value;
    }
}