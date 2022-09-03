public class Stack {
    public char[] s;
    public int N;

    public Stack(int cap) {
        s = new char[cap];
    }

    public int size() {
        return N;
    }

    public boolean isEmpty(){
        return N == 0;
    }


    public void push(char item) {
        s[N++] = item;
    }

    public char pop() {
        return s[--N];
    }
    
    
    // Bu fonksiyon parametre olarak aldigi iki yiginin icerigi ayni ise true aksi halde false degerini dondurur.
    // Iki yiginda bos ise bu fonksiyon true degerini dondurur.
    // Iki yiginin da icerigi ayni fakat kapasiteleri farkli ise (s dizisinin eleman sayilari farkli ise) fonksiyon true degerini dondurur.
    // Fonksiyon taniminda (function signature) herhangi bir degisiklik yapmayiniz.
    
    public static boolean Equal(Stack s1, Stack s2){       
if(s1.isEmpty() && s2.isEmpty())
return true;
else{
while(s1.size()!=0 || s2.size()!=0){
if(s1.pop()!=s2.pop())
return false;
else{
if(s1.size()==0 || s2.size()==0)
break;
s1.pop();
s2.pop();
}
}
return true;
}

}
}
