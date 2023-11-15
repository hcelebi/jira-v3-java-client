package io.github.hcelebi.jirav3.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serial;

@Getter
@AllArgsConstructor
public class JiraV3RunTimeException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -3829641624015437540L;

    public JiraV3RunTimeException(String message) {
        super(message);
    }
}
