/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementTypeSubRequestParent.java
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
 * Abstract base class for all SlaMeasurementType related UdtSubRequestParents
 *
 */
public abstract class SlaMeasurementTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SlaMeasurementTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SlaMeasurementTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SlaMeasurementTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SlaMeasurementTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SlaMeasurementTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SlaMeasurementTypeSubRequestParent(String id, String method) {
    super(id, "SlaMeasurementType", method);
  }
}
