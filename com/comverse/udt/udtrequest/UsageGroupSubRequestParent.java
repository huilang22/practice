/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageGroupSubRequestParent.java
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
 * Abstract base class for all UsageGroup related UdtSubRequestParents
 *
 */
public abstract class UsageGroupSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UsageGroupRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageGroupRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UsageGroupSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageGroupSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UsageGroupSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UsageGroupSubRequestParent(String id, String method) {
    super(id, "UsageGroup", method);
  }
}
