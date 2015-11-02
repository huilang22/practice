/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeSubRequestParent.java
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
 * Abstract base class for all BatchNotifyEventType related UdtSubRequestParents
 *
 */
public abstract class BatchNotifyEventTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchNotifyEventTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchNotifyEventTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchNotifyEventTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchNotifyEventTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchNotifyEventTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchNotifyEventTypeSubRequestParent(String id, String method) {
    super(id, "BatchNotifyEventType", method);
  }
}
