package ex03;

public class ArrayCopier {

  public void copy(int[] src, int[] dst) {
    if (src.length == dst.length){
      copyEqualSize(src,dst);
    } else if (src.length > dst.length){
      copyLongerSource(src,dst);
    } else {
      copyShorterSource(src,dst);
    }
  }

  public void copyEqualSize(int[] src, int[] dst){
    for (int i = 0; i < src.length; i++){
      dst[i] = src[i];
    }
  }

  public void copyLongerSource(int[] src, int[] dst){
    for (int i = 0; i <dst.length; i++){
      dst[i] = src[i];
    }
  }

  public void copyShorterSource(int[] src, int[] dst){
    for (int i = 0; i < src.length; i++){
      dst[i] = src[i];
    }
    for (int i = src.length; i < dst.length; i++){
      dst[i] = 0;
    }
  }
}
