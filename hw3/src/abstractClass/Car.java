package abstractClass;

public abstract class Car {
    protected  String  brand;
    protected String model;
    protected String color;
    protected String bodyType;
    protected Integer countOfWheels;
    protected String fuelType;
    protected String transmissionType;
    protected Float engineCapacity;
    public Car(String model){
        this.model=model;
    }
    public abstract String movement();
    public abstract String service();
    public abstract String gearShifting();
    public abstract String toggleTheHeadlights();
    public abstract String toggleTheWipers();
    public abstract String sweeping();
    //  public abstract String turningOnTheFogLights();
    //  public abstract String shipping();

}
//Такое проектирование противоречит принципу SRP.
// Необходимо убрать метод обслуживание(service) из абстрактного класса Car.
//Обслуживанием должен заниматься другой класс.

//При добавлении методов включение противотуманных фар(turningOnTheFogLights), перевозка груза(shipping)
//в абстрактный класс Car, мы получаем новые зависимости-методы, которые необходимо реализовать у уже
//созданных доченних классов. Получаем нарушение принципа OCP. Так же добавление метода  подметать улицы(sweeping)
//может быть не у всех экземпляров дочерних классов. Класс должен быть открыт для расширения и закрыт для модификации
//Для этого мы оставляем в абстрактном классе только методы, которые можно реализовать у всех автомобилей, а
// дополнительные методы имплементируем из вспомогательных классов.

//При создании класса с трехколесными автомобилями(Tricycle) мы получаем очередное подтверждение несовершенности нашей
// архитектуры, нарушение принципа LSP. Не все методы абстрактного класса реализуются.