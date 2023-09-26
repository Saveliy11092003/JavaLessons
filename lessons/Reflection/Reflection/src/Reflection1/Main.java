package Reflection1;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class employeeClass = Class.forName("Reflection1.Employee");

        Field field1 = employeeClass.getField("id");
        System.out.println("Type of " + field1.getName() + " - " + field1.getType());
        System.out.println("***************");

        Field[] fields = employeeClass.getFields();
        for(Field field : fields){
            System.out.println("Type of " + field.getName() + " - " + field.getType());
        }

        System.out.println("***************");

        Field[] allFields = employeeClass.getDeclaredFields();
        for(Field field : allFields){
            System.out.println("Type of " + field.getName() + " - " + field.getType());
        }

        System.out.println("***************");

        Method method = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Name method " + method.getName() + " Return type of method " + method.getReturnType() +
                " parametr types " + Arrays.toString(method.getParameterTypes()));

        System.out.println("***************");

        Method[] methods = employeeClass.getMethods();
        for(Method method1 : methods){
            System.out.println(method1.getName() + ", Return type of method " + method1.getReturnType() +
                    ", parametr types " + Arrays.toString(method1.getParameterTypes()));
        }

        System.out.println("***************");

        Method[] allMethods = employeeClass.getDeclaredMethods();
        for(Method method1 : allMethods){
            System.out.println(method1.getName() + ", Return type of method " + method1.getReturnType() +
                    ", parametr types " + Arrays.toString(method1.getParameterTypes()));
        }

        System.out.println("***************");

        Method[] allPublicMethods = employeeClass.getDeclaredMethods();
        for(Method method1 : allPublicMethods){
            if(Modifier.isPublic(method1.getModifiers()))
            System.out.println(method1.getName() + ", Return type of method " + method1.getReturnType() +
                    ", parametr types " + Arrays.toString(method1.getParameterTypes()));
        }

        System.out.println("***************");

        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println(constructor1.getName() + "has " + constructor1.getParameterCount() +" parameters " +
                "their types are " + Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("***************");

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println(constructor2.getName() + "has " + constructor2.getParameterCount() +" parameters " +
                "their types are " + Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("***************");

        Constructor constructor3 = employeeClass.getConstructor(int.class, String.class, String.class, double.class);
        System.out.println(constructor3.getName() + "has " + constructor3.getParameterCount() +" parameters " +
                "their types are " + Arrays.toString(constructor3.getParameterTypes()));

        System.out.println("***************");
        Constructor<Employee> constructor = employeeClass.getConstructor(int.class, String.class,String.class);
        Object object = constructor.newInstance(23,"vova","it");
        System.out.println(object);

        Method method1 = employeeClass.getMethod("setSalary", double.class);
        method1.invoke(object, 200);
        System.out.println(object);
        System.out.println("***************");
        Employee employee = new Employee(23,"stanok", "it");
        Class empClass = employee.getClass();

        Field field = empClass.getDeclaredField("salary");
        field.setAccessible(true);
        field.set(employee,1000);
        System.out.println(field.get(employee));
    }
}