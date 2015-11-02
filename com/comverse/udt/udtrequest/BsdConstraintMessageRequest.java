/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdConstraintMessage related UdtRequests
 *
 */

public abstract class BsdConstraintMessageRequest extends UdtRequest {

/**
 *
 * Constructor for BsdConstraintMessageRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdConstraintMessageRequest(String id, String method) {
    super(id, "BsdConstraintMessage", method);
  }
}
