package me.arunav.design.patterns.behavioral.strategy;

import me.arunav.design.patterns.behavioral.strategy.vo.AppDTO;
import me.arunav.design.patterns.behavioral.strategy.vo.SomeDomainDO;

import static me.arunav.design.patterns.behavioral.strategy.DynamicCodeValues.*;

public class Mapper {

    private CodeValue codeValue;

    public void mapCodeValues(AppDTO appDTO) {
        // Fetching code values
        codeValue = CodeValueCache.getCodeValue(appDTO.getKey());
        StaticCodeValues staticCodeValues = codeValue.getStaticCodeValues();
        DynamicCodeValues dynamicCodeValues = codeValue.getDynamicCodeValues();

        // Mapping to SomeDomainDO after fetching the code values
        SomeDomainDO someDomainDO = new SomeDomainDO();
        someDomainDO.setAttr1(staticCodeValues.getAttr1());
        someDomainDO.setAttr2List(staticCodeValues.getAttr2());
        someDomainDO.setAmount(transform2(dynamicCodeValues::getAmount, appDTO));
        someDomainDO.setStatus(transform(dynamicCodeValues.getStatus(), appDTO));
        someDomainDO.setTimeStamp(transform(dynamicCodeValues.getDate(), appDTO.getDate()));
        someDomainDO.setDescription(fetch(dynamicCodeValues.getDescription()));

        // Logging SomeDomainDO object
        System.out.println(someDomainDO.toString());
    }

}
