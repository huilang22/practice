/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CountryCodeSubRequestParent.java
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
 * Abstract base class for all CountryCode related UdtSubRequestParents
 *
 */
public abstract class CountryCodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CountryCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CountryCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CountryCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CountryCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CountryCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CountryCodeSubRequestParent(String id, String method) {
    super(id, "CountryCode", method);
  }
}
