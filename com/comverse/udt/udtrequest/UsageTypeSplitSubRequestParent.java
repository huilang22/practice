/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeSplitSubRequestParent.java
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
 * Abstract base class for all UsageTypeSplit related UdtSubRequestParents
 *
 */
public abstract class UsageTypeSplitSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UsageTypeSplitRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageTypeSplitRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UsageTypeSplitSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageTypeSplitSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UsageTypeSplitSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UsageTypeSplitSubRequestParent(String id, String method) {
    super(id, "UsageTypeSplit", method);
  }
}
