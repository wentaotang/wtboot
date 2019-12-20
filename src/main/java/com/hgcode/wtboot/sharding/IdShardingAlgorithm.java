package com.hgcode.wtboot.sharding;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class IdShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Long> shardingValue) {
        if (shardingValue.getColumnName().equals("id")) {
            long idx  = shardingValue.getValue() % 8;
            Set<String> availableTargetNamesSet= availableTargetNames.stream().collect(Collectors.toSet());
            String temp = shardingValue.getLogicTableName()+"_"+idx;
            if(availableTargetNamesSet.contains(temp)){
                return temp;
            }
        }
        return null;
    }
}
