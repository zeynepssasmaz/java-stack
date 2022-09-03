public class Main {
    public static void main(String args[]){
        // main fonksiyonun icini uygun sekilde doldurunuz. 
String b =args[1];
String  a=args[0];
int size=a.length();
int size2=b.length();
Stack  s1 = new Stack(size);
Stack  s2 = new Stack(size2); 
 
 for (int i = 0; i < a.length(); i++){
 char c = a.charAt(i);
    s1.push(c);
if(c=='%' ){
if(s1.size()==0)
break;
s1.pop();
if(s1.size()==0)
break;
s1.pop();}
}

for (int j = 0; j < b.length(); j++){
            char d = b.charAt(j);
      s2.push(d);
if(d=='%') {
if(s2.size()==0)
break;
s2.pop();
if(s2.size()==0)
break;
s2.pop();}
}
System.out.println(s1.Equal(s1,s2));

}

}

