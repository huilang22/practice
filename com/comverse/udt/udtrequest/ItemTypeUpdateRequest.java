/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeUpdateRequest.java
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
 * Class used to create a ItemTypeUpdateRequest Udt Request
 *
 */

public class ItemTypeUpdateRequest extends ItemTypeSubRequestParent {
/**
 *
 * Constructor to create a  ItemTypeUpdateRequest
 * @param id Unique request name
 * @param ItemTypeUpdateIn ItemTypeObjectData for ItemTypeUpdateRequest
 *
 */
@JsonCreator
  public ItemTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemType")ItemTypeObjectData ItemTypeUpdateIn) {
    super(id, "ItemTypeUpdate");
    if (ItemTypeUpdateIn != null) {
      addInput("ItemType", ItemTypeObjectHelper.toMap(ItemTypeUpdateIn, new HashMap(), "ItemType").get("ItemType"));
    }
  }

/**
 *
 * Retrieves the ItemTypeObjectData that results from the ItemTypeUpdateRequest call
 * @return ItemTypeObjectData resulting from udt call
 *
 */

  public ItemTypeObjectData getOutput() {
    return ItemTypeObjectHelper.fromMap(outputMap, "ItemType");
  }
}
