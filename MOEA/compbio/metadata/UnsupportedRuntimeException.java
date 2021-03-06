/* Copyright (c) 2009 Peter Troshin
 *  
 *  JAva Bioinformatics Analysis Web Services (JABAWS) @version: 1.0    
 * 
 *  This library is free software; you can redistribute it and/or modify it under the terms of the
 *  Apache License version 2 as published by the Apache Software Foundation
 * 
 *  This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the Apache 
 *  License for more details.
 * 
 *  A copy of the license is in apache_license.txt. It is also available here:
 * @see: http://www.apache.org/licenses/LICENSE-2.0.txt
 * 
 * Any republication or derived work distributed in source code form
 * must include this copyright and license notice.
 */

package metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Indicates that the server could not execute native executables. e.g. If Mafft
 * (unix executable) is asked to be run on Windows. In context of JABAWS this
 * exception indicates that the service is deployed but is not able to run.
 * 
 * @author pvtroshin
 * 
 *         Date February 2010
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class UnsupportedRuntimeException extends JobSubmissionException {

	public UnsupportedRuntimeException(String message) {
		super(message);
	}

	public UnsupportedRuntimeException(Throwable cause) {
		super(cause);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -86624836785110293L;

}
