/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPreconditionsSubRequestParent.java
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
 * Abstract base class for all InvsEquipTxnPreconditions related UdtSubRequestParents
 *
 */
public abstract class InvsEquipTxnPreconditionsSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsEquipTxnPreconditionsRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsEquipTxnPreconditionsRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsEquipTxnPreconditionsSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsEquipTxnPreconditionsSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsEquipTxnPreconditionsSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsEquipTxnPreconditionsSubRequestParent(String id, String method) {
    super(id, "InvsEquipTxnPreconditions", method);
  }
}
