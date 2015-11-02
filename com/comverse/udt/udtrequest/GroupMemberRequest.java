/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GroupMember related UdtRequests
 *
 */

public abstract class GroupMemberRequest extends UdtRequest {

/**
 *
 * Constructor for GroupMemberRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GroupMemberRequest(String id, String method) {
    super(id, "GroupMember", method);
  }
}
