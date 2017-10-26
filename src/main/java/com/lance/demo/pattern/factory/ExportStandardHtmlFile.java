package com.lance.demo.pattern.factory;

public class ExportStandardHtmlFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出 标准 HTML文件");
        return true;
    }
}
