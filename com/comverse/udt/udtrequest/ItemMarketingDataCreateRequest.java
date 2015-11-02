/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataCreateRequest.java
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
 * Class used to create a ItemMarketingDataCreateRequest Udt Request
 *
 */

public class ItemMarketingDataCreateRequest extends ItemMarketingDataSubRequestParent {
/**
 *
 * Constructor to create a  ItemMarketingDataCreateRequest
 * @param id Unique request name
 * @param itemMarketingDataCreateIn ItemMarketingDataObjectData for ItemMarketingDataCreateRequest
 *
 */
@JsonCreator
  public ItemMarketingDataCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemMarketingData")ItemMarketingDataObjectData itemMarketingDataCreateIn) {
    super(id, "ItemMarketingDataCreate");
    if (itemMarketingDataCreateIn != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(itemMarketingDataCreateIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }

/**
 *
 * Retrieves the ItemMarketingDataObjectData that results from the ItemMarketingDataCreateRequest call
 * @return ItemMarketingDataObjectData resulting from udt call
 *
 */

  public ItemMarketingDataObjectData getOutput() {
    return ItemMarketingDataObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
}
