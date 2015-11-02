/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all HqGroupMembers related UdtRequests
 *
 */

public abstract class HqGroupMembersRequest extends UdtRequest {

/**
 *
 * Constructor for HqGroupMembersRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public HqGroupMembersRequest(String id, String method) {
    super(id, "HqGroupMembers", method);
  }
}
