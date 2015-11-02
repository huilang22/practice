/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CdrDataDucSubRequestParent.java
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
 * Abstract base class for all CdrDataDuc related UdtSubRequestParents
 *
 */
public abstract class CdrDataDucSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CdrDataDucRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CdrDataDucRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CdrDataDucSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CdrDataDucSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CdrDataDucSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CdrDataDucSubRequestParent(String id, String method) {
    super(id, "CdrDataDuc", method);
  }
}
