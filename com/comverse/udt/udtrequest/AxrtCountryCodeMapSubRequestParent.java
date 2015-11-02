/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtCountryCodeMapSubRequestParent.java
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
 * Abstract base class for all AxrtCountryCodeMap related UdtSubRequestParents
 *
 */
public abstract class AxrtCountryCodeMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AxrtCountryCodeMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AxrtCountryCodeMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AxrtCountryCodeMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AxrtCountryCodeMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AxrtCountryCodeMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AxrtCountryCodeMapSubRequestParent(String id, String method) {
    super(id, "AxrtCountryCodeMap", method);
  }
}
