/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsFieldMasterSubRequestParent.java
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
 * Abstract base class for all InvsFieldMaster related UdtSubRequestParents
 *
 */
public abstract class InvsFieldMasterSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsFieldMasterRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsFieldMasterRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsFieldMasterSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsFieldMasterSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsFieldMasterSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsFieldMasterSubRequestParent(String id, String method) {
    super(id, "InvsFieldMaster", method);
  }
}
