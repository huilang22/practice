/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StoredProcedureRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all StoredProcedure related UdtRequests
 *
 */

public abstract class StoredProcedureRequest extends UdtRequest {

/**
 *
 * Constructor for StoredProcedureRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public StoredProcedureRequest(String id, String method) {
    super(id, "StoredProcedure", method);
  }
}
