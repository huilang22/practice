/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTaxSubRequestParent.java
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
 * Abstract base class for all AdjustmentTax related UdtSubRequestParents
 *
 */
public abstract class AdjustmentTaxSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AdjustmentTaxRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AdjustmentTaxRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AdjustmentTaxSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AdjustmentTaxSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AdjustmentTaxSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AdjustmentTaxSubRequestParent(String id, String method) {
    super(id, "AdjustmentTax", method);
  }
}
