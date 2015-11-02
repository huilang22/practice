/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupUpdateNoOpRequest.java
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
 * NoOp class used to simulate a GroupUpdateNoOpRequest Udt Request/Response
 *
 */
public class GroupUpdateNoOpRequest extends GroupSubRequestParent {
/**
 *
 * Constructor to create a   GroupUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GroupUpdateNoOpRequest(String id, GroupObjectData noOpIn) {
    super(id, "GroupUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Group", GroupObjectHelper.toMap(noOpIn, new HashMap(), "Group").get("Group"));
    }
  }
/**
 *
 * Retrieves the GroupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GroupObjectData getOutput() {
    return GroupObjectHelper.fromMap(outputMap, "Group");
  }
}
