/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressCategorySubRequestParent.java
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
 * Abstract base class for all AddressCategory related UdtSubRequestParents
 *
 */
public abstract class AddressCategorySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AddressCategoryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AddressCategoryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AddressCategorySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AddressCategorySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AddressCategorySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AddressCategorySubRequestParent(String id, String method) {
    super(id, "AddressCategory", method);
  }
}
