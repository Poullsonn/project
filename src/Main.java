public class Main {
    public static void main(String[] args) {
        physicalDamage damage = new physicalDamage();
        Hero hero = new Hero();
        MagicalDamage magicalDamage = new DamageAdaptor(damage);
        hero.attack(magicalDamage);
        hero.attack(damage);
    }
}
