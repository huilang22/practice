/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTransSubRequestParent.java
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
 * Abstract base class for all PaymentTrans related UdtSubRequestParents
 *
 */
public abstract class PaymentTransSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PaymentTransRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PaymentTransRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PaymentTransSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PaymentTransSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PaymentTransSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PaymentTransSubRequestParent(String id, String method) {
    super(id, "PaymentTrans", method);
  }
}
