/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionSubRequestParent.java
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
 * Abstract base class for all BsdException related UdtSubRequestParents
 *
 */
public abstract class BsdExceptionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdExceptionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdExceptionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdExceptionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdExceptionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdExceptionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdExceptionSubRequestParent(String id, String method) {
    super(id, "BsdException", method);
  }
}
