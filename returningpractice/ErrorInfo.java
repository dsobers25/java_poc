package returningpractice;

public class ErrorInfo {
	String[] msgs = {
			"Output Error",
			"Inout Error",
			"Disk Full",
			"Index Out-of-Bounds"
	};
	int[] howbad = {3, 3, 2, 4};
	
	// getErrorInfo return type is class Err
	// therefore this method must be appended onto a Err class object
	Err getErrorInfo(int i) {
		if(i >= 0 & i < msgs.length) {
			return new Err(msgs[i], howbad[i]);
		} else {
			return new Err("Invalid Error Code", 0);
		}
	}

}
