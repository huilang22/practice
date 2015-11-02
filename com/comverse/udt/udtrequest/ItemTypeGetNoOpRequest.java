/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a ItemTypeGetNoOpRequest Udt Request/Response
 *
 */
public class ItemTypeGetNoOpRequest extends ItemTypeSubRequestParent {
/**
 *
 * Constructor to create a   ItemTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemTypeGetNoOpRequest(String id, ItemTypeObjectData noOpIn) {
    super(id, "ItemTypeGetNoOpRequest");
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
