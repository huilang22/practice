/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Condition related UdtRequests
 *
 */

public abstract class ConditionRequest extends UdtRequest {

/**
 *
 * Constructor for ConditionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ConditionRequest(String id, String method) {
    super(id, "Condition", method);
  }
}
