package org.cloudfoundry.samples.music.config;

import org.cloudfoundry.samples.music.domain.RandomIdGenerator;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;

public class IdGeneratorRuntimeHints implements RuntimeHintsRegistrar {

    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        hints.reflection().registerType(RandomIdGenerator.class,
                MemberCategory.INVOKE_DECLARED_CONSTRUCTORS);
    }

}
