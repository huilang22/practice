/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupLocateSubRequestParent.java
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
 * Abstract base class for all GroupLocate related UdtSubRequestParents
 *
 */
public abstract class GroupLocateSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GroupLocateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GroupLocateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GroupLocateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GroupLocateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GroupLocateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GroupLocateSubRequestParent(String id, String method) {
    super(id, "GroupLocate", method);
  }
}
