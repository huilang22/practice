/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentCondSubRequestParent.java
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
 * Abstract base class for all InvsEquipmentCond related UdtSubRequestParents
 *
 */
public abstract class InvsEquipmentCondSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsEquipmentCondRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsEquipmentCondRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsEquipmentCondSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsEquipmentCondSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsEquipmentCondSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsEquipmentCondSubRequestParent(String id, String method) {
    super(id, "InvsEquipmentCond", method);
  }
}
