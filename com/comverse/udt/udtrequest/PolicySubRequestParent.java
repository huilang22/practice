/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicySubRequestParent.java
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
 * Abstract base class for all Policy related UdtSubRequestParents
 *
 */
public abstract class PolicySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PolicyRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PolicyRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PolicySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PolicySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PolicySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PolicySubRequestParent(String id, String method) {
    super(id, "Policy", method);
  }
}
