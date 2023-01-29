public class Kata {
    public static String createPhoneNumber(int[] numbers) {
      String areaCodeString;
      String prefixString;
      String lineNumberString;
      
      int areaCode = numbers[0] * 100 + numbers[1] * 10 + numbers[2];
      if(areaCode < 10){
        areaCodeString = "(00" + areaCode + ")";
      }else if(areaCode < 100){
        areaCodeString = "(0" + areaCode + ")";
      }else{
        areaCodeString = "(" + areaCode + ")";
      }
      
      
      int prefix = numbers[3] * 100 + numbers[4] * 10 + numbers[5];
      if(prefix < 10){
        prefixString = " 00" + prefix;
      }else if(prefix < 100){
        prefixString = " 0" + prefix;
      }else{
        prefixString = " " + prefix;
      }
      
      int lineNumber = numbers[6] * 1000 + numbers[7] * 100 + numbers[8] * 10 + numbers[9];
      if(lineNumber < 10){
        lineNumberString = "-000" + lineNumber;
      }else if(lineNumber < 100){
        lineNumberString = "-00" + lineNumber;
      }else if(lineNumber < 1000){
        lineNumberString = "-0" + lineNumber;
      }else{
        lineNumberString = "-" + lineNumber;
      }
      
      return areaCodeString + prefixString + lineNumberString;
    }
  }