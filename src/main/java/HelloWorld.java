import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello World");
                get("/", (req, res) -> "WELCOME IN JIMMY CENTER COURT");
		get("/jimmy", (req, res) -> "HALA MADRID Y NADA MAS");
                get("/m2i", (req, res) -> "BIENVENUE A VILLENEUVEDASQUUE");
	}
}
