package org.octopus.boot.common.exception;

import org.springframework.boot.ExitCodeGenerator;

public class CustomerException extends RuntimeException implements ExitCodeGenerator {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1653954308240064055L;

	@Override
	public int getExitCode() {
		return 10;
	}
}
