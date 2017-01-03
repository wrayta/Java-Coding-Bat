/*
 * Given a string, return a string where every appearance of the lowercase word
 * "is" has been replaced with "is not". The word "is" should not be immediately
 * preceeded or followed by a letter -- so for example the "is" in "this" does
 * not count. (Note: Character.isLetter(char) tests if a char is a letter.)
 *
 * notReplace("is test") → "is not test"
 * notReplace("is-is") → "is not-is not"
 * notReplace("This is right") → "This is not right"
 */
public String notReplace(String str) 
{
  StringBuilder retStr = new StringBuilder();
  
  if(str.equals("is"))
  {
    return "is not";
  }
  
  if(str.contains("is")) 
  {
    
    for(int i = 0; i < str.length(); i++) 
    {
      if(i == 0 && str.charAt(i) == 'i'
        && (i + 2 < str.length()) && !Character.isLetter(str.charAt(i + 2)) 
        && str.charAt(i + 1) == 's') //"is" at beginning of word
      {
        retStr.append("is not");
        i++;
      }
      
      else if((i - 1 >= 0) && !Character.isLetter(str.charAt(i - 1)) 
        && (str.charAt(i) == 'i') && (i + 2 < str.length()) 
        && !Character.isLetter(str.charAt(i + 2)) && (str.charAt(i + 1) == 's')) //"is" in middle of word somewhere
      {
        retStr.append("is not");
        i++;
      }
      
      else if(i == str.length() - 2 && str.charAt(i) == 'i' && (i - 1 >= 0) 
        && !Character.isLetter(str.charAt(i - 1)) && (str.charAt(i + 1) == 's')) //"is" at end of word
      {
        retStr.append("is not");
        i++;
      }
      
      else
      {
        retStr.append(str.charAt(i));
      }
    }
  }
  
  return retStr.toString();
}