/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountDefinitionSubRequestParent.java
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
 * Abstract base class for all DiscountDefinition related UdtSubRequestParents
 *
 */
public abstract class DiscountDefinitionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DiscountDefinitionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DiscountDefinitionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DiscountDefinitionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DiscountDefinitionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DiscountDefinitionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DiscountDefinitionSubRequestParent(String id, String method) {
    super(id, "DiscountDefinition", method);
  }
}
