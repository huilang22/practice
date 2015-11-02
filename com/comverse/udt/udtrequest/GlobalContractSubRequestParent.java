/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractSubRequestParent.java
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
 * Abstract base class for all GlobalContract related UdtSubRequestParents
 *
 */
public abstract class GlobalContractSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GlobalContractRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GlobalContractRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GlobalContractSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GlobalContractSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GlobalContractSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GlobalContractSubRequestParent(String id, String method) {
    super(id, "GlobalContract", method);
  }
}
