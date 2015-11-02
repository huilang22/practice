/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapUpdateNoOpRequest.java
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
 * NoOp class used to simulate a GlobalOpenItemIdMapUpdateNoOpRequest Udt Request/Response
 *
 */
public class GlobalOpenItemIdMapUpdateNoOpRequest extends GlobalOpenItemIdMapSubRequestParent {
/**
 *
 * Constructor to create a   GlobalOpenItemIdMapUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GlobalOpenItemIdMapUpdateNoOpRequest(String id, GlobalOpenItemIdMapObjectData noOpIn) {
    super(id, "GlobalOpenItemIdMapUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(noOpIn, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }
/**
 *
 * Retrieves the GlobalOpenItemIdMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GlobalOpenItemIdMapObjectData getOutput() {
    return GlobalOpenItemIdMapObjectHelper.fromMap(outputMap, "GlobalOpenItemIdMap");
  }
}
