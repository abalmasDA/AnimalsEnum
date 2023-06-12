import java.beans.beancontext.BeanContext;

/**
 * Створіть проект за допомогою IntelliJ IDEA. Створіть перерахунковий тип (enum) Animals, що містить конструктор,
 * який повинен набувати цілого числа (вік тварини),
 * і містити перевантажений метод toString(), який повинен повертати назву екземпляра та вік тварини.
 */

public enum Animals {
    DOG(5),
    CAT(10),
    PIG(1),
    FOX(7),
    SNAKE(12),
    BEAR(20);

    private int ageAnimal;

    Animals(int ageAnimal) {
        this.ageAnimal = ageAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" + super.toString() + ", " +
                "age=" + ageAnimal +
                '}';
    }
}


