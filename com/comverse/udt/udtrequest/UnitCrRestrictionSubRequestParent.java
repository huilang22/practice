/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRestrictionSubRequestParent.java
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
 * Abstract base class for all UnitCrRestriction related UdtSubRequestParents
 *
 */
public abstract class UnitCrRestrictionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UnitCrRestrictionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnitCrRestrictionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UnitCrRestrictionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnitCrRestrictionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UnitCrRestrictionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UnitCrRestrictionSubRequestParent(String id, String method) {
    super(id, "UnitCrRestriction", method);
  }
}
