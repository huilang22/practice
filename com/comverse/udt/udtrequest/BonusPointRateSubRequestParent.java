/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointRateSubRequestParent.java
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
 * Abstract base class for all BonusPointRate related UdtSubRequestParents
 *
 */
public abstract class BonusPointRateSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BonusPointRateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BonusPointRateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BonusPointRateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BonusPointRateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BonusPointRateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BonusPointRateSubRequestParent(String id, String method) {
    super(id, "BonusPointRate", method);
  }
}
