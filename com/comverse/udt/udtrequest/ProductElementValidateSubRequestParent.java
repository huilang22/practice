/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementValidateSubRequestParent.java
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
 * Abstract base class for all ProductElementValidate related UdtSubRequestParents
 *
 */
public abstract class ProductElementValidateSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ProductElementValidateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductElementValidateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProductElementValidateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductElementValidateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ProductElementValidateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProductElementValidateSubRequestParent(String id, String method) {
    super(id, "ProductElementValidate", method);
  }
}
