public class Main {
    public static void main(String[] args) {
       Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setTypeAttack("physical");
        System.out.println("Параметры Босса: " + "\n" + "Жизнь: " + boss.getHealth() + "\n" + "Урон: " + boss.getDamage() + "\n" + "Тип атаки: " + boss.getTypeAttack());
  
    }
}