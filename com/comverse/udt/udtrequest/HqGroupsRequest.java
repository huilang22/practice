/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all HqGroups related UdtRequests
 *
 */

public abstract class HqGroupsRequest extends UdtRequest {

/**
 *
 * Constructor for HqGroupsRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public HqGroupsRequest(String id, String method) {
    super(id, "HqGroups", method);
  }
}
