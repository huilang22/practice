/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdWorkpointAssocSubRequestParent.java
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
 * Abstract base class for all InvdWorkpointAssoc related UdtSubRequestParents
 *
 */
public abstract class InvdWorkpointAssocSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvdWorkpointAssocRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvdWorkpointAssocRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvdWorkpointAssocSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvdWorkpointAssocSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvdWorkpointAssocSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvdWorkpointAssocSubRequestParent(String id, String method) {
    super(id, "InvdWorkpointAssoc", method);
  }
}
