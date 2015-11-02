/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionSubRequestParent.java
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
 * Abstract base class for all BsdAction related UdtSubRequestParents
 *
 */
public abstract class BsdActionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdActionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdActionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdActionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdActionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdActionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdActionSubRequestParent(String id, String method) {
    super(id, "BsdAction", method);
  }
}
