/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementPlusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvElementPlus related UdtRequests
 *
 */

public abstract class InvElementPlusRequest extends UdtRequest {

/**
 *
 * Constructor for InvElementPlusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvElementPlusRequest(String id, String method) {
    super(id, "InvElementPlus", method);
  }
}
