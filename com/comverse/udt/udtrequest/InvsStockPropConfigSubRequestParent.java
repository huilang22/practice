/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropConfigSubRequestParent.java
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
 * Abstract base class for all InvsStockPropConfig related UdtSubRequestParents
 *
 */
public abstract class InvsStockPropConfigSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsStockPropConfigRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsStockPropConfigRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsStockPropConfigSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsStockPropConfigSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsStockPropConfigSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsStockPropConfigSubRequestParent(String id, String method) {
    super(id, "InvsStockPropConfig", method);
  }
}
