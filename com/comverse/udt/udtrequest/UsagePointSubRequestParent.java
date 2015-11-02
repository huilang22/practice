/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointSubRequestParent.java
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
 * Abstract base class for all UsagePoint related UdtSubRequestParents
 *
 */
public abstract class UsagePointSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UsagePointRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsagePointRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UsagePointSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsagePointSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UsagePointSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UsagePointSubRequestParent(String id, String method) {
    super(id, "UsagePoint", method);
  }
}
