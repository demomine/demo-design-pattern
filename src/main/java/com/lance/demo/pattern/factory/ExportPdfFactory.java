package com.lance.demo.pattern.factory;

public class ExportPdfFactory implements ExportFactory{
    @Override
    public ExportFile export(String type) {
        if("standard".equals(type)){
            return new ExportStandardPdfFile();
        }else if("financial".equals(type)){
            return new ExportFinacialPdfFile();
        }else{
            throw new RuntimeException("没有找到对象");
        }
    }
}
