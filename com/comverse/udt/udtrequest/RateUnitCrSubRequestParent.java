/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUnitCrSubRequestParent.java
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
 * Abstract base class for all RateUnitCr related UdtSubRequestParents
 *
 */
public abstract class RateUnitCrSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RateUnitCrRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateUnitCrRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RateUnitCrSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateUnitCrSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RateUnitCrSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RateUnitCrSubRequestParent(String id, String method) {
    super(id, "RateUnitCr", method);
  }
}
