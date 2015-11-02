/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeSubRequestParent.java
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
 * Abstract base class for all AdjustmentType related UdtSubRequestParents
 *
 */
public abstract class AdjustmentTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AdjustmentTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AdjustmentTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AdjustmentTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AdjustmentTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AdjustmentTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AdjustmentTypeSubRequestParent(String id, String method) {
    super(id, "AdjustmentType", method);
  }
}
