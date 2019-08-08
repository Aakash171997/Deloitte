package com;

import java.util.ListResourceBundle;

public class ResourceBundlingEx extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		
		return contents;
	}
	
	static final Object[][] contents = {
		      {"count.one", "CRICKET"},
		      {"count.two", "FOOTBALL"},
		      {"count.three", "HOCKEY"},
	};

}
