package com.study;

import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

public class Attach {
    public static void main(String[] args) {
        VirtualMachine vm = null;
        try {
            vm = VirtualMachine.attach("25548");
//            vm.loadAgent("/Users/jarry/IdeaProjects/agent-demo/target/agent-demo-1.0-SNAPSHOT.jar");//java agent jar包路径
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (vm != null) {
                try {
                    vm.detach();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
