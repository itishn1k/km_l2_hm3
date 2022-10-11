public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        this.amount += sum;
        System.out.println("Ваш счёт пополнен на: " + sum + "$ USD" +
                "\nВаш текущий счёт: " + amount + "$ USD\n");
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > getAmount()) {
            throw new LimitException("Сумма сумма снятия больше остатка", getAmount());
        } else {
            System.out.println("Ввы можете снять со счета: " + getAmount());
            this.amount -= sum;
            System.out.println("С вашего счета было снято: " + sum + "$ USD" +
                    "\nВаш текущий счёт: " + amount + "$ USD\n");
        }
    }
}
