/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LbxPaymentTypeSubRequestParent.java
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
 * Abstract base class for all LbxPaymentType related UdtSubRequestParents
 *
 */
public abstract class LbxPaymentTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on LbxPaymentTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LbxPaymentTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on LbxPaymentTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LbxPaymentTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for LbxPaymentTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public LbxPaymentTypeSubRequestParent(String id, String method) {
    super(id, "LbxPaymentType", method);
  }
}
