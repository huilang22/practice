/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GroupMember related UdtSubRequestParents
 *
 */
public abstract class GroupMemberSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GroupMemberRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GroupMemberRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GroupMemberSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GroupMemberSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GroupMemberSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GroupMemberSubRequestParent(String id, String method) {
    super(id, "GroupMember", method);
  }
}
