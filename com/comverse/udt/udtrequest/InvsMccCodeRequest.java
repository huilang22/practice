/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMccCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsMccCode related UdtRequests
 *
 */

public abstract class InvsMccCodeRequest extends UdtRequest {

/**
 *
 * Constructor for InvsMccCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsMccCodeRequest(String id, String method) {
    super(id, "InvsMccCode", method);
  }
}
