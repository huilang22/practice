/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyGroupMemberRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all DependencyGroupMember related UdtRequests
 *
 */

public abstract class DependencyGroupMemberRequest extends UdtRequest {

/**
 *
 * Constructor for DependencyGroupMemberRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public DependencyGroupMemberRequest(String id, String method) {
    super(id, "DependencyGroupMember", method);
  }
}
