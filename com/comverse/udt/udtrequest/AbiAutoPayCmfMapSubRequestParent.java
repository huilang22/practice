/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiAutoPayCmfMapSubRequestParent.java
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
 * Abstract base class for all AbiAutoPayCmfMap related UdtSubRequestParents
 *
 */
public abstract class AbiAutoPayCmfMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AbiAutoPayCmfMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AbiAutoPayCmfMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AbiAutoPayCmfMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AbiAutoPayCmfMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AbiAutoPayCmfMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AbiAutoPayCmfMapSubRequestParent(String id, String method) {
    super(id, "AbiAutoPayCmfMap", method);
  }
}
