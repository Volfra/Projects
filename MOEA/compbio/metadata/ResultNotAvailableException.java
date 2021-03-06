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

/**
 * ResultNotAvailableException is thrown wherever the results of the calculation
 * cannot be obtained. For cluster execution it hides lower level exceptions
 * like DrmaaException
 * 
 * @author pvtroshin
 * 
 *         Date October 2009
 */
public class ResultNotAvailableException extends Exception {

    /**
     * Default stable serial for serialization
     */
    private static final long serialVersionUID = -5475613614578761L;

    public ResultNotAvailableException(String message) {
	super(message);
    }

    public ResultNotAvailableException(Throwable cause) {
	super(cause);
    }

    public ResultNotAvailableException(String message, Throwable cause) {
	super(message, cause);
    }

}
