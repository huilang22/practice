/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyTypeSubRequestParent.java
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
 * Abstract base class for all BatchNotifyType related UdtSubRequestParents
 *
 */
public abstract class BatchNotifyTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchNotifyTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchNotifyTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchNotifyTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchNotifyTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchNotifyTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchNotifyTypeSubRequestParent(String id, String method) {
    super(id, "BatchNotifyType", method);
  }
}
