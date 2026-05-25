package io.github.joeljeremy.emissary.core;

import static java.util.Objects.requireNonNull;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import org.jspecify.annotations.Nullable;

/**
 * Type-related utility methods. This provides useful utility methods to extract type information
 * from Java's {@link Type} class.
 */
public class TypeUtilities {

    // To prevent repeated creation of arrays just to get the array class.
    private static final ClassValue<Class<?>> ARRAY_TYPE_CACHE = new ClassValue<Class<?>>() {

        @Override
        protected Class<?> computeValue(Class<?> type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    };

    private TypeUtilities() {
    }

    /**
     * Extract raw class of the given type.
     *
     * @param type The type to derive the raw class from.
     * @return The raw class of the given type.
     * @throws IllegalArgumentException if the type null or is unsupported.
     */
    public static Class<?> getRawType(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Extract the specified type's generic type parameters, if it has any.
     *
     * @param type The type to extract type parameters from.
     * @return The array of generic type parameters, if the specified type has any.
     */
    public static Type[] getTypeParameters(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Check is type is a {@link Class} instance.
     *
     * @param type The type to check.
     * @return {@code true}, if type is a {@link Class}. Otherwise, {@code false}.
     */
    public static boolean isClass(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Attempt to cast the type to a {@link Class} if it's a {@link Class} instance. Otherwise, {@code
     * null} is returned.
     *
     * @param type The type to cast.
     * @return The {@link Class} instance if the given type is a {@link Class} instance. Otherwise,
     *     {@code null}.
     */
    @Nullable
    public static Class<?> asClass(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Check is type is a {@link ParameterizedType} instance.
     *
     * @param type The type to check.
     * @return {@code true}, if type is a {@link ParameterizedType}. Otherwise, {@code false}.
     */
    public static boolean isParameterizedType(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Attempt to cast the type to a {@link ParameterizedType} if it's a {@link ParameterizedType}
     * instance. Otherwise, {@code null} is returned.
     *
     * @param type The type to cast.
     * @return The {@link ParameterizedType} instance if the given type is a {@link ParameterizedType}
     *     instance. Otherwise, {@code null}.
     */
    @Nullable
    public static ParameterizedType asParameterizedType(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Check is type is a {@link GenericArrayType} instance.
     *
     * @param type The type to check.
     * @return {@code true}, if type is a {@link GenericArrayType}. Otherwise, {@code false}.
     */
    public static boolean isGenericArrayType(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Attempt to cast the type to a {@link GenericArrayType} if it's a {@link GenericArrayType}
     * instance. Otherwise, {@code null} is returned.
     *
     * @param type The type to cast.
     * @return The {@link GenericArrayType} instance if the given type is a {@link GenericArrayType}
     *     instance. Otherwise, {@code null}.
     */
    @Nullable
    public static GenericArrayType asGenericArrayType(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Check is type is a {@link TypeVariable} instance.
     *
     * @param type The type to check.
     * @return {@code true}, if type is a {@link TypeVariable}. Otherwise, {@code false}.
     */
    public static boolean isTypeVariable(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Attempt to cast the type to a {@link TypeVariable} if it's a {@link TypeVariable} instance.
     * Otherwise, {@code null} is returned.
     *
     * @param type The type to cast.
     * @return The {@link TypeVariable} instance if the given type is a {@link TypeVariable} instance.
     *     Otherwise, {@code null}.
     */
    @Nullable
    public static TypeVariable<GenericDeclaration> asTypeVariable(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Check is type is a {@link WildcardType} instance.
     *
     * @param type The type to check.
     * @return {@code true}, if type is a {@link WildcardType}. Otherwise, {@code false}.
     */
    public static boolean isWildcardType(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Attempt to cast the type to a {@link WildcardType} if it's a {@link WildcardType} instance.
     * Otherwise, {@code null} is returned.
     *
     * @param type The type to cast.
     * @return The {@link WildcardType} instance if the given type is a {@link WildcardType} instance.
     *     Otherwise, {@code null}.
     */
    @Nullable
    public static WildcardType asWildcardType(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get array type of the given type.
     *
     * @param type The type to derive the type from.
     * @return The array type of the given type.
     * @throws IllegalArgumentException if the type is unsupported.
     */
    public static Type getArrayType(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get raw array class of the given type.
     *
     * @param type The type to derive the raw class from.
     * @return The raw array class of the given type.
     * @throws IllegalArgumentException if the type is unsupported.
     */
    public static Class<?> getRawArrayType(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * A synthetic implementation of {@code GenericArrayType}.
     */
    private static final class SyntheticGenericArrayType implements GenericArrayType {

        private final Type genericComponentType;

        /**
         * Constructor.
         *
         * @param genericComponentType The generic array's generic component type.
         */
        private SyntheticGenericArrayType(Type genericComponentType) {
            this.genericComponentType = genericComponentType;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public Type getGenericComponentType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
