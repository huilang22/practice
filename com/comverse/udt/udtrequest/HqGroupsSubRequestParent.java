/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsSubRequestParent.java
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
 * Abstract base class for all HqGroups related UdtSubRequestParents
 *
 */
public abstract class HqGroupsSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on HqGroupsRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HqGroupsRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on HqGroupsSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HqGroupsSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for HqGroupsSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public HqGroupsSubRequestParent(String id, String method) {
    super(id, "HqGroups", method);
  }
}
