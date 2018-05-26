package com.iuminov.classes;

import java.util.Stack;

public class UnixPathTask {
    static Stack<String> cacheStack = new Stack<>();

    static String execute(String input) {
        char[] inputArray = (input + "/").toCharArray();
        StringBuilder cache = new StringBuilder();

        for (int i = 0; i < inputArray.length; i++) {
            cache.append(inputArray[i]);

            if (inputArray[i] == '/') {
                if (cache.toString().equals("//") || cache.toString().equals("/./")) {
                    cache.setLength(1);
                } else if (cache.toString().equals("/../")) {
                    removeTopFromCache();
                    cache.setLength(1);
                } else {
                    appendCache(cache);
                    cache.setLength(0);
                    cache.append('/');
                }
            }
        }

        if (cache.length() != 1 || (cache.length() == 1 && cacheStack.empty())) {
            cacheStack.push(cache.toString());
        }

        return cacheStack.stream()
                .reduce("", String::concat);
    }

    private static void removeTopFromCache() {
        if (!cacheStack.empty()) {
            cacheStack.pop();
        }
    }

    private static void appendCache(StringBuilder cache) {
        if (cache.length() == 1) {
            return;
        }
        cacheStack.push(cache.deleteCharAt(cache.length() - 1).toString());
    }
}
