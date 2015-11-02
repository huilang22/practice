/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EventQueueRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all EventQueue related UdtRequests
 *
 */

public abstract class EventQueueRequest extends UdtRequest {

/**
 *
 * Adds a  CollectableSubRequestParent as an InputRequest
 * @param inputRequest CollectableSubRequestParent to add as InputRequest
 *
 */
    public void addCollectableEventQueueInputRequest(CollectableSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Collectable_EventQueue_Ref");
      irList.add(inReq);
    }
/**
 *
 * Constructor for EventQueueRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public EventQueueRequest(String id, String method) {
    super(id, "EventQueue", method);
  }
}
