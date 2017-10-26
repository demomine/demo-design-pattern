package com.lance.demo.pattern.factory;

public class FactoryDemo {
    public void product() {
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile exportFileA = exportFactory.export("standard");
        exportFileA.export("test");
        ExportFile exportFileB = exportFactory.export("financial");
        exportFileB.export("test");

        exportFactory = new ExportPdfFactory();
        exportFileA = exportFactory.export("standard");
        exportFileA.export("test");
        exportFileB = exportFactory.export("financial");
        exportFileB.export("test");
    }
}
