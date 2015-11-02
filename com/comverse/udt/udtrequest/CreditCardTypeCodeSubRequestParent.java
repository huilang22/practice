/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardTypeCodeSubRequestParent.java
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
 * Abstract base class for all CreditCardTypeCode related UdtSubRequestParents
 *
 */
public abstract class CreditCardTypeCodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CreditCardTypeCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CreditCardTypeCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CreditCardTypeCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CreditCardTypeCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CreditCardTypeCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CreditCardTypeCodeSubRequestParent(String id, String method) {
    super(id, "CreditCardTypeCode", method);
  }
}
