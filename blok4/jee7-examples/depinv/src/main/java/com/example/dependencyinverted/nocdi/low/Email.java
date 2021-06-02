package com.example.dependencyinverted.nocdi.low;

import com.example.dependencyinverted.nocdi.high.Sendable;

import static com.example.dependencyinverted.cdi.util.Values.OK;

// Low level module, depends on high level Sendable
public class Email implements Sendable {

    private String run() {
        System.out.println("sending email.....");
        // ....
        return OK;
    }

    @Override
    public String send() {
        return run();
    }
}
