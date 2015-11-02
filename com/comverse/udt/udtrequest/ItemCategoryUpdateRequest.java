/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ItemCategoryUpdateRequest Udt Request
 *
 */

public class ItemCategoryUpdateRequest extends ItemCategorySubRequestParent {
/**
 *
 * Constructor to create a  ItemCategoryUpdateRequest
 * @param id Unique request name
 * @param itemCategoryUpdateIn ItemCategoryObjectData for ItemCategoryUpdateRequest
 *
 */
@JsonCreator
  public ItemCategoryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemCategory")ItemCategoryObjectData itemCategoryUpdateIn) {
    super(id, "ItemCategoryUpdate");
    if (itemCategoryUpdateIn != null) {
      addInput("ItemCategory", ItemCategoryObjectHelper.toMap(itemCategoryUpdateIn, new HashMap(), "ItemCategory").get("ItemCategory"));
    }
  }

/**
 *
 * Retrieves the ItemCategoryObjectData that results from the ItemCategoryUpdateRequest call
 * @return ItemCategoryObjectData resulting from udt call
 *
 */

  public ItemCategoryObjectData getOutput() {
    return ItemCategoryObjectHelper.fromMap(outputMap, "ItemCategory");
  }
}
