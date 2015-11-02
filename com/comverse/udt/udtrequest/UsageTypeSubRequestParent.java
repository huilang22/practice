/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeSubRequestParent.java
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
 * Abstract base class for all UsageType related UdtSubRequestParents
 *
 */
public abstract class UsageTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UsageTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UsageTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UsageTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UsageTypeSubRequestParent(String id, String method) {
    super(id, "UsageType", method);
  }
}
