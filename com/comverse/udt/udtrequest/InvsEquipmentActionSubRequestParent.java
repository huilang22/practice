/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionSubRequestParent.java
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
 * Abstract base class for all InvsEquipmentAction related UdtSubRequestParents
 *
 */
public abstract class InvsEquipmentActionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsEquipmentActionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsEquipmentActionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsEquipmentActionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsEquipmentActionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsEquipmentActionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsEquipmentActionSubRequestParent(String id, String method) {
    super(id, "InvsEquipmentAction", method);
  }
}
