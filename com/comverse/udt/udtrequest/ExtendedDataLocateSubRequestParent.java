/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataLocateSubRequestParent.java
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
 * Abstract base class for all ExtendedDataLocate related UdtSubRequestParents
 *
 */
public abstract class ExtendedDataLocateSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ExtendedDataLocateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExtendedDataLocateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ExtendedDataLocateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExtendedDataLocateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ExtendedDataLocateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ExtendedDataLocateSubRequestParent(String id, String method) {
    super(id, "ExtendedDataLocate", method);
  }
}
