/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesSubRequestParent.java
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
 * Abstract base class for all LateFeeRateOverrides related UdtSubRequestParents
 *
 */
public abstract class LateFeeRateOverridesSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on LateFeeRateOverridesRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LateFeeRateOverridesRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on LateFeeRateOverridesSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LateFeeRateOverridesSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for LateFeeRateOverridesSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public LateFeeRateOverridesSubRequestParent(String id, String method) {
    super(id, "LateFeeRateOverrides", method);
  }
}
