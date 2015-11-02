/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatableUnitClassSubRequestParent.java
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
 * Abstract base class for all RatableUnitClass related UdtSubRequestParents
 *
 */
public abstract class RatableUnitClassSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RatableUnitClassRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RatableUnitClassRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RatableUnitClassSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RatableUnitClassSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RatableUnitClassSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RatableUnitClassSubRequestParent(String id, String method) {
    super(id, "RatableUnitClass", method);
  }
}
