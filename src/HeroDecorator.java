public abstract class HeroDecorator implements Hero {
    private Hero hero;
     public void setHero(Hero hero){
         this.hero = hero;
     }
     public HeroDecorator(Hero hero){
         this.hero = hero;
     }
     @Override
    public String Items() {
         return hero.Items();
     }
}

