/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqContractUnitCrSubRequestParent.java
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
 * Abstract base class for all HqContractUnitCr related UdtSubRequestParents
 *
 */
public abstract class HqContractUnitCrSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on HqContractUnitCrRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HqContractUnitCrRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on HqContractUnitCrSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HqContractUnitCrSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for HqContractUnitCrSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public HqContractUnitCrSubRequestParent(String id, String method) {
    super(id, "HqContractUnitCr", method);
  }
}
