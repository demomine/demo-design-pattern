package com.lance.demo.pattern.factory;

public class ExportFinancialHtmlFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出 金融 HTML文件");
        return true;
    }
}
