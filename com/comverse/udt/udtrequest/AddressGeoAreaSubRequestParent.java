/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressGeoAreaSubRequestParent.java
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
 * Abstract base class for all AddressGeoArea related UdtSubRequestParents
 *
 */
public abstract class AddressGeoAreaSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AddressGeoAreaRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AddressGeoAreaRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AddressGeoAreaSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AddressGeoAreaSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AddressGeoAreaSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AddressGeoAreaSubRequestParent(String id, String method) {
    super(id, "AddressGeoArea", method);
  }
}
