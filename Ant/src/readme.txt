
Ant���ŵ�
    Ant��Apache��������JAKARTAĿ¼�е�һ������Ŀ���������µ��ŵ㡣
    ��ƽ̨��.Ant�Ǵ�Java���Ա�д�ģ���ʾ���кܺõĿ�ƽ̨��.
    ������.Ant����һ����������Ϳ�ѡ������ɵ�.Ant����ʱ��Ҫһ��XML�ļ�(�����ļ�).
 
    Antͨ������target�����Ϳ���ִ�и���task.ÿ��taskʵ�����ض��ӿڶ���.����Ant�����ļ�
 
    ʱXML��ʽ���ļ������Ժ�����ά������д�����ҽṹ������.
    Ant���Լ��ɵ�����������.����Ant�Ŀ�ƽ̨�ԺͲ����򵥵��ص㣬�������׼��ɵ�һЩ����������ȥ.
 
Ant ����
 
Ant�Ĺ����ļ�
    ����ʼһ���µ���Ŀʱ������Ӧ�ñ�дAnt�����ļ�.�����ļ������˹������̣������Ŷӿ���
 
    ��ÿ����ʹ��.Ant�����ļ�Ĭ������Ϊbuild.xml��Ҳ����ȡ����������.ֻ���������е�ʱ��
 
    ���������������������Ant.�����ļ����Է����κε�λ��.һ�������Ƿ�����Ŀ����Ŀ¼��
 
    ���������Ա�����Ŀ�ļ�������.������һ�����͵���Ŀ��νṹ.
    (1) src����ļ�.
    (2) class��ű������ļ�.
    (3) lib��ŵ�����JAR��.
    (4) dist��Ŵ���������Ժ�Ĵ���.
Ant�����ļ���XML�ļ�.ÿ�������ļ�����һ��Ψһ����Ŀ(ProjectԪ��).ÿ����Ŀ�¿��Զ�
 
��ܶ�Ŀ��(targetԪ��)����ЩĿ��֮�������������ϵ.��ִ������Ŀ��ʱ����Ҫִ��������
 
������Ŀ��.
ÿ��Ŀ���п��Զ���������Ŀ���л���������Ҫִ�е���������.Ant�ڹ���Ŀ��ʱ�����
 
�������������.��������Antʵ��ִ�е�����.Ant�е��������Ϊ3��.
    ��1�� ��������.����������Ant�Դ�������.
    ��2�� ��ѡ����.��ѡ����ʵ���Ե����������������Ҫһ�����ӵ�JAR�ļ�.
    ��3�� �û��Զ��������.�û��Զ��������ʵ�û��Լ�����������.
1.<project>��ǩ
   ÿ�������ļ���Ӧһ����Ŀ.<project>��ǩʱ�����ļ��ĸ���ǩ.�������ж���������ԣ�
 
�����������ʾ����������Եĺ���ֱ�����.
    (1) default��ʾĬ�ϵ�����Ŀ�꣬��������Ǳ����.
    (2) basedir��ʾ��Ŀ�Ļ�׼Ŀ¼.
    (3) name��ʾ��Ŀ��.
    (4) description��ʾ��Ŀ������.
ÿ�������ļ�����Ӧ��һ����Ŀ�����Ǵ�����Ŀ������������������Ŀ��ÿһ������Ŀ��������
 
�Լ��Ĺ����ļ�.
 
2.<target>��ǩ
һ����Ŀ��ǩ�¿�����һ������target��ǩ.һ��target��ǩ��������������target��ǩ.��
 
�磬��һ��target���ڱ��������һ��target�������ƿ�ִ���ļ�.�����ɿ�ִ���ļ�֮ǰ��
 
���ȱ�����ļ�����߿�ִ���ļ���target�����ڱ�������target.Target��������������.
    (1).name��ʾ��������������Ǳ����.
    (2).depends��ʾ������Ŀ��.
    (3)if��ʾ������������ʱ��ִ��.
    (4)unless��ʾ������û������ʱ��ִ��.
    (5)description��ʾ��Ŀ������.
Ant��depends����ָ����target��ִ��˳��.Ant������depends������target����˳������ִ��
 
ÿ��target.��ִ��֮ǰ��������Ҫִ������������target.�����е���Ϊrun��target��
 
depends����compile������Ϊcompile��target��depends������prepare�������⼸��targetִ
 
�е�˳����prepare->compile->run.
һ��targetֻ�ܱ�ִ��һ�Σ���ʹ�ж��target��������.���û��if��unless���ԣ�target��
 
�ᱻִ��.
 
3.<mkdir>��ǩ
�ñ�ǩ���ڴ���һ��Ŀ¼������һ������dir����ָ����������Ŀ¼������������£�
<mkdir dir=����{class.root}��/>
ͨ�����ϴ���ʹ�����һ��Ŀ¼�����Ŀ¼�Ѿ���ǰ���property��ǩ��ָ��.
 
4<jar>��ǩ
�ñ�ǩ��������һ��JAR�ļ�������������.
    (1) destfile��ʾJAR�ļ���.
    (2) basedir��ʾ���鵵���ļ���.
    (3) includes��ʾ��鵵���ļ�ģʽ.
    (4) exchudes��ʾ���ų����ļ�ģʽ.
 
5��<javac��ǩ>
�ñ�ǩ���ڱ���һ����һ��java�ļ�������������.
    (1).srcdir��ʾԴ�����Ŀ¼.
    (2).destdir��ʾclass�ļ������Ŀ¼.
    (3).include��ʾ��������ļ���ģʽ.
    (4).excludes��ʾ���ų����ļ���ģʽ.
    (5).classpath��ʾ��ʹ�õ���·��.
    (6).debug��ʾ�����ĵ�����Ϣ.
    (7).optimize��ʾ�Ƿ�ʹ���Ż�.
    (8).verbose ��ʾ�ṩ��ϸ�������Ϣ.
    (9).fileonerror��ʾ������������Զ�ֹͣ.
 
6��<java>��ǩ
�ñ�ǩ����ִ�б������ɵ�.class�ļ�������������.
    (1).classname ��ʾ��ִ�е�����.
    (2).jar��ʾ���������JAR�ļ���.
    (3).classpath����ʾ�õ�����·��.
    (4).fork��ʾ��һ���µ�����������и���.
    (5).failonerror��ʾ�����ִ���ʱ�Զ�ֹͣ.
    (6).output ��ʾ����ļ�.
    (7).append��ʾ׷�ӻ��߸���Ĭ���ļ�.
 
7.<delete>��ǩ
�ñ�ǩ����ɾ��һ���ļ���һ���ļ���ȥ��������.
    (1)/file��ʾҪɾ�����ļ�.
    (2).dir��ʾҪɾ����Ŀ¼.
    (3).includeEmptyDirs ��ʾָ���Ƿ�Ҫɾ����Ŀ¼��Ĭ��ֵ��ɾ��.
    (4).failonerror ��ʾָ�������������Ƿ�ֹͣ��Ĭ��ֵ���Զ�ֹͣ.
    (5).verbose��ʾָ���Ƿ��г���ɾ�����ļ���Ĭ��ֵΪ���г�.
 
8.<copy>��ǩ
�ñ�ǩ�����ļ����ļ����Ŀ���������������.
    (1).file ��ʾԴ�ļ�.
    (2).tofile ��ʾĿ���ļ�.
    (3).todir ��ʾĿ��Ŀ¼.
    (4).overwrite ��ʾָ���Ƿ񸲸�Ŀ���ļ���Ĭ��ֵ�ǲ�����.
    (5).includeEmptyDirs ��ʾ�ƶ��Ƿ񿽱���Ŀ¼��Ĭ��ֵΪ����.
    (6).failonerror ��ʾָ����Ŀ��û�з����Ƿ��Զ�ֹͣ��Ĭ��ֵ��ֹͣ.
    (7).verbose ��ʾ�ƶ��Ƿ���ʾ��ϸ��Ϣ��Ĭ��ֵ����ʾ.
 
Ant����������
�ڹ����ļ���Ϊ�˱�ʶ�ļ����ļ��飬������Ҫʹ����������.�������Ͱ�����
 
org.apache.tool.ant.types����.���澵�򵥽��ܹ����ļ���һЩ���õ���������.
 
1. argument ����
��Ant�����ļ����õĳ��򣬿���ͨ��<arg>Ԫ�����䴫�������в�������apply,exec��java��
 
����ɽ���Ƕ��<arg>Ԫ�أ�����Ϊ���ԵĹ��̵���ָ������.������<arg>����������.
    (1).values ��һ���������.����������пո񣬵����뽫����Ϊ����һ��ֵ����ʹ�ô�����
 
    .
    (2).file��ʾһ���������ļ���.�ڹ����ļ��У����ļ�������ڵ�ǰ�Ĺ���Ŀ¼.
    (3).line��ʾ�ÿո�ָ��Ķ�������б�.
    (4).path��ʾ·��.
 
2.ervironment ����
   ��Ant�����ļ����õ��ⲿ��������<env>Ԫ���ƶ�����Щ��������Ҫ���ݸ�����ִ�е�ϵ
 
ͳ���<env>Ԫ�ؿ��Խ�����������.
    (1).file��ʾ��������ֵ���ļ���.���ļ���Ҫ��ת��λһ������·��.
    (2).path��ʾ����������·��.Ant�Ὣ��ת��Ϊһ������Լ��.
    (3).value ��ʾ����������һ��ֱ�ӱ���.
    (4).key ��ʾ����������.
ע��   file path �� valueֻ��ȡһ��.
 
3.filelist����
Filelist ��һ��֧���������ļ��б���������ͣ�������һ��filelist�����е��ļ���һ����
 
���ڵ��ļ�.�����������е�����.
    (1).dir�����ڼ�������ļ�����Ŀ¼.
    (2).files ���ö��ŷָ����ļ����б�.
    (3).refid �Ƕ�ĳ�������һ��<filelist>������.
ע��   dir �� files ���Ǳ�Ҫ�ģ�����ָ����refid(��������£�dir��files��������ʹ��).
 
4.fileset����
Fileset �������Ͷ�����һ���ļ�����ͨ����ʾΪ<fileset>Ԫ��.���������ant���񹹽�����
 
��ʽ��fileset,��˵������֧�����е�fileset���Ժ�Ƕ��Ԫ��.����Ϊfileset �������б�.
    (1).dir��ʾfileset �Ļ�Ŀ¼.
    (2).casesensitive��ֵ���Ϊfalse����ôƥ���ļ���ʱ��fileset�������ִ�Сд�ģ���Ĭ��
 
    ֵΪtrue.
    (3).defaultexcludes ����ȷ���Ƿ�ʹ��Ĭ�ϵ��ų�ģʽ��Ĭ��Ϊtrue.
    (4).excludes ���ö��ŷָ�����Ҫ�ɳ����ļ�ģʽ�б�.
    (5).excludesfile ��ʾÿ�а���һ���ų�ģʽ���ļ����ļ���.
    (6).includes ���ö��ŷָ��ģ���Ҫ�������ļ�ģʽ�б�.
    (7).includesfile ��ʾÿ�а���һ������ģʽ���ļ���.
 
5.patternset ����
Fileset �Ƕ��ļ��ķ��飬��patternset�Ƕ�ģʽ�ķ��飬�����ǽ�����صĸ���.
 
<patternset>֧��4�����ԣ�includes excludex includexfile �� excludesfile,��fileset��
 
ͬ.Patternset ����������Ƕ��Ԫ�أ�include,exclude,includefile �� excludesfile.
 
6.filterset ����
Filterset������һ�����������Щ�����������ļ��ƶ�����ʱ����ļ����ı��滻.
��Ҫ�������£�
    (1).begintoken ��ʾǶ�׹������������ļǺţ����Ǳ�ʶ�俪ʼ���ַ���.
    (2).endtoken��ʾǶ�׹������������ļǺ����Ǳ�ʶ��������ַ���.
    (3).id�ǹ�������Ψһ��־��.
    (4).refid�ǶԹ����ļ���ĳ������һ��������������.
 
7.Path����
PathԪ��������ʾһ����·�������������������ڱ�ʾ������·��.������Ҿ������ʱ��·����
 
�ĸ����÷ֺŻ�ð�Ÿ���.�ڹ�����ʱ�򣬴˷ָ��������浱ǰƽ̨�����е�·���ָ�������ӵ
 
�е���������.
    (1).location ��ʾһ���ļ���Ŀ¼.Ant���ڲ�������չΪһ������·��.
    (2).refid �ǶԵ�ǰ�����ļ���ĳ�������һ��path������.
    (3).path��ʾһ���ļ���·�����б�.
 
8.mapper����
Mapper���Ͷ�����һ�������ļ���һ������ļ���Ĺ�ϵ������������.
    (1).classname ��ʾʵ��mapper�������.������mapper������Ҫ��ʱ�����ڴ�������mapper.
    (2).classpath��ʾ����һ������mapperʱ���õ�����·��.
    (3).classpathref�Ƕ�ĳ�������һ����·��������.
    (4).from���Եĺ���ȡ�������õ�mapper.
    (5).to���Եĺ���ȡ�������õ�mapper.
    (6).type���Ե�ȡֵΪidentity��flatten glob merge   regexp   ����֮һ����������Ҫ���õ�
 
����mapper������.
 
 
Ant ������
    ��װ��Ant�������ú�·��֮�������������л��������ļ���Ŀ¼������Ant����Ϳ�������
 
    Ant.��û��ָ���κβ�����Ant���ڵ�ǰĿ¼�²�ѯbuild.xml�ļ�.����ҵ��˾��ø��ļ���Ϊ
 
    �����ļ�.���ʹ���� �Cfind ѡ�Ant �ͻ����ϼ�Ŀ¼���ҹ����ļ���ֱ�������ļ�ϵͳ��
 
    ��Ŀ¼.��������ļ������ֲ���build.xml ����Ant���е�ʱ��Ϳ���ʹ�� �Cbuildfile file
 
    ,����file ָ����Ҫʹ�õĹ����ļ������ƣ�ʾ�����£�
    Ant
    ����˵���˱�ʾ��ǰĿ¼�Ĺ����ļ�Ϊbuild.xml ���� ant ִ��Ĭ�ϵ�Ŀ��.
 
===============================build.xml����=========================
 
 
<?xml version="1.0" encoding="UTF-8"?>
<!--�ٷ���վ:http://ant.apache.org/-->
<project name="MyAntProject" basedir="." default="package">
    <!--��ant�������ݿⴴ����-->
    <!--
       Ҫ�Ǳ����룬�һ�build.xml==>>Run as =>>Ant build �ҵ�Classpath==>>Add External JARs
       ��ӱ�������Ҫ��jar����...
       ���磺BUILD FAILED Class Not Found:(���������ûд���Ż����.)
            JDBC driver com.mysql.jdbc.Driver could not be loaded
    -->
    <property name="driver" value="com.mysql.jdbc.Driver"/>
    <property name="url" value="jdbc:mysql://localhost:3306/test?useUnicode=true"/>
    <property name="user" value="root"/>
    <property name="password" value="root"/>
    <!--���Classpath�Ƿ��а�װmysql-connector-java-5.1.7-bin.jar(һ�����Ա֪��classpath����ʲôjar�Ż�д������)-->
    <available classname="com.mysql.jdbc.Driver" property="mysql.present"/>
    <!--<available file="mysql-connector-java-5.1.7-bin.jar" property="mysqljar.present"/> -->
    <fail unless="mysql.present" message="mysql-connector-java-5.1.7-bin.jarû��װ,������run ��ʱ�����.."/>
    <!-- - - - - - - - - - - - - - - - - -   target: ������   - - - - - - - - - - - - - - - - - -->
    <target name="createTable">
       <!--person��-->
       <sql driver="${driver}" password="${password}" url="${url}" userid="${user}">
           create table ant_person(
              id int primary key,
              name varchar(20) not null,
              age int
           );
           <!--
           insert into ant_person values(1,'jilong',23);
           Ϊ����ʱ�������ݾͷ�������.Ҫ�ǱȽ�רҵ��һ���ڳ�ʼ�����ݲ�������
           -->
           create table ant_temp select * from ant_person;<!--������ʱ��-->
       </sql>
    </target>
    <!-- - - - - - - - - - - - - - - - - -  target: ɾ���� - - - - - - - - - - - - - - - -->
    <target name="dropTable">
    <sql driver="${driver}" password="${password}" url="${url}" userid="${user}">
        drop table ant_person;
             drop table ant_temp;
    </sql>
    </target>
    <!-- - - - - - - - - - - - - - - - - -target: ��ʼ������.  - - - - - - - - - - - - - - - - - -->                           
    <target name="InitData">
            <sql driver="${driver}" password="${password}" url="${url}" userid="${user}">
              insert into ant_person values(2,'jilong',23);
            </sql>
    </target>
    <!-- - - - - - - - - - - - - - - - target: ͬʱִ�д�����Ͳ�������.- - - -  - - - - - - - - - - -->
    <target name="create_init" depends="createTable,InitData"/>    
<!--=======================================================================================-->
    <!--�����ļ�Ŀ¼��name��value-->
    <property name="compile" value="compile" />
    <property name="dist" value="dist" />
    <property name="src" value="src" />
    <target name="init" />
    <!--���������ļ��ĸ�Ŀ¼-->
    <target name="preprocess" depends="init">
       <mkdir dir="${compile}" />
       <mkdir dir="${dist}" />
    </target>
    <target name="compile" depends="init,preprocess" />
    <target name="package" depends="compile" />
 
    <!--����java���.class�ļ�-->
    <target name="myCompile" depends="preprocess">
       <javac srcdir="src" destdir="${compile}" fork="true" memorymaximumsize="4m"/>
    </target>
    <!-- ����һ��.jar��-->
    <target name="dist" depends="myCompile">
       <!--����ʱ���ʽ����${TSTAMP}/${TODAY}-->
       <tstamp/>
       <jar destfile="${dist}/package1-${TODAY}.jar" basedir="${compile}">
           <manifest>
              <!--user.name�ǲ���ϵͳ���û���-->
              <attribute name="Built-By" value="${user.name}" />
              <attribute name="Main-Class" value="com.test.Test1" />
           </manifest>
       </jar>
    </target>
    <!--ɾ��jar-->
    <target name="deleteFile">
       <delete file="${dist}/package1-${TSTAMP}.jar"/>
    </target>
    <!--��ؐ�ļ���һ���ڴ����Ŀ������������Ŀ,���߰Ѵ����jar����������������Ŀ¼�£�
        �ǾͿ��Բ����ֹ������в���demo..-->
    <target name="copyFile">
       <copy file="src/com/test/Test1.java" tofile="D:/TestCopy.java" />
       <copy file="src/com/test/Test1.java" todir="D:\" />
    </target>
    <!--����/�Ƅ��ļ�-->
    <target name="moveFile">
       <move file="src/com/test/Test1.java" todir="D:" />
    </target>
    <!--�����.zip�а�-->
    <target name="compress" depends="compile">
       <zip destfile="${dist}/package.zip" basedir="${compile}" />
    </target>
    <!--�����.ear�а�-->
    <target name="earFile" depends="compile">
       <ear destfile="${dist}/ant_ear.ear" basedir="${compile}" />
    </target>
 
    <!--�����.war�а�-->
    <target name="warFile" depends="compile">
       <war destfile="${dist}/ant_war.war" basedir="${compile}"/>
    </target>
 
    <!--�����/��ѹ-->
    <target name="umcompress" depends="compress">
       <unzip dest="${dist}" src="${dist}/package.zip" />
    </target>
    <!--�������滻 summary������ ����ʾ�滻�˼���-->
    <target name="replaceFile">
       <replace file="input.txt" token="old" value="new" summary="on" />
    </target>
    <!--��ؐ����.java���ļ�-->
    <target name="copy">
       <copy todir="${dist}">
           <fileset dir="src">
              <include name="**/*.java" />
           </fileset>
       </copy>
    </target>
    <!--�Զ���һ������̎��Task-->
    <taskdef name="MyTaskExample" classname="com.ant.tool.extend.AntTasks" classpath="bin" />
    <!--�����Զ���ǩ��name  myTaskExample-->
    <target name="MyAntTasks">
       <myTaskExample srcFile="input.txt" destFile="output.txt" />
    </target>
    <!--��echo��ʾ���ֵ�����-->
    <target name="showProperty">
       <echo message="��ǰϵͳ���û���:${user.name}" />
       <echo message="��ǰϵͳ�İ汾:${os.version}" />
       <echo message="��ǰϵͳ�İ�װ·��:${user.home}" />
       <echo message="ant��xml�ļ�:${ant.file}" />
       <echo message="��ǰϵͳ������:${user.language}" />
       <echo message="ant����Java������İ汾:${ant.java.version}" />
       <echo message="��Ŀ�ľ���·��:${basedir}"/>
        <echo message="lib���:${ant.library.dir}"/>
       <echo message="Apache Ant version :${ant.version}"/>
       <echo message="jreĿ¼��${java.home}"/>
       <echo message="��װϵͳ��${os.name}"/>
       <echo message="${user.country}"/>
    </target>
</project>
 
���еĽ��

