
Ant的优点
    Ant是Apache软件基金会JAKARTA目录中的一个子项目，它有以下的优点。
    跨平台性.Ant是存Java语言编写的，所示具有很好的跨平台性.
    操作简单.Ant是由一个内置任务和可选任务组成的.Ant运行时需要一个XML文件(构建文件).
 
    Ant通过调用target树，就可以执行各种task.每个task实现了特定接口对象.由于Ant构建文件
 
    时XML格式的文件，所以和容易维护和书写，而且结构很清晰.
    Ant可以集成到开发环境中.由于Ant的跨平台性和操作简单的特点，它很容易集成到一些开发环境中去.
 
Ant 开发
 
Ant的构建文件
    当开始一个新的项目时，首先应该编写Ant构建文件.构建文件定义了构建过程，并被团队开发
 
    中每个人使用.Ant构建文件默认命名为build.xml，也可以取其他的名字.只不过在运行的时候
 
    把这个命名当作参数传给Ant.构建文件可以放在任何的位置.一般做法是放在项目顶层目录中
 
    ，这样可以保持项目的简洁和清晰.下面是一个典型的项目层次结构.
    (1) src存放文件.
    (2) class存放编译后的文件.
    (3) lib存放第三方JAR包.
    (4) dist存放打包，发布以后的代码.
Ant构建文件是XML文件.每个构建文件定义一个唯一的项目(Project元素).每个项目下可以定
 
义很多目标(target元素)，这些目标之间可以有依赖关系.当执行这类目标时，需要执行他们所
 
依赖的目标.
每个目标中可以定义多个任务，目标中还定义了所要执行的任务序列.Ant在构建目标时必须调
 
用所定义的任务.任务定义了Ant实际执行的命令.Ant中的任务可以为3类.
    （1） 核心任务.核心任务是Ant自带的任务.
    （2） 可选任务.可选任务实来自第三方的任务，因此需要一个附加的JAR文件.
    （3） 用户自定义的任务.用户自定义的任务实用户自己开发的任务.
1.<project>标签
   每个构建文件对应一个项目.<project>标签时构建文件的根标签.它可以有多个内在属性，
 
就如代码中所示，其各个属性的含义分别如下.
    (1) default表示默认的运行目标，这个属性是必须的.
    (2) basedir表示项目的基准目录.
    (3) name表示项目名.
    (4) description表示项目的描述.
每个构建文件都对应于一个项目，但是大型项目经常包含大量的子项目，每一个子项目都可以有
 
自己的构建文件.
 
2.<target>标签
一个项目标签下可以有一个或多个target标签.一个target标签可以依赖其他的target标签.例
 
如，有一个target用于编译程序，另一个target用于声称可执行文件.在生成可执行文件之前必
 
须先编译该文件，因策可执行文件的target依赖于编译程序的target.Target的所有属性如下.
    (1).name表示标明，这个属性是必须的.
    (2).depends表示依赖的目标.
    (3)if表示仅当属性设置时才执行.
    (4)unless表示当属性没有设置时才执行.
    (5)description表示项目的描述.
Ant的depends属性指定了target的执行顺序.Ant会依照depends属性中target出现顺序依次执行
 
每个target.在执行之前，首先需要执行它所依赖的target.程序中的名为run的target的
 
depends属性compile，而名为compile的target的depends属性是prepare，所以这几个target执
 
行的顺序是prepare->compile->run.
一个target只能被执行一次，即使有多个target依赖于它.如果没有if或unless属性，target总
 
会被执行.
 
3.<mkdir>标签
该标签用于创建一个目录，它有一个属性dir用来指定所创建的目录名，其代码如下：
<mkdir dir=”＄{class.root}”/>
通过以上代码就创建了一个目录，这个目录已经被前面的property标签所指定.
 
4<jar>标签
该标签用来生成一个JAR文件，其属性如下.
    (1) destfile表示JAR文件名.
    (2) basedir表示被归档的文件名.
    (3) includes表示别归档的文件模式.
    (4) exchudes表示被排除的文件模式.
 
5．<javac标签>
该标签用于编译一个或一组java文件，其属性如下.
    (1).srcdir表示源程序的目录.
    (2).destdir表示class文件的输出目录.
    (3).include表示被编译的文件的模式.
    (4).excludes表示被排除的文件的模式.
    (5).classpath表示所使用的类路径.
    (6).debug表示包含的调试信息.
    (7).optimize表示是否使用优化.
    (8).verbose 表示提供详细的输出信息.
    (9).fileonerror表示当碰到错误就自动停止.
 
6．<java>标签
该标签用来执行编译生成的.class文件，其属性如下.
    (1).classname 表示将执行的类名.
    (2).jar表示包含该类的JAR文件名.
    (3).classpath所表示用到的类路径.
    (4).fork表示在一个新的虚拟机中运行该类.
    (5).failonerror表示当出现错误时自动停止.
    (6).output 表示输出文件.
    (7).append表示追加或者覆盖默认文件.
 
7.<delete>标签
该标签用于删除一个文件或一组文件，去属性如下.
    (1)/file表示要删除的文件.
    (2).dir表示要删除的目录.
    (3).includeEmptyDirs 表示指定是否要删除空目录，默认值是删除.
    (4).failonerror 表示指定当碰到错误是否停止，默认值是自动停止.
    (5).verbose表示指定是否列出所删除的文件，默认值为不列出.
 
8.<copy>标签
该标签用于文件或文件集的拷贝，其属性如下.
    (1).file 表示源文件.
    (2).tofile 表示目标文件.
    (3).todir 表示目标目录.
    (4).overwrite 表示指定是否覆盖目标文件，默认值是不覆盖.
    (5).includeEmptyDirs 表示制定是否拷贝空目录，默认值为拷贝.
    (6).failonerror 表示指定如目标没有发现是否自动停止，默认值是停止.
    (7).verbose 表示制定是否显示详细信息，默认值不显示.
 
Ant的数据类型
在构建文件中为了标识文件或文件组，经常需要使用数据类型.数据类型包含在
 
org.apache.tool.ant.types包中.下面镜简单介绍构建文件中一些常用的数据类型.
 
1. argument 类型
由Ant构建文件调用的程序，可以通过<arg>元素向其传递命令行参数，如apply,exec和java任
 
务均可接受嵌套<arg>元素，可以为各自的过程调用指定参数.以下是<arg>的所有属性.
    (1).values 是一个命令参数.如果参数种有空格，但又想将它作为单独一个值，则使用此属性
 
    .
    (2).file表示一个参数的文件名.在构建文件中，此文件名相对于当前的工作目录.
    (3).line表示用空格分隔的多个参数列表.
    (4).path表示路径.
 
2.ervironment 类型
   由Ant构建文件调用的外部命令或程序，<env>元素制定了哪些环境变量要传递给正在执行的系
 
统命令，<env>元素可以接受以下属性.
    (1).file表示环境变量值得文件名.此文件名要被转换位一个绝对路径.
    (2).path表示环境变量的路径.Ant会将它转换为一个本地约定.
    (3).value 表示环境变量的一个直接变量.
    (4).key 表示环境变量名.
注意   file path 或 value只能取一个.
 
3.filelist类型
Filelist 是一个支持命名的文件列表的数据类型，包含在一个filelist类型中的文件不一定是
 
存在的文件.以下是其所有的属性.
    (1).dir是用于计算绝对文件名的目录.
    (2).files 是用逗号分隔的文件名列表.
    (3).refid 是对某处定义的一个<filelist>的引用.
注意   dir 和 files 都是必要的，除非指定了refid(这种情况下，dir和files都不允许使用).
 
4.fileset类型
Fileset 数据类型定义了一组文件，并通常表示为<fileset>元素.不过，许多ant任务构建成了
 
隐式的fileset,这说明他们支持所有的fileset属性和嵌套元素.以下为fileset 的属性列表.
    (1).dir表示fileset 的基目录.
    (2).casesensitive的值如果为false，那么匹配文件名时，fileset不是区分大小写的，其默认
 
    值为true.
    (3).defaultexcludes 用来确定是否使用默认的排除模式，默认为true.
    (4).excludes 是用逗号分隔的需要派出的文件模式列表.
    (5).excludesfile 表示每行包含一个排除模式的文件的文件名.
    (6).includes 是用逗号分隔的，需要包含的文件模式列表.
    (7).includesfile 表示每行包括一个包含模式的文件名.
 
5.patternset 类型
Fileset 是对文件的分组，而patternset是对模式的分组，他们是紧密相关的概念.
 
<patternset>支持4个属性：includes excludex includexfile 和 excludesfile,与fileset相
 
同.Patternset 还允许以下嵌套元素：include,exclude,includefile 和 excludesfile.
 
6.filterset 类型
Filterset定义了一组过滤器，这些过滤器将在文件移动或复制时完成文件的文本替换.
主要属性如下：
    (1).begintoken 表示嵌套过滤器所搜索的记号，这是标识其开始的字符串.
    (2).endtoken表示嵌套过滤器所搜索的记号这是标识其结束的字符串.
    (3).id是过滤器的唯一标志符.
    (4).refid是对构建文件中某处定义一个过滤器的引用.
 
7.Path类型
Path元素用来表示一个类路径，不过它还可以用于表示其他的路径.在用作揖个属性时，路经中
 
的各项用分号或冒号隔开.在构建的时候，此分隔符将代替当前平台中所有的路径分隔符，其拥
 
有的属性如下.
    (1).location 表示一个文件或目录.Ant在内部将此扩展为一个绝对路径.
    (2).refid 是对当前构建文件中某处定义的一个path的引用.
    (3).path表示一个文件或路径名列表.
 
8.mapper类型
Mapper类型定义了一组输入文件和一组输出文件间的关系，其属性如下.
    (1).classname 表示实现mapper类的类名.当内置mapper不满足要求时，用于创建定制mapper.
    (2).classpath表示查找一个定制mapper时所用的类型路径.
    (3).classpathref是对某处定义的一个类路径的引用.
    (4).from属性的含义取决于所用的mapper.
    (5).to属性的含义取决于所用的mapper.
    (6).type属性的取值为identity，flatten glob merge   regexp   其中之一，它定义了要是用的
 
内置mapper的类型.
 
 
Ant 的运行
    安装好Ant并且配置好路径之后，在命令行中切换到构建文件的目录，输入Ant命令就可以运行
 
    Ant.若没有指定任何参数，Ant会在当前目录下查询build.xml文件.如果找到了就用该文件作为
 
    构建文件.如果使用了 –find 选项，Ant 就会在上级目录中找构建文件，直至到达文件系统得
 
    跟目录.如果构建文件的名字不是build.xml ，则Ant运行的时候就可以使用 –buildfile file
 
    ,这里file 指定了要使用的构建文件的名称，示例如下：
    Ant
    如下说明了表示当前目录的构建文件为build.xml 运行 ant 执行默认的目标.
 
===============================build.xml配置=========================
 
 
<?xml version="1.0" encoding="UTF-8"?>
<!--官方网站:http://ant.apache.org/-->
<project name="MyAntProject" basedir="." default="package">
    <!--用ant连接数据库创建表-->
    <!--
       要是报错请，右击build.xml==>>Run as =>>Ant build 找到Classpath==>>Add External JARs
       添加报错所需要的jar即可...
       例如：BUILD FAILED Class Not Found:(这句是在你没写检测才会输出.)
            JDBC driver com.mysql.jdbc.Driver could not be loaded
    -->
    <property name="driver" value="com.mysql.jdbc.Driver"/>
    <property name="url" value="jdbc:mysql://localhost:3306/test?useUnicode=true"/>
    <property name="user" value="root"/>
    <property name="password" value="root"/>
    <!--检查Classpath是否有安装mysql-connector-java-5.1.7-bin.jar(一般程序员知道classpath加载什么jar才会写上提醒)-->
    <available classname="com.mysql.jdbc.Driver" property="mysql.present"/>
    <!--<available file="mysql-connector-java-5.1.7-bin.jar" property="mysqljar.present"/> -->
    <fail unless="mysql.present" message="mysql-connector-java-5.1.7-bin.jar没安装,请你在run 的时候添加.."/>
    <!-- - - - - - - - - - - - - - - - - -   target: 创建表   - - - - - - - - - - - - - - - - - -->
    <target name="createTable">
       <!--person表-->
       <sql driver="${driver}" password="${password}" url="${url}" userid="${user}">
           create table ant_person(
              id int primary key,
              name varchar(20) not null,
              age int
           );
           <!--
           insert into ant_person values(1,'jilong',23);
           为了临时表有数据就放在这里.要是比较专业的一般在初始化数据插入数据
           -->
           create table ant_temp select * from ant_person;<!--创建临时表-->
       </sql>
    </target>
    <!-- - - - - - - - - - - - - - - - - -  target: 删除表 - - - - - - - - - - - - - - - -->
    <target name="dropTable">
    <sql driver="${driver}" password="${password}" url="${url}" userid="${user}">
        drop table ant_person;
             drop table ant_temp;
    </sql>
    </target>
    <!-- - - - - - - - - - - - - - - - - -target: 初始化数据.  - - - - - - - - - - - - - - - - - -->                           
    <target name="InitData">
            <sql driver="${driver}" password="${password}" url="${url}" userid="${user}">
              insert into ant_person values(2,'jilong',23);
            </sql>
    </target>
    <!-- - - - - - - - - - - - - - - - target: 同时执行创建表和插入数据.- - - -  - - - - - - - - - - -->
    <target name="create_init" depends="createTable,InitData"/>    
<!--=======================================================================================-->
    <!--定义文件目录的name和value-->
    <property name="compile" value="compile" />
    <property name="dist" value="dist" />
    <property name="src" value="src" />
    <target name="init" />
    <!--定义两个文件的根目录-->
    <target name="preprocess" depends="init">
       <mkdir dir="${compile}" />
       <mkdir dir="${dist}" />
    </target>
    <target name="compile" depends="init,preprocess" />
    <target name="package" depends="compile" />
 
    <!--编译java类成.class文件-->
    <target name="myCompile" depends="preprocess">
       <javac srcdir="src" destdir="${compile}" fork="true" memorymaximumsize="4m"/>
    </target>
    <!-- 创建一个.jar夹-->
    <target name="dist" depends="myCompile">
       <!--设置时间格式的有${TSTAMP}/${TODAY}-->
       <tstamp/>
       <jar destfile="${dist}/package1-${TODAY}.jar" basedir="${compile}">
           <manifest>
              <!--user.name是操作系统的用户名-->
              <attribute name="Built-By" value="${user.name}" />
              <attribute name="Main-Class" value="com.test.Test1" />
           </manifest>
       </jar>
    </target>
    <!--删除jar-->
    <target name="deleteFile">
       <delete file="${dist}/package1-${TSTAMP}.jar"/>
    </target>
    <!--拷貝文件，一般在打包项目的用来备份项目,或者把打包的jar拷贝到服务器部署目录下，
        那就可以不用手工拷贝夹部署demo..-->
    <target name="copyFile">
       <copy file="src/com/test/Test1.java" tofile="D:/TestCopy.java" />
       <copy file="src/com/test/Test1.java" todir="D:\" />
    </target>
    <!--剪切/移動文件-->
    <target name="moveFile">
       <move file="src/com/test/Test1.java" todir="D:" />
    </target>
    <!--打包成.zip夹包-->
    <target name="compress" depends="compile">
       <zip destfile="${dist}/package.zip" basedir="${compile}" />
    </target>
    <!--打包成.ear夹包-->
    <target name="earFile" depends="compile">
       <ear destfile="${dist}/ant_ear.ear" basedir="${compile}" />
    </target>
 
    <!--打包成.war夹包-->
    <target name="warFile" depends="compile">
       <war destfile="${dist}/ant_war.war" basedir="${compile}"/>
    </target>
 
    <!--不打包/解压-->
    <target name="umcompress" depends="compress">
       <unzip dest="${dist}" src="${dist}/package.zip" />
    </target>
    <!--找文字替换 summary可以输 出提示替换了几个-->
    <target name="replaceFile">
       <replace file="input.txt" token="old" value="new" summary="on" />
    </target>
    <!--拷貝所有.java的文件-->
    <target name="copy">
       <copy todir="${dist}">
           <fileset dir="src">
              <include name="**/*.java" />
           </fileset>
       </copy>
    </target>
    <!--自定义一个类来處理Task-->
    <taskdef name="MyTaskExample" classname="com.ant.tool.extend.AntTasks" classpath="bin" />
    <!--引用自定标签的name  myTaskExample-->
    <target name="MyAntTasks">
       <myTaskExample srcFile="input.txt" destFile="output.txt" />
    </target>
    <!--用echo显示各种的属性-->
    <target name="showProperty">
       <echo message="当前系统的用户名:${user.name}" />
       <echo message="当前系统的版本:${os.version}" />
       <echo message="当前系统的安装路径:${user.home}" />
       <echo message="ant的xml文件:${ant.file}" />
       <echo message="当前系统的语言:${user.language}" />
       <echo message="ant发现Java虚拟机的版本:${ant.java.version}" />
       <echo message="项目的绝对路径:${basedir}"/>
        <echo message="lib类库:${ant.library.dir}"/>
       <echo message="Apache Ant version :${ant.version}"/>
       <echo message="jre目录：${java.home}"/>
       <echo message="安装系统：${os.name}"/>
       <echo message="${user.country}"/>
    </target>
</project>
 
运行的结果

