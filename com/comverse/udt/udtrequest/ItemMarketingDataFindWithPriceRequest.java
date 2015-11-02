/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataFindWithPriceRequest.java
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
 * Class used to create a ItemMarketingDataFindWithPriceRequest Udt Request
 *
 */

public class ItemMarketingDataFindWithPriceRequest extends ItemMarketingDataRequest {
/**
 *
 * Constructor to create a  ItemMarketingDataFindWithPriceRequest
 * @param id Unique request name
 * @param imdfwpItemMarketingDataIn ItemMarketingDataObjectFilter for ItemMarketingDataFindWithPriceRequest
 * @param imdfwpRatingKeyIn RatingKeyObjectData for ItemMarketingDataFindWithPriceRequest
 *
 */
@JsonCreator
  public ItemMarketingDataFindWithPriceRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemMarketingData")ItemMarketingDataObjectFilter imdfwpItemMarketingDataIn, @JsonProperty("RatingKey")RatingKeyObjectData imdfwpRatingKeyIn) {
    super(id, "ItemMarketingDataFindWithPrice");
    if (imdfwpItemMarketingDataIn != null) {
      Integer index =  imdfwpItemMarketingDataIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(imdfwpItemMarketingDataIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
    if (imdfwpRatingKeyIn != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(imdfwpRatingKeyIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }

/**
 *
 * Retrieves the ItemMarketingDataWithPriceObjectDataList that results from the ItemMarketingDataFindWithPriceRequest call
 * @return ItemMarketingDataWithPriceObjectDataList resulting from udt call
 *
 */

  public ItemMarketingDataWithPriceObjectDataList getOutput() {
    return ItemMarketingDataWithPriceObjectHelper.fromMapList(outputMap, "ItemMarketingDataList");
  }
}
