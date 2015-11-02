/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupSubRequestParent.java
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
 * Abstract base class for all EntityTypeGroup related UdtSubRequestParents
 *
 */
public abstract class EntityTypeGroupSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on EntityTypeGroupRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EntityTypeGroupRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on EntityTypeGroupSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EntityTypeGroupSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for EntityTypeGroupSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public EntityTypeGroupSubRequestParent(String id, String method) {
    super(id, "EntityTypeGroup", method);
  }
}
