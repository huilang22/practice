/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceSubRequestParent.java
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
 * Abstract base class for all PolicyInstance related UdtSubRequestParents
 *
 */
public abstract class PolicyInstanceSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PolicyInstanceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PolicyInstanceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PolicyInstanceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PolicyInstanceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PolicyInstanceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PolicyInstanceSubRequestParent(String id, String method) {
    super(id, "PolicyInstance", method);
  }
}
