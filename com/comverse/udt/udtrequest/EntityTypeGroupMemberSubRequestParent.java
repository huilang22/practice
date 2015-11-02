/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupMemberSubRequestParent.java
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
 * Abstract base class for all EntityTypeGroupMember related UdtSubRequestParents
 *
 */
public abstract class EntityTypeGroupMemberSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on EntityTypeGroupMemberRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EntityTypeGroupMemberRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on EntityTypeGroupMemberSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EntityTypeGroupMemberSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for EntityTypeGroupMemberSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public EntityTypeGroupMemberSubRequestParent(String id, String method) {
    super(id, "EntityTypeGroupMember", method);
  }
}
