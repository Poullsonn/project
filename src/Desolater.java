public class Desolater extends HeroDecorator{
    public Desolater(Hero hero){
        super(hero);
    }
    public String DesolaterItem(){
        return " Desolater";
    }
    @Override
    public String Items(){
        return super.Items() + DesolaterItem();
    }
    @Override
    public void setHero(Hero hero) {
        super.setHero(hero);
    }
}
