/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemRouteGetNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ItemRouteGetNoOpRequest Udt Request/Response
 *
 */
public class ItemRouteGetNoOpRequest extends ItemRouteSubRequestParent {
/**
 *
 * Constructor to create a   ItemRouteGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemRouteGetNoOpRequest(String id, ItemRouteObjectData noOpIn) {
    super(id, "ItemRouteGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ItemRoute", ItemRouteObjectHelper.toMap(noOpIn, new HashMap(), "ItemRoute").get("ItemRoute"));
    }
  }
/**
 *
 * Retrieves the ItemRouteObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemRouteObjectData getOutput() {
    return ItemRouteObjectHelper.fromMap(outputMap, "ItemRoute");
  }
}
