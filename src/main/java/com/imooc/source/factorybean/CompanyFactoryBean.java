package com.imooc.source.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author madison
 * @description
 * @date 2021/5/30 12:50
 */
public class CompanyFactoryBean implements FactoryBean<Company> {
    private String companyInfo;//注入公司名称,地址,规模  以逗号分隔

    public void setCompanyInfo(String companyInfo) {
        this.companyInfo = companyInfo;
    }

    @Override
    public Company getObject() throws Exception {
        //创建复杂对象Company
        Company company = new Company();
        String[] split = companyInfo.split(",");
        company.setName(split[0]);
        company.setAddress(split[1]);
        company.setScale(Integer.parseInt(split[2]));
        return company;
    }

    @Override
    public Class<?> getObjectType() {
        return Company.class;
    }

    @Override

    public boolean isSingleton() {
        //是否是单例
        return true;
    }
}
