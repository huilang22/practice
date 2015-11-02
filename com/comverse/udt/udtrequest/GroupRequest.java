/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Group related UdtRequests
 *
 */

public abstract class GroupRequest extends UdtRequest {

/**
 *
 * Constructor for GroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GroupRequest(String id, String method) {
    super(id, "Group", method);
  }
}
