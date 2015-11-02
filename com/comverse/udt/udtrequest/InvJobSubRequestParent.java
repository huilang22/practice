/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobSubRequestParent.java
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
 * Abstract base class for all InvJob related UdtSubRequestParents
 *
 */
public abstract class InvJobSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvJobRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvJobRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvJobSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvJobSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvJobSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvJobSubRequestParent(String id, String method) {
    super(id, "InvJob", method);
  }
}
