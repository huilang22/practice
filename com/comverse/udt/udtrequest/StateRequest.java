/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all State related UdtRequests
 *
 */

public abstract class StateRequest extends UdtRequest {

/**
 *
 * Constructor for StateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public StateRequest(String id, String method) {
    super(id, "State", method);
  }
}
