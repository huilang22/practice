/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimVectorRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvSimVector related UdtRequests
 *
 */

public abstract class InvSimVectorRequest extends UdtRequest {

/**
 *
 * Constructor for InvSimVectorRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvSimVectorRequest(String id, String method) {
    super(id, "InvSimVector", method);
  }
}
