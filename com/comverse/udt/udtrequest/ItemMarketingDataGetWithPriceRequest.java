/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataGetWithPriceRequest.java
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
 * Class used to create a ItemMarketingDataGetWithPriceRequest Udt Request
 *
 */

public class ItemMarketingDataGetWithPriceRequest extends ItemMarketingDataSubRequestParent {
/**
 *
 * Constructor to create a  ItemMarketingDataGetWithPriceRequest
 * @param id Unique request name
 * @param imdgwpItemMarketingDataIn ItemMarketingDataObjectKeyData for ItemMarketingDataGetWithPriceRequest
 * @param imdgwpRatingKeyIn RatingKeyObjectData for ItemMarketingDataGetWithPriceRequest
 *
 */
@JsonCreator
  public ItemMarketingDataGetWithPriceRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemMarketingData")ItemMarketingDataObjectKeyData imdgwpItemMarketingDataIn, @JsonProperty("RatingKey")RatingKeyObjectData imdgwpRatingKeyIn) {
    super(id, "ItemMarketingDataGetWithPrice");
    if (imdgwpItemMarketingDataIn != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectKeyHelper.toMap(imdgwpItemMarketingDataIn, new HashMap(), "ItemMarketingDataObjectKeyData").get("ItemMarketingDataObjectKeyData"));
    }
    if (imdgwpRatingKeyIn != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(imdgwpRatingKeyIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }

/**
 *
 * Retrieves the ItemMarketingDataWithPriceObjectData that results from the ItemMarketingDataGetWithPriceRequest call
 * @return ItemMarketingDataWithPriceObjectData resulting from udt call
 *
 */

  public ItemMarketingDataWithPriceObjectData getOutput() {
    return ItemMarketingDataWithPriceObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
}
