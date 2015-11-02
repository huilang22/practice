/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliverySubRequestParent.java
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
 * Abstract base class for all OppvDelivery related UdtSubRequestParents
 *
 */
public abstract class OppvDeliverySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on OppvDeliveryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OppvDeliveryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OppvDeliverySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OppvDeliverySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for OppvDeliverySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OppvDeliverySubRequestParent(String id, String method) {
    super(id, "OppvDelivery", method);
  }
}
