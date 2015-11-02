/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataPriceRequest.java
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
 * Class used to create a ItemMarketingDataPriceRequest Udt Request
 *
 */

public class ItemMarketingDataPriceRequest extends ItemMarketingDataRequest {
/**
 *
 * Constructor to create a  ItemMarketingDataPriceRequest
 * @param id Unique request name
 * @param imdpItemMarketingDataIn ItemMarketingDataObjectKeyData for ItemMarketingDataPriceRequest
 * @param imdpRatingKeyIn RatingKeyObjectData for ItemMarketingDataPriceRequest
 *
 */
@JsonCreator
  public ItemMarketingDataPriceRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemMarketingData")ItemMarketingDataObjectKeyData imdpItemMarketingDataIn, @JsonProperty("RatingKey")RatingKeyObjectData imdpRatingKeyIn) {
    super(id, "ItemMarketingDataPrice");
    if (imdpItemMarketingDataIn != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectKeyHelper.toMap(imdpItemMarketingDataIn, new HashMap(), "ItemMarketingDataObjectKeyData").get("ItemMarketingDataObjectKeyData"));
    }
    if (imdpRatingKeyIn != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(imdpRatingKeyIn, new HashMap(), "ImdPrice").get("ImdPrice"));
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the ItemMarketingDataPriceRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("ImdPrice");
  }
}
