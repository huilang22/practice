/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiAssignRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all EpiAssign related UdtRequests
 *
 */

public abstract class EpiAssignRequest extends UdtRequest {

/**
 *
 * Constructor for EpiAssignRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public EpiAssignRequest(String id, String method) {
    super(id, "EpiAssign", method);
  }
}
