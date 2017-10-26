package com.lance.demo.pattern.factory;

public class ExportStandardPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出 标准 PDF文件");
        return true;
    }
}
