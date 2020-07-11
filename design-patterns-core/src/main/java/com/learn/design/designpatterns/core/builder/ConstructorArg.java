package com.learn.design.designpatterns.core.builder;

public class ConstructorArg {

    /**
     * 在下面的 ConstructorArg 类中，
     * 当 isRef 为 true 的时候，arg 表示 String 类型的 refBeanId，type 不需要设置；
     * 当 isRef 为 false 的时候，arg、type 都需要设置。
     * 请根据这个需求，完善 ConstructorArg 类。
     */
    private boolean isRef;
    private Class type;
    private Object arg;

    public ConstructorArg(Builder builder) {
        this.isRef = builder.isRef;
        this.type = builder.type;
        this.arg = builder.arg;
    }

    public static class Builder {

        private boolean isRef = false;
        private Class type;
        private Object arg;

        public ConstructorArg build() {
            if (isRef) {
                if (arg == null) {
                    throw new IllegalArgumentException("arg cannot be null");
                }

                if ("java.lang.String".equals(arg.getClass().getName())) {
                    throw new IllegalArgumentException("arg wrong type");
                }
            } else {
                if (arg == null) {
                    throw new IllegalArgumentException("arg cannot be null");
                }

                if (type == null) {
                    throw new IllegalArgumentException("type cannot be null");
                }
            }

            return new ConstructorArg(this);
        }

        public Builder setRef(boolean ref) {
            isRef = ref;
            return this;
        }

        public Builder setType(Class type) {
            this.type = type;
            return this;
        }

        public Builder setArg(Object arg) {
            this.arg = arg;
            return this;
        }
    }

    public boolean isRef() {
        return isRef;
    }

    public Class getType() {
        return type;
    }

    public Object getArg() {
        return arg;
    }
}
