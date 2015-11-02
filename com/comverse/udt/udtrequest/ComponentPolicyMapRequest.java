/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentPolicyMapRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ComponentPolicyMap related UdtRequests
 *
 */

public abstract class ComponentPolicyMapRequest extends UdtRequest {

/**
 *
 * Constructor for ComponentPolicyMapRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ComponentPolicyMapRequest(String id, String method) {
    super(id, "ComponentPolicyMap", method);
  }
}
