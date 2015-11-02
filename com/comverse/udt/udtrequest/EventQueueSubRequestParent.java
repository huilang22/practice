/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EventQueueSubRequestParent.java
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
 * Abstract base class for all EventQueue related UdtSubRequestParents
 *
 */
public abstract class EventQueueSubRequestParent extends UdtSubRequestParent {

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
 * Adds SelfRequest based on EventQueueRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EventQueueRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on EventQueueSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EventQueueSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a CollectableRequest sub request
 * @param subRequest CollectableRequest
 *
 */
    public void addEventQueueCollectableSubRequest(CollectableRequest subRequest) {
      addSubRequest(subRequest, "EventQueue_Collectable_Ref");
    }
/**
 *
 * Adds a CollectableRequest sub request
 * @param subRequest CollectableRequest
 *
 */
    public void addEventQueueCollectableSubRequest(CollectableSubRequestParent subRequest) {
      addSubRequest(subRequest, "EventQueue_Collectable_Ref");
    }

/**
 *
 * Constructor for EventQueueSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public EventQueueSubRequestParent(String id, String method) {
    super(id, "EventQueue", method);
  }
}
