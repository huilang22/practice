/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsExtDataMapSubRequestParent.java
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
 * Abstract base class for all InvsExtDataMap related UdtSubRequestParents
 *
 */
public abstract class InvsExtDataMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsExtDataMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsExtDataMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsExtDataMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsExtDataMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsExtDataMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsExtDataMapSubRequestParent(String id, String method) {
    super(id, "InvsExtDataMap", method);
  }
}
