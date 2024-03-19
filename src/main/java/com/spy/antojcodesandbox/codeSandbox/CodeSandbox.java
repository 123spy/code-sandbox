package com.spy.antojcodesandbox.codeSandbox;

import com.spy.antojcodesandbox.model.ExecuteCodeRequest;
import com.spy.antojcodesandbox.model.ExecuteCodeResponse;

/**
 * 沙箱定义接口
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
