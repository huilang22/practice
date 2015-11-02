/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemRouteUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ItemRouteUpdateNoOpRequest Udt Request/Response
 *
 */
public class ItemRouteUpdateNoOpRequest extends ItemRouteSubRequestParent {
/**
 *
 * Constructor to create a   ItemRouteUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemRouteUpdateNoOpRequest(String id, ItemRouteObjectData noOpIn) {
    super(id, "ItemRouteUpdateNoOpRequest");
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
