public class Force_Staff extends HeroDecorator{
    public Force_Staff(Hero hero){
        super(hero);
    }
    public String Force_StaffItem(){
        return " Force_Staff";
    }
    @Override
    public String Items(){
        return super.Items() + Force_StaffItem();
    }
    @Override
    public void setHero(Hero hero) {
        super.setHero(hero);
    }
}
