package comrel.generator.helper;

public class HelperInfo {
	
	private String name;
	private String description;
	private String id;
	private String namespaceUri;
	private String className;
	private String packageName = "comrel.helper";
	private String jarFile;
	private String inputType;
	private String outputType;
	private String projectName;	
	
	public HelperInfo(
			String name, 
			String description, 
			String id,
			String namespaceUri, 
			String className,
			String jarFile, 
			String inputType, 
			String outputType,
			String projectName) {
		super();
		this.name = name;
		this.description = description;
		this.id = id;
		this.namespaceUri = namespaceUri;
		this.className = className;
		this.jarFile = jarFile;
		this.inputType = inputType;
		this.outputType = outputType;
		this.projectName = projectName;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNamespaceUri() {
		return namespaceUri;
	}
	
	public String getClassName() {
		return className;
	}
	
	public String getPackageName() {
		return packageName;
	}
	
	public String getQualifiedClassName() {
		return (packageName + "." + className);
	}
	
	public String getJarFile() {
		return jarFile;
	}
	
	public String getInputType() {
		return inputType;
	}
	
	public String getInputTypeVariable() {
		int pos = inputType.lastIndexOf(".");
		String cl = inputType.substring(pos+1);
		String ret = cl.substring(0,1).toLowerCase();
		if (cl.length() > 1) {
			String rest = cl.substring(1);
			ret = ret + rest;
		}
		ret = ret + "_";
		return ret;
	}
	
	public String getOutputType() {
		return outputType;
	}
	
	public String getOutputTypeVariable() {
		int pos = outputType.lastIndexOf(".");
		String cl = outputType.substring(pos+1);
		String ret = cl.substring(0,1).toLowerCase();
		if (cl.length() > 1) {
			String rest = cl.substring(1);
			ret = ret + rest;
		}
		ret = ret + "_";
		return ret;
	}
	
	public String getProjectName() {
		return projectName;
	}

	@Override
	public String toString() {
		return "HelperInfo [\n name=" + name + ", \n description=" + description
				+ ", \n id=" + id + ", \n namespaceUri=" + namespaceUri
				+ ", \n className=" + className + ", \n packageName=" + packageName
				+ ", \n jarFile=" + jarFile + ", \n inputType=" + inputType
				+ ", \n outputType=" + outputType + ", \n projectName=" + projectName
				+ ", \n qualifiedClassName=" + getQualifiedClassName() + "]";
	}
	
	
}
