/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillMessagesRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AbiBillMessages related UdtRequests
 *
 */

public abstract class AbiBillMessagesRequest extends UdtRequest {

/**
 *
 * Constructor for AbiBillMessagesRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AbiBillMessagesRequest(String id, String method) {
    super(id, "AbiBillMessages", method);
  }
}
