/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeSubRequestParent.java
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
 * Abstract base class for all EquipTypeCode related UdtSubRequestParents
 *
 */
public abstract class EquipTypeCodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on EquipTypeCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EquipTypeCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on EquipTypeCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EquipTypeCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for EquipTypeCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public EquipTypeCodeSubRequestParent(String id, String method) {
    super(id, "EquipTypeCode", method);
  }
}
