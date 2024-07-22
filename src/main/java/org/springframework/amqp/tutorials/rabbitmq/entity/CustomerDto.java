package org.springframework.amqp.tutorials.rabbitmq.entity;

public class CustomerDto {

    String name;
    Integer age;
    String branch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", branch='" + branch + '\'' +
                '}';
    }
}

