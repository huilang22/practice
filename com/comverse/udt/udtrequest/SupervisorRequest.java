/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SupervisorRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Supervisor related UdtRequests
 *
 */

public abstract class SupervisorRequest extends UdtRequest {

/**
 *
 * Constructor for SupervisorRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SupervisorRequest(String id, String method) {
    super(id, "Supervisor", method);
  }
}
