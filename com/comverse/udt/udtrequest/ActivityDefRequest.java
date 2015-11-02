/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ActivityDefRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ActivityDef related UdtRequests
 *
 */

public abstract class ActivityDefRequest extends UdtRequest {

/**
 *
 * Constructor for ActivityDefRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ActivityDefRequest(String id, String method) {
    super(id, "ActivityDef", method);
  }
}
