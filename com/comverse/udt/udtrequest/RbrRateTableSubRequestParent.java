/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTableSubRequestParent.java
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
 * Abstract base class for all RbrRateTable related UdtSubRequestParents
 *
 */
public abstract class RbrRateTableSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RbrRateTableRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrRateTableRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RbrRateTableSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrRateTableSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RbrRateTableSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RbrRateTableSubRequestParent(String id, String method) {
    super(id, "RbrRateTable", method);
  }
}
