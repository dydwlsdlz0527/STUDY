package net.madvirus.spring04.chap01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		
		/*MavenBuildRunner buildRunner = new MavenBuildRunner();
		buildRunner.setMavenPath("c:\\apache-maven-3.1.1");
		
		Project sampleProiect = new Project();
		List<String> srcDirs = new ArrayList<String>();
		srcDirs.add("src");
		srcDirs.add("srcResources");
		sampleProiect.setSrcDirs(srcDirs);
		sampleProiect.setBinDir("bin");
		sampleProiect.setBuildRunner(buildRunner);
		
		sampleProiect.build();*/
		
		String configLocation = "classpath:applicationContext.xml";
		//컨테이너 생성
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Project project = ctx.getBean("sampleProject",Project.class);
		project.build();
		ctx.close();

	}

}
