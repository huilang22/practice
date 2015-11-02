/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrUsageTypeSubRequestParent.java
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
 * Abstract base class for all RbrUsageType related UdtSubRequestParents
 *
 */
public abstract class RbrUsageTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RbrUsageTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrUsageTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RbrUsageTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrUsageTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RbrUsageTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RbrUsageTypeSubRequestParent(String id, String method) {
    super(id, "RbrUsageType", method);
  }
}
