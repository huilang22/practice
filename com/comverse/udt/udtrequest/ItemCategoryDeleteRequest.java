/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryDeleteRequest.java
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
 * Class used to create a ItemCategoryDeleteRequest Udt Request
 *
 */

public class ItemCategoryDeleteRequest extends ItemCategorySubRequestParent {
/**
 *
 * Constructor to create a  ItemCategoryDeleteRequest
 * @param id Unique request name
 * @param itemCategoryDeleteIn ItemCategoryObjectKeyData for ItemCategoryDeleteRequest
 *
 */
@JsonCreator
  public ItemCategoryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemCategory")ItemCategoryObjectKeyData itemCategoryDeleteIn) {
    super(id, "ItemCategoryDelete");
    if (itemCategoryDeleteIn != null) {
      addInput("ItemCategory", ItemCategoryObjectKeyHelper.toMap(itemCategoryDeleteIn, new HashMap(), "ItemCategoryObjectKeyData").get("ItemCategoryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemCategoryObjectData that results from the ItemCategoryDeleteRequest call
 * @return ItemCategoryObjectData resulting from udt call
 *
 */

  public ItemCategoryObjectData getOutput() {
    return ItemCategoryObjectHelper.fromMap(outputMap, "ItemCategory");
  }
}
