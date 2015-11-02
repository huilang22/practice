/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationInvAssocRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsLocationInvAssoc related UdtRequests
 *
 */

public abstract class InvsLocationInvAssocRequest extends UdtRequest {

/**
 *
 * Constructor for InvsLocationInvAssocRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsLocationInvAssocRequest(String id, String method) {
    super(id, "InvsLocationInvAssoc", method);
  }
}
