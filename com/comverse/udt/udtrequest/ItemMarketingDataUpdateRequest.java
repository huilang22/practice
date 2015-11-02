/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataUpdateRequest.java
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
 * Class used to create a ItemMarketingDataUpdateRequest Udt Request
 *
 */

public class ItemMarketingDataUpdateRequest extends ItemMarketingDataSubRequestParent {
/**
 *
 * Constructor to create a  ItemMarketingDataUpdateRequest
 * @param id Unique request name
 * @param itemMarketingDataUpdateIn ItemMarketingDataObjectData for ItemMarketingDataUpdateRequest
 *
 */
@JsonCreator
  public ItemMarketingDataUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemMarketingData")ItemMarketingDataObjectData itemMarketingDataUpdateIn) {
    super(id, "ItemMarketingDataUpdate");
    if (itemMarketingDataUpdateIn != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(itemMarketingDataUpdateIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }

/**
 *
 * Retrieves the ItemMarketingDataObjectData that results from the ItemMarketingDataUpdateRequest call
 * @return ItemMarketingDataObjectData resulting from udt call
 *
 */

  public ItemMarketingDataObjectData getOutput() {
    return ItemMarketingDataObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
}
