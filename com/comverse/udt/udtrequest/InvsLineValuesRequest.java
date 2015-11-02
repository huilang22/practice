/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineValuesRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsLineValues related UdtRequests
 *
 */

public abstract class InvsLineValuesRequest extends UdtRequest {

/**
 *
 * Constructor for InvsLineValuesRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsLineValuesRequest(String id, String method) {
    super(id, "InvsLineValues", method);
  }
}
