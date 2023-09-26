public enum Animal {
    DOG("собака"), CAT("кот"), FROG("лягушка");

    String translation;

    Animal(String translation){
        this.translation = translation;
    }

    String getTranslation(){
        return translation;
    }

    public String toString(){
        return "Перевод на русский язык - " + translation;
    }
}
