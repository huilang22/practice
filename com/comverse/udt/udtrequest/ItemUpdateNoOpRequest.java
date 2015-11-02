/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ItemUpdateNoOpRequest Udt Request/Response
 *
 */
public class ItemUpdateNoOpRequest extends ItemSubRequestParent {
/**
 *
 * Constructor to create a   ItemUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemUpdateNoOpRequest(String id, ItemObjectData noOpIn) {
    super(id, "ItemUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Item", ItemObjectHelper.toMap(noOpIn, new HashMap(), "Item").get("Item"));
    }
  }
/**
 *
 * Retrieves the ItemObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemObjectData getOutput() {
    return ItemObjectHelper.fromMap(outputMap, "Item");
  }
}
