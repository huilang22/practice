/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryDeleteNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ItemCategoryDeleteNoOpRequest Udt Request/Response
 *
 */
public class ItemCategoryDeleteNoOpRequest extends ItemCategorySubRequestParent {
/**
 *
 * Constructor to create a   ItemCategoryDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemCategoryDeleteNoOpRequest(String id, ItemCategoryObjectData noOpIn) {
    super(id, "ItemCategoryDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("ItemCategory", ItemCategoryObjectHelper.toMap(noOpIn, new HashMap(), "ItemCategory").get("ItemCategory"));
    }
  }
/**
 *
 * Retrieves the ItemCategoryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemCategoryObjectData getOutput() {
    return ItemCategoryObjectHelper.fromMap(outputMap, "ItemCategory");
  }
}
