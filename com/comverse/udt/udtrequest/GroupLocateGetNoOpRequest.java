/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupLocateGetNoOpRequest.java
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
 * NoOp class used to simulate a GroupLocateGetNoOpRequest Udt Request/Response
 *
 */
public class GroupLocateGetNoOpRequest extends GroupLocateSubRequestParent {
/**
 *
 * Constructor to create a   GroupLocateGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GroupLocateGetNoOpRequest(String id, GroupLocateObjectData noOpIn) {
    super(id, "GroupLocateGetNoOpRequest");
    if (noOpIn != null) {
      addInput("GroupLocate", GroupLocateObjectHelper.toMap(noOpIn, new HashMap(), "GroupLocate").get("GroupLocate"));
    }
  }
/**
 *
 * Retrieves the GroupLocateObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GroupLocateObjectData getOutput() {
    return GroupLocateObjectHelper.fromMap(outputMap, "GroupLocate");
  }
}
