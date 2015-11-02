/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoAssocSubRequestParent.java
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
 * Abstract base class for all InvAutoAssoc related UdtSubRequestParents
 *
 */
public abstract class InvAutoAssocSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvAutoAssocRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvAutoAssocRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvAutoAssocSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvAutoAssocSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvAutoAssocSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvAutoAssocSubRequestParent(String id, String method) {
    super(id, "InvAutoAssoc", method);
  }
}
