/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapSubRequestParent.java
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
 * Abstract base class for all HqgroupUsageRedirectMap related UdtSubRequestParents
 *
 */
public abstract class HqgroupUsageRedirectMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on HqgroupUsageRedirectMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HqgroupUsageRedirectMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on HqgroupUsageRedirectMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HqgroupUsageRedirectMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for HqgroupUsageRedirectMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public HqgroupUsageRedirectMapSubRequestParent(String id, String method) {
    super(id, "HqgroupUsageRedirectMap", method);
  }
}
