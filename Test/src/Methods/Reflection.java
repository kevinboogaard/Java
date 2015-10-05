package Methods;

public class Reflection {
	/**
     * Get the caller class.
     * @param level The level of the caller class.
     *              For example: If you are calling this class inside a method and you want to get the caller class of that method,
     *                           you would use level 2. If you want the caller of that class, you would use level 3.
     *
     *              Usually level 2 is the one you want.
     * @return The caller class.
     * @throws ClassNotFoundException We failed to find the caller class.
     */
    public static Class getCallerClass(int level) throws ClassNotFoundException {
        StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
        String rawFQN = stElements[level+1].toString().split("\\(")[0];
        return Class.forName(rawFQN.substring(0, rawFQN.lastIndexOf('.')));
    }
}
