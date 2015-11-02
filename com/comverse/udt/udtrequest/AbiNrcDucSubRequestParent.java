/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiNrcDucSubRequestParent.java
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
 * Abstract base class for all AbiNrcDuc related UdtSubRequestParents
 *
 */
public abstract class AbiNrcDucSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AbiNrcDucRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AbiNrcDucRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AbiNrcDucSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AbiNrcDucSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AbiNrcDucSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AbiNrcDucSubRequestParent(String id, String method) {
    super(id, "AbiNrcDuc", method);
  }
}
