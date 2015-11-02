/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobErrorSubRequestParent.java
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
 * Abstract base class for all InvJobError related UdtSubRequestParents
 *
 */
public abstract class InvJobErrorSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvJobErrorRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvJobErrorRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvJobErrorSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvJobErrorSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvJobErrorSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvJobErrorSubRequestParent(String id, String method) {
    super(id, "InvJobError", method);
  }
}
