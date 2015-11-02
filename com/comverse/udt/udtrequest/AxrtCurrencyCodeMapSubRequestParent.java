/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtCurrencyCodeMapSubRequestParent.java
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
 * Abstract base class for all AxrtCurrencyCodeMap related UdtSubRequestParents
 *
 */
public abstract class AxrtCurrencyCodeMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AxrtCurrencyCodeMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AxrtCurrencyCodeMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AxrtCurrencyCodeMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AxrtCurrencyCodeMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AxrtCurrencyCodeMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AxrtCurrencyCodeMapSubRequestParent(String id, String method) {
    super(id, "AxrtCurrencyCodeMap", method);
  }
}
