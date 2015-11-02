/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeGetRequest.java
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
 * Class used to create a ItemTypeGetRequest Udt Request
 *
 */

public class ItemTypeGetRequest extends ItemTypeSubRequestParent {
/**
 *
 * Constructor to create a  ItemTypeGetRequest
 * @param id Unique request name
 * @param ItemTypeGetIn ItemTypeObjectKeyData for ItemTypeGetRequest
 *
 */
@JsonCreator
  public ItemTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemType")ItemTypeObjectKeyData ItemTypeGetIn) {
    super(id, "ItemTypeGet");
    if (ItemTypeGetIn != null) {
      addInput("ItemType", ItemTypeObjectKeyHelper.toMap(ItemTypeGetIn, new HashMap(), "ItemTypeObjectKeyData").get("ItemTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemTypeObjectData that results from the ItemTypeGetRequest call
 * @return ItemTypeObjectData resulting from udt call
 *
 */

  public ItemTypeObjectData getOutput() {
    return ItemTypeObjectHelper.fromMap(outputMap, "ItemType");
  }
}
