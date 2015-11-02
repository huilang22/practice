/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AISubRequestParent.java
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
 * Abstract base class for all AI related UdtSubRequestParents
 *
 */
public abstract class AISubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AIRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AIRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AISubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AISubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AISubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AISubRequestParent(String id, String method) {
    super(id, "AI", method);
  }
}
