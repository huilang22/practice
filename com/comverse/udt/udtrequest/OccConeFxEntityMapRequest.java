/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OccConeFxEntityMapRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all OccConeFxEntityMap related UdtRequests
 *
 */

public abstract class OccConeFxEntityMapRequest extends UdtRequest {

/**
 *
 * Constructor for OccConeFxEntityMapRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public OccConeFxEntityMapRequest(String id, String method) {
    super(id, "OccConeFxEntityMap", method);
  }
}
