package com.mitchellbosecke.pebble.compiler;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.node.Node;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

public interface Compiler {
	public Compiler compile(Node node);

	public String getSource();
	
	public Compiler write(String string);
	
	public Compiler raw(String string);
	
	public Compiler string(String string);
	
	public Compiler subcompile(Node node, boolean raw);
	
	public Compiler subcompile(Node node);
	
	public Compiler indent();
	
	public Compiler outdent();
	
	public PebbleEngine getEngine();
	
	public Compiler appendContent(String string);
	
	public PebbleTemplate compileToJava();
	
	
}
