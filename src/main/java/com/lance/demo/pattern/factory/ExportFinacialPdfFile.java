package com.lance.demo.pattern.factory;

public class ExportFinacialPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出 金融 PDF文件");
        return true;
    }
}
