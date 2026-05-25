package io.github.joeljeremy.emissary.core.internal;

import io.github.joeljeremy.emissary.core.EmissaryException;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

/**
 * Utility to create lambda functions using {@code LambdaMetafactory}.
 */
@Internal
public class LambdaFactory {

    private static final FunctionalInterfaceMethodMap FUNCTIONAL_INTERFACE_METHOD_MAP = new FunctionalInterfaceMethodMap();

    private LambdaFactory() {
    }

    /**
     * Create a lambda function using {@code LambdaMetafactory}.
     *
     * @param <T> The functional interface.
     * @param targetMethod The method which will be targeted by the lambda function.
     * @param functionalInterface The interface to serve as the functional interface.
     * @return The instantiated lambda function which targets the specified target method.
     */
    public static <T> T createLambdaFunction(Method targetMethod, Class<T> functionalInterface) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static class FunctionalInterfaceMethodMap extends ClassValue<Method> {

        /**
         * Get the single abstract method (SAM) of the functional interface.
         */
        @Override
        protected Method computeValue(Class<?> functionalInterface) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
