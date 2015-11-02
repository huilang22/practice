/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersSubRequestParent.java
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
 * Abstract base class for all HqGroupMembers related UdtSubRequestParents
 *
 */
public abstract class HqGroupMembersSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on HqGroupMembersRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HqGroupMembersRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on HqGroupMembersSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HqGroupMembersSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for HqGroupMembersSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public HqGroupMembersSubRequestParent(String id, String method) {
    super(id, "HqGroupMembers", method);
  }
}
