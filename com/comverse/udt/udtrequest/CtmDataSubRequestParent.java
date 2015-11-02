/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataSubRequestParent.java
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
 * Abstract base class for all CtmData related UdtSubRequestParents
 *
 */
public abstract class CtmDataSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtmDataRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtmDataRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtmDataSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtmDataSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtmDataSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtmDataSubRequestParent(String id, String method) {
    super(id, "CtmData", method);
  }
}
