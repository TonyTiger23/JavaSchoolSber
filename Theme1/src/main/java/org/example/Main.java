package org.example;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private final ArrayGenerator generator;
    private final Sorter sorter;
    private final Searcher searcher;
    private final ResultPrinter printer;

    public Main(ArrayGenerator generator, Sorter sorter, Searcher searcher, ResultPrinter printer) {
        this.generator = generator;
        this.sorter = sorter;
        this.searcher = searcher;
        this.printer = printer;
    }

    public void run() {
        int[] array = generator.generateArray(10, 0, 100);
        printer.printArray(array, "Unsorted Array");
        sorter.bubbleSort(array);
        printer.printArray(array, "Sorted Array");

        int target = 50;
        int index = searcher.binarySearch(array, target);
        printer.printSearchResult(target, index);
    }

    public static void main(String[] args) {

        Main app = new Main(new ArrayGenerator(), new Sorter(), new Searcher(), new ResultPrinter());
        app.run();


        Shape circle = new Circle("Red", true, 5.0);
        Shape rectangle = new Rect("Blue", false, 10.0, 5.0);
        Shape square = new Square("Green", true, 5.0);
        Shape triangle = new Triangle("Black", false, 5.0,5.0,5.0);

        System.out.println(circle.getDescription() + " "+circle.getArea() + " "+ circle.getPerimeter());
        System.out.println(rectangle.getDescription() + " "+rectangle.getArea() + " "+ rectangle.getPerimeter());
        System.out.println(square.getDescription() + " "+square.getArea() + " "+ square.getPerimeter());
        System.out.println(triangle.getDescription() + " "+triangle.getArea() + " "+ triangle.getPerimeter());




        TemperatureInput temperatureInput = new TemperatureInput();
        double celsiusTemperature = temperatureInput.getInput();


        TemperatureConverter fahrenheitConverter = new CelsiusToFahrenheitConverter();
        TemperatureConverterService fahrenheitService = new TemperatureConverterService(fahrenheitConverter);
        double fahrenheitTemperature = fahrenheitService.convert(celsiusTemperature);
        System.out.println("Temperature in Fahrenheit: " + fahrenheitTemperature);


        TemperatureConverter kelvinConverter = new CelsiusToKelvinConverter();
        TemperatureConverterService kelvinService = new TemperatureConverterService(kelvinConverter);
        double kelvinTemperature = kelvinService.convert(celsiusTemperature);
        System.out.println("Temperature in Kelvin: " + kelvinTemperature);

    }
}



