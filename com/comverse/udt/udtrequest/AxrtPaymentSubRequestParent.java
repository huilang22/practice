/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentSubRequestParent.java
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
 * Abstract base class for all AxrtPayment related UdtSubRequestParents
 *
 */
public abstract class AxrtPaymentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AxrtPaymentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AxrtPaymentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AxrtPaymentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AxrtPaymentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AxrtPaymentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AxrtPaymentSubRequestParent(String id, String method) {
    super(id, "AxrtPayment", method);
  }
}
