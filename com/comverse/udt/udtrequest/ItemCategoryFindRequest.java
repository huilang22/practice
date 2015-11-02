/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryFindRequest.java
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
 * Class used to create a ItemCategoryFindRequest Udt Request
 *
 */

public class ItemCategoryFindRequest extends ItemCategoryRequest {
/**
 *
 * Constructor to create a  ItemCategoryFindRequest
 * @param id Unique request name
 * @param itemCategoryFindIn ItemCategoryObjectFilter for ItemCategoryFindRequest
 *
 */
@JsonCreator
  public ItemCategoryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemCategory")ItemCategoryObjectFilter itemCategoryFindIn) {
    super(id, "ItemCategoryFind");
    if (itemCategoryFindIn != null) {
      Integer index =  itemCategoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemCategory", ItemCategoryObjectHelper.toMap(itemCategoryFindIn, new HashMap(), "ItemCategory").get("ItemCategory"));
    }
  }

/**
 *
 * Retrieves the ItemCategoryObjectDataList that results from the ItemCategoryFindRequest call
 * @return ItemCategoryObjectDataList resulting from udt call
 *
 */

  public ItemCategoryObjectDataList getOutput() {
    return ItemCategoryObjectHelper.fromMapList(outputMap, "ItemCategoryList");
  }
}
