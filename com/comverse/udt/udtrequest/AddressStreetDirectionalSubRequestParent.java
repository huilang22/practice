/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetDirectionalSubRequestParent.java
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
 * Abstract base class for all AddressStreetDirectional related UdtSubRequestParents
 *
 */
public abstract class AddressStreetDirectionalSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AddressStreetDirectionalRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AddressStreetDirectionalRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AddressStreetDirectionalSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AddressStreetDirectionalSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AddressStreetDirectionalSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AddressStreetDirectionalSubRequestParent(String id, String method) {
    super(id, "AddressStreetDirectional", method);
  }
}
