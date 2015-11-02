/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CdrDataDucRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CdrDataDuc related UdtRequests
 *
 */

public abstract class CdrDataDucRequest extends UdtRequest {

/**
 *
 * Constructor for CdrDataDucRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CdrDataDucRequest(String id, String method) {
    super(id, "CdrDataDuc", method);
  }
}
