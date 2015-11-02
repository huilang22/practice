/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUnitSubRequestParent.java
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
 * Abstract base class for all UsageTypeUnit related UdtSubRequestParents
 *
 */
public abstract class UsageTypeUnitSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UsageTypeUnitRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageTypeUnitRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UsageTypeUnitSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageTypeUnitSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UsageTypeUnitSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UsageTypeUnitSubRequestParent(String id, String method) {
    super(id, "UsageTypeUnit", method);
  }
}
