/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all HqGroupCorridor related UdtRequests
 *
 */

public abstract class HqGroupCorridorRequest extends UdtRequest {

/**
 *
 * Constructor for HqGroupCorridorRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public HqGroupCorridorRequest(String id, String method) {
    super(id, "HqGroupCorridor", method);
  }
}
