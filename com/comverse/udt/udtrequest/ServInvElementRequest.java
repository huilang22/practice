/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServInvElementRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServInvElement related UdtRequests
 *
 */

public abstract class ServInvElementRequest extends UdtRequest {

/**
 *
 * Constructor for ServInvElementRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServInvElementRequest(String id, String method) {
    super(id, "ServInvElement", method);
  }
}
