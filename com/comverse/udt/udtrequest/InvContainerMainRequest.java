/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerMainRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvContainerMain related UdtRequests
 *
 */

public abstract class InvContainerMainRequest extends UdtRequest {

/**
 *
 * Constructor for InvContainerMainRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvContainerMainRequest(String id, String method) {
    super(id, "InvContainerMain", method);
  }
}
