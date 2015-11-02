/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixSubRequestParent.java
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
 * Abstract base class for all AddressStreetSuffix related UdtSubRequestParents
 *
 */
public abstract class AddressStreetSuffixSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AddressStreetSuffixRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AddressStreetSuffixRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AddressStreetSuffixSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AddressStreetSuffixSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AddressStreetSuffixSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AddressStreetSuffixSubRequestParent(String id, String method) {
    super(id, "AddressStreetSuffix", method);
  }
}
