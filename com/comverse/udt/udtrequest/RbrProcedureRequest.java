/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrProcedureRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RbrProcedure related UdtRequests
 *
 */

public abstract class RbrProcedureRequest extends UdtRequest {

/**
 *
 * Constructor for RbrProcedureRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RbrProcedureRequest(String id, String method) {
    super(id, "RbrProcedure", method);
  }
}
