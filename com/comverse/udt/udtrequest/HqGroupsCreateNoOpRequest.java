/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsCreateNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a HqGroupsCreateNoOpRequest Udt Request/Response
 *
 */
public class HqGroupsCreateNoOpRequest extends HqGroupsSubRequestParent {
/**
 *
 * Constructor to create a   HqGroupsCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupsCreateNoOpRequest(String id, HqGroupsObjectData noOpIn) {
    super(id, "HqGroupsCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("HqGroups", HqGroupsObjectHelper.toMap(noOpIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }
/**
 *
 * Retrieves the HqGroupsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupsObjectData getOutput() {
    return HqGroupsObjectHelper.fromMap(outputMap, "HqGroups");
  }
}
