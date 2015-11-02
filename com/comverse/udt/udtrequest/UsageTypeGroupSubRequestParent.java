/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGroupSubRequestParent.java
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
 * Abstract base class for all UsageTypeGroup related UdtSubRequestParents
 *
 */
public abstract class UsageTypeGroupSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UsageTypeGroupRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageTypeGroupRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UsageTypeGroupSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageTypeGroupSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UsageTypeGroupSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UsageTypeGroupSubRequestParent(String id, String method) {
    super(id, "UsageTypeGroup", method);
  }
}
