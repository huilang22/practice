/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobSubRequestParent.java
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
 * Abstract base class for all InvSimJob related UdtSubRequestParents
 *
 */
public abstract class InvSimJobSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvSimJobRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvSimJobRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvSimJobSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvSimJobSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvSimJobSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvSimJobSubRequestParent(String id, String method) {
    super(id, "InvSimJob", method);
  }
}
