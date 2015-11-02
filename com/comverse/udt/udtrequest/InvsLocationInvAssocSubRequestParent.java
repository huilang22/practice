/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationInvAssocSubRequestParent.java
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
 * Abstract base class for all InvsLocationInvAssoc related UdtSubRequestParents
 *
 */
public abstract class InvsLocationInvAssocSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsLocationInvAssocRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLocationInvAssocRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsLocationInvAssocSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLocationInvAssocSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsLocationInvAssocSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsLocationInvAssocSubRequestParent(String id, String method) {
    super(id, "InvsLocationInvAssoc", method);
  }
}
