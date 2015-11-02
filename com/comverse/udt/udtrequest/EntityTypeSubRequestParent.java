/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeSubRequestParent.java
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
 * Abstract base class for all EntityType related UdtSubRequestParents
 *
 */
public abstract class EntityTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on EntityTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EntityTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on EntityTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EntityTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for EntityTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public EntityTypeSubRequestParent(String id, String method) {
    super(id, "EntityType", method);
  }
}
