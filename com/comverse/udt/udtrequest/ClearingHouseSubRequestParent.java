/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseSubRequestParent.java
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
 * Abstract base class for all ClearingHouse related UdtSubRequestParents
 *
 */
public abstract class ClearingHouseSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ClearingHouseRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ClearingHouseRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ClearingHouseSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ClearingHouseSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ClearingHouseSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ClearingHouseSubRequestParent(String id, String method) {
    super(id, "ClearingHouse", method);
  }
}
