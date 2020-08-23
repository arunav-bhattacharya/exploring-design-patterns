package me.arunav.design.patterns.behavioral.strategy;

import me.arunav.design.patterns.behavioral.strategy.vo.AppDTO;
import me.arunav.design.patterns.behavioral.strategy.vo.SomeDomainDO;

public class Mapper {

    private CodeValue codeValue;

    public void mapCodeValues(AppDTO appDTO) {
        codeValue = CodeValueCache.getCodeValue(appDTO.getKey());
        StaticCodeValues staticCodeValues = codeValue.getStaticCodeValues();
        DynamicCodeValues dynamicCodeValues = codeValue.getDynamicCodeValues();

        SomeDomainDO someDomainDO = new SomeDomainDO();

        someDomainDO.setAttr1(staticCodeValues.getAttr1());
        someDomainDO.setAttr2List(staticCodeValues.getAttr2());
        someDomainDO.setAmount(dynamicCodeValues.getAmount().apply(appDTO));
        someDomainDO.setStatus(dynamicCodeValues.getStatus().apply(appDTO));
        someDomainDO.setTimeStamp(dynamicCodeValues.getDate().apply(appDTO.getDate()));
        someDomainDO.setDescription(dynamicCodeValues.getDescription().get());
        System.out.println(someDomainDO.toString());
    }
}
