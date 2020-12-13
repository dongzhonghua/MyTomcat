[TOC]

# tomdog
这个项目期初只有myTomcat一个项目，参考了一个大佬的文章，用几百行代码把Tomcat的原理非常清晰的讲明白了。
主要的功能包含socket服务，将HTTP请求封装成自己的Request和Response。提供了servlet风格的接口，实现了dispatch功能。
总之非常牛逼。后来对他进行了改进，每一次添加servlet都需要加一行配置，所以我就想到使用spring风格的注解来完成servlet的自动扫描。
写完之后我就发现，这不就是实现了一个简易版的IOC吗。
于是我就想能不能多干点，继续完善这个项目，把IOC的功能继续完善并且实现AOP等功能？
就在这时我发现网上了一个开源项目，[smart-framework](https://my.oschina.net/huangyong/blog/158380)。
这个项目是黄勇大佬13年的开源项目，实现的功能直到今天也是开发过程中会用到的主流技术。而且代码风格简洁，用到了很多牛逼的技术，
实现一些功能的时候往往用十几行代码就能完成，非常的适合初学者。

研究了一番之后，我便决定参照这个项目自己再实现一遍，毕竟造轮子使我快乐，主要就是实现类似spring的IOC和AOP功能。
另外，项目很久没有维护了，有必要加入一些新的特性。而且我也发现了项目中一些可以优化的点，我会把这些一起都放在我的这个项目里。

## myTomcat
原文地址：https://www.jianshu.com/p/dce1ee01fb90

## myTomdog

系列地址：