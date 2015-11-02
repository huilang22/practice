/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewAttributesRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CcViewAttributes related UdtRequests
 *
 */

public abstract class CcViewAttributesRequest extends UdtRequest {

/**
 *
 * Constructor for CcViewAttributesRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CcViewAttributesRequest(String id, String method) {
    super(id, "CcViewAttributes", method);
  }
}
