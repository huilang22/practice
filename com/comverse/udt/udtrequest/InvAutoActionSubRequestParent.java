/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionSubRequestParent.java
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
 * Abstract base class for all InvAutoAction related UdtSubRequestParents
 *
 */
public abstract class InvAutoActionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvAutoActionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvAutoActionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvAutoActionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvAutoActionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvAutoActionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvAutoActionSubRequestParent(String id, String method) {
    super(id, "InvAutoAction", method);
  }
}
