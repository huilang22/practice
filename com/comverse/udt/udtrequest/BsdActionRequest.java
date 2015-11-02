/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdAction related UdtRequests
 *
 */

public abstract class BsdActionRequest extends UdtRequest {

/**
 *
 * Constructor for BsdActionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdActionRequest(String id, String method) {
    super(id, "BsdAction", method);
  }
}
