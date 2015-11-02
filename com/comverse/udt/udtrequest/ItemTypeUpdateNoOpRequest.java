/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ItemTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class ItemTypeUpdateNoOpRequest extends ItemTypeSubRequestParent {
/**
 *
 * Constructor to create a   ItemTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemTypeUpdateNoOpRequest(String id, ItemTypeObjectData noOpIn) {
    super(id, "ItemTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ItemType", ItemTypeObjectHelper.toMap(noOpIn, new HashMap(), "ItemType").get("ItemType"));
    }
  }
/**
 *
 * Retrieves the ItemTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemTypeObjectData getOutput() {
    return ItemTypeObjectHelper.fromMap(outputMap, "ItemType");
  }
}
