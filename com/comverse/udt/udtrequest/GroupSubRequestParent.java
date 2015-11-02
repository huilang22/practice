/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupSubRequestParent.java
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
 * Abstract base class for all Group related UdtSubRequestParents
 *
 */
public abstract class GroupSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GroupRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GroupRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GroupSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GroupSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GroupSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GroupSubRequestParent(String id, String method) {
    super(id, "Group", method);
  }
}
