/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateClassDescrSubRequestParent.java
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
 * Abstract base class for all RateClassDescr related UdtSubRequestParents
 *
 */
public abstract class RateClassDescrSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RateClassDescrRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateClassDescrRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RateClassDescrSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateClassDescrSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RateClassDescrSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RateClassDescrSubRequestParent(String id, String method) {
    super(id, "RateClassDescr", method);
  }
}
