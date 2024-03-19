package com.spy.antojcodesandbox.codeSandbox;

public class CodeSandboxFactory {

    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "java":
                return new JavaDockerCodeSandbox();
            case "c_cpp":
                return new CppDockerCodeSandbox();
            default:
                return new CppDockerCodeSandbox();
        }
    }

}
