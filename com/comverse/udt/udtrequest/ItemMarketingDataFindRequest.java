/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataFindRequest.java
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
 * Class used to create a ItemMarketingDataFindRequest Udt Request
 *
 */

public class ItemMarketingDataFindRequest extends ItemMarketingDataRequest {
/**
 *
 * Constructor to create a  ItemMarketingDataFindRequest
 * @param id Unique request name
 * @param itemMarketingDataFindIn ItemMarketingDataObjectFilter for ItemMarketingDataFindRequest
 *
 */
@JsonCreator
  public ItemMarketingDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemMarketingData")ItemMarketingDataObjectFilter itemMarketingDataFindIn) {
    super(id, "ItemMarketingDataFind");
    if (itemMarketingDataFindIn != null) {
      Integer index =  itemMarketingDataFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(itemMarketingDataFindIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }

/**
 *
 * Retrieves the ItemMarketingDataObjectDataList that results from the ItemMarketingDataFindRequest call
 * @return ItemMarketingDataObjectDataList resulting from udt call
 *
 */

  public ItemMarketingDataObjectDataList getOutput() {
    return ItemMarketingDataObjectHelper.fromMapList(outputMap, "ItemMarketingDataList");
  }
}
