/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonSubRequestParent.java
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
 * Abstract base class for all CitReason related UdtSubRequestParents
 *
 */
public abstract class CitReasonSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CitReasonRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitReasonRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CitReasonSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitReasonSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CitReasonSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CitReasonSubRequestParent(String id, String method) {
    super(id, "CitReason", method);
  }
}
