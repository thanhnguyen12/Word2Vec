package retrieval;

public class RConfig {
	
	public static String modelType = "API2VEC"; // Word2Vec, API2VEC
	public static int window = 8;
	public static int dimension = 200;
	public static double sampleRate = 1e-3; // how to choose
	public static String outputExtension = RConfig.modelType + "_" + RConfig.window + RConfig.dimension + sampleRate;
}
