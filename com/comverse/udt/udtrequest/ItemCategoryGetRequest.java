/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryGetRequest.java
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
 * Class used to create a ItemCategoryGetRequest Udt Request
 *
 */

public class ItemCategoryGetRequest extends ItemCategorySubRequestParent {
/**
 *
 * Constructor to create a  ItemCategoryGetRequest
 * @param id Unique request name
 * @param itemCategoryGetIn ItemCategoryObjectKeyData for ItemCategoryGetRequest
 *
 */
@JsonCreator
  public ItemCategoryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemCategory")ItemCategoryObjectKeyData itemCategoryGetIn) {
    super(id, "ItemCategoryGet");
    if (itemCategoryGetIn != null) {
      addInput("ItemCategory", ItemCategoryObjectKeyHelper.toMap(itemCategoryGetIn, new HashMap(), "ItemCategoryObjectKeyData").get("ItemCategoryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemCategoryObjectData that results from the ItemCategoryGetRequest call
 * @return ItemCategoryObjectData resulting from udt call
 *
 */

  public ItemCategoryObjectData getOutput() {
    return ItemCategoryObjectHelper.fromMap(outputMap, "ItemCategory");
  }
}
