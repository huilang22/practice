/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemGetNoOpRequest.java
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
 * NoOp class used to simulate a ItemGetNoOpRequest Udt Request/Response
 *
 */
public class ItemGetNoOpRequest extends ItemSubRequestParent {
/**
 *
 * Constructor to create a   ItemGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemGetNoOpRequest(String id, ItemObjectData noOpIn) {
    super(id, "ItemGetNoOpRequest");
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
