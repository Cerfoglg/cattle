package io.github.ibuildthecloud.dstack.api.auth.impl;

import io.github.ibuildthecloud.dstack.archaius.util.ArchaiusUtil;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.netflix.config.DynamicBooleanProperty;
import com.netflix.config.DynamicStringProperty;

public class ArchaiusPolicyOptions implements PolicyOptions {

    private static String PROP_FORMAT = "account.type.%s.%s";

    Map<String,DynamicBooleanProperty> bools = new ConcurrentHashMap<String, DynamicBooleanProperty>();
    Map<String,DynamicStringProperty> strings = new ConcurrentHashMap<String, DynamicStringProperty>();
    String name;

    public ArchaiusPolicyOptions(String name) {
        this.name = name;
    }

    @Override
    public boolean isOption(String optionName) {
        DynamicBooleanProperty prop = bools.get(optionName);
        if ( prop == null ) {
            prop = ArchaiusUtil.getBoolean(String.format(PROP_FORMAT, name, optionName));
            bools.put(optionName, prop);
        }
        return prop.get();
    }

    @Override
    public String getOption(String optionName) {
        DynamicStringProperty prop = strings.get(optionName);
        if ( prop == null ) {
            prop = ArchaiusUtil.getString(String.format(PROP_FORMAT, name, optionName));
            strings.put(optionName, prop);
        }
        return prop.get();
    }

}
