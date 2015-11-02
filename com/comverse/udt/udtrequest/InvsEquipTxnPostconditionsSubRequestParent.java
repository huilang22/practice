/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPostconditionsSubRequestParent.java
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
 * Abstract base class for all InvsEquipTxnPostconditions related UdtSubRequestParents
 *
 */
public abstract class InvsEquipTxnPostconditionsSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsEquipTxnPostconditionsRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsEquipTxnPostconditionsRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsEquipTxnPostconditionsSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsEquipTxnPostconditionsSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsEquipTxnPostconditionsSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsEquipTxnPostconditionsSubRequestParent(String id, String method) {
    super(id, "InvsEquipTxnPostconditions", method);
  }
}
