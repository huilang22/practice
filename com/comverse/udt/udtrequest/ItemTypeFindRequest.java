/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeFindRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ItemTypeFindRequest Udt Request
 *
 */

public class ItemTypeFindRequest extends ItemTypeRequest {
/**
 *
 * Constructor to create a  ItemTypeFindRequest
 * @param id Unique request name
 * @param ItemTypeFindIn ItemTypeObjectFilter for ItemTypeFindRequest
 *
 */
@JsonCreator
  public ItemTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemType")ItemTypeObjectFilter ItemTypeFindIn) {
    super(id, "ItemTypeFind");
    if (ItemTypeFindIn != null) {
      Integer index =  ItemTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemType", ItemTypeObjectHelper.toMap(ItemTypeFindIn, new HashMap(), "ItemType").get("ItemType"));
    }
  }

/**
 *
 * Retrieves the ItemTypeObjectDataList that results from the ItemTypeFindRequest call
 * @return ItemTypeObjectDataList resulting from udt call
 *
 */

  public ItemTypeObjectDataList getOutput() {
    return ItemTypeObjectHelper.fromMapList(outputMap, "ItemTypeList");
  }
}
