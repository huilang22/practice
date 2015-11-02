/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnSubRequestParent.java
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
 * Abstract base class for all InvsEquipmentTxn related UdtSubRequestParents
 *
 */
public abstract class InvsEquipmentTxnSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsEquipmentTxnRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsEquipmentTxnRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsEquipmentTxnSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsEquipmentTxnSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsEquipmentTxnSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsEquipmentTxnSubRequestParent(String id, String method) {
    super(id, "InvsEquipmentTxn", method);
  }
}
