/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RbrDecisionTree related UdtRequests
 *
 */

public abstract class RbrDecisionTreeRequest extends UdtRequest {

/**
 *
 * Constructor for RbrDecisionTreeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RbrDecisionTreeRequest(String id, String method) {
    super(id, "RbrDecisionTree", method);
  }
}
