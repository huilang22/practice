/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentReasonSubRequestParent.java
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
 * Abstract base class for all AdjustmentReason related UdtSubRequestParents
 *
 */
public abstract class AdjustmentReasonSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AdjustmentReasonRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AdjustmentReasonRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AdjustmentReasonSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AdjustmentReasonSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AdjustmentReasonSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AdjustmentReasonSubRequestParent(String id, String method) {
    super(id, "AdjustmentReason", method);
  }
}
