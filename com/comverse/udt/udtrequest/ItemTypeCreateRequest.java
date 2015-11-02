/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeCreateRequest.java
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
 * Class used to create a ItemTypeCreateRequest Udt Request
 *
 */

public class ItemTypeCreateRequest extends ItemTypeSubRequestParent {
/**
 *
 * Constructor to create a  ItemTypeCreateRequest
 * @param id Unique request name
 * @param ItemTypeCreateIn ItemTypeObjectData for ItemTypeCreateRequest
 *
 */
@JsonCreator
  public ItemTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemType")ItemTypeObjectData ItemTypeCreateIn) {
    super(id, "ItemTypeCreate");
    if (ItemTypeCreateIn != null) {
      addInput("ItemType", ItemTypeObjectHelper.toMap(ItemTypeCreateIn, new HashMap(), "ItemType").get("ItemType"));
    }
  }

/**
 *
 * Retrieves the ItemTypeObjectData that results from the ItemTypeCreateRequest call
 * @return ItemTypeObjectData resulting from udt call
 *
 */

  public ItemTypeObjectData getOutput() {
    return ItemTypeObjectHelper.fromMap(outputMap, "ItemType");
  }
}
