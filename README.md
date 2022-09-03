# java-stack
* Main icine yazilacak kod calistirildiginda komut satiri argumani olarak alinacak iki farkli degerin(metnin) birbirine esit olup olmadigi kontrol edilecektir. Program, ekrana degerler esitse true; degilse false yazdiracaktir.
* Arguman olarak verilecek stringlerde karsilasabileceginiz `%` karakteri ozel bir karakter olarak degerlendirilmelidir. Bu karakter stringdeki kendinden bir soldaki karakteri siler. Komut satiri argumanlarindaki `%` karakteri ile klavyedeki Backspace tusunun ayni islevi yerine getirdigini soyleyebiliriz.

### Projenin Derlenmesi

```bash
javac Main.java Stack.java
```

### Projenin Calistirilmasi

```bash
java Main nku nku
true
java Main nku nkuu
false
java Main yemek% yeme
true
java Main abc%d abd
true
java aa%% a
false
java App Apple%%
true
java ge%l go%l
true
java aa%% bb%%
true
java aa%%% dd%%
true
java %% %
true
java www www
true
java ftp http
false

