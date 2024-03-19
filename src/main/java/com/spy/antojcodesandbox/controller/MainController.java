package com.spy.antojcodesandbox.controller;

import com.spy.antojcodesandbox.codeSandbox.CodeSandbox;
import com.spy.antojcodesandbox.codeSandbox.CodeSandboxFactory;
import com.spy.antojcodesandbox.codeSandbox.JavaDockerCodeSandbox;
import com.spy.antojcodesandbox.model.ExecuteCodeRequest;
import com.spy.antojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController("/")
public class MainController {

    @Resource
    private JavaDockerCodeSandbox javaDockerCodeSandbox;

    @GetMapping("/")
    public String getString() {
        return "Hello";
    }

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    @PostMapping("/executeCode")
    ExecuteCodeResponse executeCode(@RequestBody ExecuteCodeRequest executeCodeRequest, HttpServletRequest request,
                                    HttpServletResponse response) {
        // 基本的认证
        if (executeCodeRequest == null) {
            throw new RuntimeException("请求参数为空");
        }
        String language = executeCodeRequest.getLanguage();
        CodeSandbox codeSandbox = CodeSandboxFactory.newInstance(language);
        return codeSandbox.executeCode(executeCodeRequest);
    }
}
