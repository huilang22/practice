/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RTUnitCreditBalanceSubRequestParent.java
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
 * Abstract base class for all RTUnitCreditBalance related UdtSubRequestParents
 *
 */
public abstract class RTUnitCreditBalanceSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RTUnitCreditBalanceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RTUnitCreditBalanceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RTUnitCreditBalanceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RTUnitCreditBalanceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RTUnitCreditBalanceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RTUnitCreditBalanceSubRequestParent(String id, String method) {
    super(id, "RTUnitCreditBalance", method);
  }
}
