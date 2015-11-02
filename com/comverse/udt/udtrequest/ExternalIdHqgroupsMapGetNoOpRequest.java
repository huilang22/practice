/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdHqgroupsMapGetNoOpRequest.java
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
 * NoOp class used to simulate a ExternalIdHqgroupsMapGetNoOpRequest Udt Request/Response
 *
 */
public class ExternalIdHqgroupsMapGetNoOpRequest extends ExternalIdHqGroupsMapSubRequestParent {
/**
 *
 * Constructor to create a   ExternalIdHqgroupsMapGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExternalIdHqgroupsMapGetNoOpRequest(String id, EIHGMObjectData noOpIn) {
    super(id, "ExternalIdHqgroupsMapGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ExternalIdHqGroupsMap", EIHGMObjectHelper.toMap(noOpIn, new HashMap(), "ExternalIdHqGroupsMap").get("ExternalIdHqGroupsMap"));
    }
  }
/**
 *
 * Retrieves the EIHGMObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EIHGMObjectData getOutput() {
    return EIHGMObjectHelper.fromMap(outputMap, "ExternalIdHqGroupsMap");
  }
}
