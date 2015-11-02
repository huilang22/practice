/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataGetRequest.java
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
 * Class used to create a ItemMarketingDataGetRequest Udt Request
 *
 */

public class ItemMarketingDataGetRequest extends ItemMarketingDataSubRequestParent {
/**
 *
 * Constructor to create a  ItemMarketingDataGetRequest
 * @param id Unique request name
 * @param itemMarketingDataGetIn ItemMarketingDataObjectKeyData for ItemMarketingDataGetRequest
 *
 */
@JsonCreator
  public ItemMarketingDataGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemMarketingData")ItemMarketingDataObjectKeyData itemMarketingDataGetIn) {
    super(id, "ItemMarketingDataGet");
    if (itemMarketingDataGetIn != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectKeyHelper.toMap(itemMarketingDataGetIn, new HashMap(), "ItemMarketingDataObjectKeyData").get("ItemMarketingDataObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemMarketingDataObjectData that results from the ItemMarketingDataGetRequest call
 * @return ItemMarketingDataObjectData resulting from udt call
 *
 */

  public ItemMarketingDataObjectData getOutput() {
    return ItemMarketingDataObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
}
