/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataGetWithPriceBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ItemMarketingDataGetWithPriceBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemMarketingDataGetWithPriceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemMarketingDataObjectKeyData imdgwpItemMarketingDataIn;
  protected RatingKeyObjectData imdgwpRatingKeyIn;
/**
 *
 * Constructor to create a  ItemMarketingDataGetWithPriceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemMarketingDataGetWithPriceBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataObjectKeyData imdgwpItemMarketingDataInIn, RatingKeyObjectData imdgwpRatingKeyInIn) {
    super(id, context, "ItemMarketingDataGetWithPrice");
    imdgwpItemMarketingDataIn = imdgwpItemMarketingDataInIn;
    imdgwpRatingKeyIn = imdgwpRatingKeyInIn;
  }

  public void translateToMap() {
    if (imdgwpItemMarketingDataIn != null) {
      imdgwpItemMarketingDataIn.resetFlags(true, true);
      addInput("ItemMarketingData", ItemMarketingDataObjectKeyHelper.toMap(imdgwpItemMarketingDataIn, new HashMap(), "ItemMarketingDataObjectKeyData").get("ItemMarketingDataObjectKeyData"));
    }
    if (imdgwpRatingKeyIn != null) {
      imdgwpRatingKeyIn.resetFlags(true, true);
      addInput("RatingKey", RatingKeyObjectHelper.toMap(imdgwpRatingKeyIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }


/**
 *
 * Sets the ItemMarketingData
 * @param imdgwpItemMarketingDataInIn Value of the imdgwpItemMarketingDataIn
 *
 */

  public void setItemMarketingData(ItemMarketingDataObjectKeyData imdgwpItemMarketingDataInIn) {
    imdgwpItemMarketingDataIn = imdgwpItemMarketingDataInIn;
  }

/**
 *
 * Sets the RatingKey
 * @param imdgwpRatingKeyInIn Value of the imdgwpRatingKeyIn
 *
 */

  public void setRatingKey(RatingKeyObjectData imdgwpRatingKeyInIn) {
    imdgwpRatingKeyIn = imdgwpRatingKeyInIn;
  }

  public void translateFromMap() {
    imdgwpItemMarketingDataIn = ItemMarketingDataObjectKeyHelper.fromMap(inputMap, "ItemMarketingData");
    imdgwpRatingKeyIn = RatingKeyObjectHelper.fromMap(inputMap, "RatingKey");
  }

/**
 *
 * Gets the ItemMarketingData
 * @return Value of the ItemMarketingData
 *
 */

  public ItemMarketingDataObjectKeyData getItemMarketingData( ) {
    return imdgwpItemMarketingDataIn;
  }

/**
 *
 * Gets the RatingKey
 * @return Value of the RatingKey
 *
 */

  public RatingKeyObjectData getRatingKey( ) {
    return imdgwpRatingKeyIn;
  }

}
