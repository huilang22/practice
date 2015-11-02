/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusSubRequestParent.java
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
 * Abstract base class for all CmfStatus related UdtSubRequestParents
 *
 */
public abstract class CmfStatusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CmfStatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CmfStatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CmfStatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CmfStatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CmfStatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CmfStatusSubRequestParent(String id, String method) {
    super(id, "CmfStatus", method);
  }
}
