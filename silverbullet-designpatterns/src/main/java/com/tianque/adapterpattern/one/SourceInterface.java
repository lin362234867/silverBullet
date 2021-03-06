package com.tianque.adapterpattern.one;

/**
 * 《适配器模式》 对象适配器
 * 与代理模式，装饰者模式的差别
 * 适配器模式在于新加入不一样的接口（方法名或参数）。代理模式自持被代理的对象，实现原接口并基于原有接口扩展。装饰者也要实现原接口，但是他从外部接收被装饰的对象，并
 * 应用场景：
 1 系统需要使用现有的类，而这些类的接口不符合系统的需要。
 2 想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。
 3 需要一个统一的输出接口，而输入端的类型不可预知。
 */
public interface SourceInterface {
    public void dosomething(String i,String j,String k);
}
