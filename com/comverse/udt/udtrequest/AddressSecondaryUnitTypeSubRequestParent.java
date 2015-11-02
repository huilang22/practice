/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressSecondaryUnitTypeSubRequestParent.java
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
 * Abstract base class for all AddressSecondaryUnitType related UdtSubRequestParents
 *
 */
public abstract class AddressSecondaryUnitTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AddressSecondaryUnitTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AddressSecondaryUnitTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AddressSecondaryUnitTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AddressSecondaryUnitTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AddressSecondaryUnitTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AddressSecondaryUnitTypeSubRequestParent(String id, String method) {
    super(id, "AddressSecondaryUnitType", method);
  }
}
