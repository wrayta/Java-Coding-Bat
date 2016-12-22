public int countYZ(String str) {
  int count = 0;
  String[] words = str.split("\\s+");
  
  for(int i = 0; i < words.length; i++){
    for(int j = 0; j < words[i].length(); j++){
      if(j + 1 <= words[i].length() - 1){
        if( !(Character.isLetter((words[i].charAt(j + 1)))) ){
          if( (words[i].charAt(j) == 'y')
            || (words[i].charAt(j) == 'Y')
            || (words[i].charAt(j) == 'z') 
            || (words[i].charAt(j) == 'Z')){
              count++;
            }
        }
      }
      else if( (words[i].charAt(j) == 'y') 
            || (words[i].charAt(j) == 'Y')
            || (words[i].charAt(j) == 'z') 
            || (words[i].charAt(j) == 'Z')){
              count++;
            }
    }
  }
  
  return count;
}