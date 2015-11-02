/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtDataHistoryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvdMainExtDataHistory related UdtRequests
 *
 */

public abstract class InvdMainExtDataHistoryRequest extends UdtRequest {

/**
 *
 * Constructor for InvdMainExtDataHistoryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvdMainExtDataHistoryRequest(String id, String method) {
    super(id, "InvdMainExtDataHistory", method);
  }
}
