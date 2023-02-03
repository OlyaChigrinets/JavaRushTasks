package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes jpg) {

        if (jpg == ImageTypes.JPG) return new JpgReader();
        if (jpg == ImageTypes.BMP) return new BmpReader();
        if (jpg == ImageTypes.PNG) return new PngReader();

        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
