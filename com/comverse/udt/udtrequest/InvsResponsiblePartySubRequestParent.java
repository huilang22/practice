/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsResponsiblePartySubRequestParent.java
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
 * Abstract base class for all InvsResponsibleParty related UdtSubRequestParents
 *
 */
public abstract class InvsResponsiblePartySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsResponsiblePartyRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsResponsiblePartyRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsResponsiblePartySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsResponsiblePartySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsResponsiblePartySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsResponsiblePartySubRequestParent(String id, String method) {
    super(id, "InvsResponsibleParty", method);
  }
}
