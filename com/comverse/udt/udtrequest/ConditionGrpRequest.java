/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionGrpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ConditionGrp related UdtRequests
 *
 */

public abstract class ConditionGrpRequest extends UdtRequest {

/**
 *
 * Constructor for ConditionGrpRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ConditionGrpRequest(String id, String method) {
    super(id, "ConditionGrp", method);
  }
}
