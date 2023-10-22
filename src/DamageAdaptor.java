public class DamageAdaptor implements MagicalDamage{
    private physicalDamage physicalDamage;

    public DamageAdaptor(physicalDamage physicalDamage){
        this.physicalDamage=physicalDamage;
    }
    @Override
    public void getMagicalDamage(){
       physicalDamage.getPhysicalDamage();
        System.out.println("converted to magical damage ");
    }
}
