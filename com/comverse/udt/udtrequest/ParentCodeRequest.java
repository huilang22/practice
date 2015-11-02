/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ParentCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ParentCode related UdtRequests
 *
 */

public abstract class ParentCodeRequest extends UdtRequest {

/**
 *
 * Constructor for ParentCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ParentCodeRequest(String id, String method) {
    super(id, "ParentCode", method);
  }
}
