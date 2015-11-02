/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressTypeSubRequestParent.java
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
 * Abstract base class for all AddressType related UdtSubRequestParents
 *
 */
public abstract class AddressTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AddressTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AddressTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AddressTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AddressTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AddressTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AddressTypeSubRequestParent(String id, String method) {
    super(id, "AddressType", method);
  }
}
