/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDistribPercentSubRequestParent.java
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
 * Abstract base class for all ChargeDistribPercent related UdtSubRequestParents
 *
 */
public abstract class ChargeDistribPercentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ChargeDistribPercentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ChargeDistribPercentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ChargeDistribPercentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ChargeDistribPercentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ChargeDistribPercentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ChargeDistribPercentSubRequestParent(String id, String method) {
    super(id, "ChargeDistribPercent", method);
  }
}
