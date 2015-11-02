/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Csr related UdtRequests
 *
 */

public abstract class CsrRequest extends UdtRequest {

/**
 *
 * Constructor for CsrRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CsrRequest(String id, String method) {
    super(id, "Csr", method);
  }
}
