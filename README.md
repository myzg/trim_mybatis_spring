# trim_mybatis_spring
Spring整和Mybatis

这是 spring 真整合 mybatis 的简单示例，下面分别从三个方面，做简单的解释。

第一，SpringMvc 的基本配置。
  springMvc的基本配置很简单，都是基本配置，详细可看之前的文章
  
第二，Mybatis 的基本配置。
  关于Mybatis的基本配置，首先是有要有两个配置文件，一个根配置文件，一个mapper配置文件。

第三，整合配置。
  关于整合，首先配置数据源（datasource），其次再配置一个 mapper 接口对象，是通过org.mybatis.spring.mapper.MapperFactoryBean 配置的。
  还可以通过 org.mybatis.spring.mapper.ClassPathMapperScanner 扫描对象，设置扫描包，还有扫描对象自动添加 mapper ，而不用 每次都配置MapperFactoryBean 对象。
  
  
