/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeEquipTxnAssocSubRequestParent.java
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
 * Abstract base class for all InvsTypeEquipTxnAssoc related UdtSubRequestParents
 *
 */
public abstract class InvsTypeEquipTxnAssocSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsTypeEquipTxnAssocRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsTypeEquipTxnAssocRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsTypeEquipTxnAssocSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsTypeEquipTxnAssocSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsTypeEquipTxnAssocSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsTypeEquipTxnAssocSubRequestParent(String id, String method) {
    super(id, "InvsTypeEquipTxnAssoc", method);
  }
}
