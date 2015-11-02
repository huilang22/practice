/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnappliedPaymentSubRequestParent.java
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
 * Abstract base class for all UnappliedPayment related UdtSubRequestParents
 *
 */
public abstract class UnappliedPaymentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UnappliedPaymentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnappliedPaymentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UnappliedPaymentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnappliedPaymentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UnappliedPaymentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UnappliedPaymentSubRequestParent(String id, String method) {
    super(id, "UnappliedPayment", method);
  }
}
