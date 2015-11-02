/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryCreateRequest.java
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
 * Class used to create a ItemCategoryCreateRequest Udt Request
 *
 */

public class ItemCategoryCreateRequest extends ItemCategorySubRequestParent {
/**
 *
 * Constructor to create a  ItemCategoryCreateRequest
 * @param id Unique request name
 * @param itemCategoryCreateIn ItemCategoryObjectData for ItemCategoryCreateRequest
 *
 */
@JsonCreator
  public ItemCategoryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemCategory")ItemCategoryObjectData itemCategoryCreateIn) {
    super(id, "ItemCategoryCreate");
    if (itemCategoryCreateIn != null) {
      addInput("ItemCategory", ItemCategoryObjectHelper.toMap(itemCategoryCreateIn, new HashMap(), "ItemCategory").get("ItemCategory"));
    }
  }

/**
 *
 * Retrieves the ItemCategoryObjectData that results from the ItemCategoryCreateRequest call
 * @return ItemCategoryObjectData resulting from udt call
 *
 */

  public ItemCategoryObjectData getOutput() {
    return ItemCategoryObjectHelper.fromMap(outputMap, "ItemCategory");
  }
}
