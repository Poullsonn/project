public class Travel_boots extends HeroDecorator{
    public Travel_boots(Hero hero){
        super(hero);
    }
    public String Travel_bootsItem(){
        return " Travel_boots";
    }
    @Override
    public String Items(){
        return super.Items() + Travel_bootsItem();
    }
    @Override
    public void setHero(Hero hero) {
        super.setHero(hero);
    }
}
