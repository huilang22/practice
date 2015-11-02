/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyGroupMemberSubRequestParent.java
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
 * Abstract base class for all DependencyGroupMember related UdtSubRequestParents
 *
 */
public abstract class DependencyGroupMemberSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DependencyGroupMemberRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DependencyGroupMemberRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DependencyGroupMemberSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DependencyGroupMemberSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DependencyGroupMemberSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DependencyGroupMemberSubRequestParent(String id, String method) {
    super(id, "DependencyGroupMember", method);
  }
}
