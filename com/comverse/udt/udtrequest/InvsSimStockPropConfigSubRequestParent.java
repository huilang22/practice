/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimStockPropConfigSubRequestParent.java
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
 * Abstract base class for all InvsSimStockPropConfig related UdtSubRequestParents
 *
 */
public abstract class InvsSimStockPropConfigSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsSimStockPropConfigRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSimStockPropConfigRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsSimStockPropConfigSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSimStockPropConfigSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsSimStockPropConfigSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsSimStockPropConfigSubRequestParent(String id, String method) {
    super(id, "InvsSimStockPropConfig", method);
  }
}
