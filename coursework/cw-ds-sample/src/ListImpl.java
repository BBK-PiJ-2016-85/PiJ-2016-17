public class ListImpl implements List {
 
 public ReturnObject remove(int index){
    if (index < 0 || index >= size()){
        return new ReturnObject(ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }

    // retrieve item from list at index position "index"
    // move the elements along
    // presume value is placed into variable "obj"

    Object obj = new Object(); //...
    return new ReturnObject(obj);
 }   
}