package com.github;

public class Main {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                                    "892312312", 5, 11);
        persArray[1] = new Employee("Абобуй Абоба Абобьевич", "Собиратель бананов",
                                    "ABOBA@banan.com", "+7(777)888-00-00",
                                    500,20);
        persArray[2] = new Employee("Виктор Викторович Витя", "Трудовик",
                                    "VITEK@banan.com", "+7(555)888-00-00",
                                    3000,45);
        persArray[3] = new Employee("Обамович Обама Абобы", "ПРЕЗИДЕНТ США",
                                    "ОБАМА@banan.com", "+7(777)777-00-00",
                                    20000000,40);
        persArray[4] = new Employee("ВВП", "КРЕМЛЬ",
                                    "ВВП@banan.com", "+7(777)777-77-77-777-777-777-777-777",
                                    999999999999999999L,620);

        int Sum = 0;
        for (int i = 0; i < persArray.length; i++){
            if(persArray[i].getAge() > 40) {
                persArray[i].out();
                Sum++;
            }
            if(persArray[i].getIsRetired()) System.out.println("  Пенсионер");
            System.out.println();
        }
        System.out.println("Количество сотрудников "+Sum);
    }
}
