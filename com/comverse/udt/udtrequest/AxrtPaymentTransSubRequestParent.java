/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentTransSubRequestParent.java
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
 * Abstract base class for all AxrtPaymentTrans related UdtSubRequestParents
 *
 */
public abstract class AxrtPaymentTransSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AxrtPaymentTransRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AxrtPaymentTransRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AxrtPaymentTransSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AxrtPaymentTransSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AxrtPaymentTransSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AxrtPaymentTransSubRequestParent(String id, String method) {
    super(id, "AxrtPaymentTrans", method);
  }
}
