/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataPriceBulkUdtTemplateItem.java
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
 * Class used to create a ItemMarketingDataPriceBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemMarketingDataPriceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemMarketingDataObjectKeyData imdpItemMarketingDataIn;
  protected RatingKeyObjectData imdpRatingKeyIn;
/**
 *
 * Constructor to create a  ItemMarketingDataPriceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemMarketingDataPriceBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataObjectKeyData imdpItemMarketingDataInIn, RatingKeyObjectData imdpRatingKeyInIn) {
    super(id, context, "ItemMarketingDataPrice");
    imdpItemMarketingDataIn = imdpItemMarketingDataInIn;
    imdpRatingKeyIn = imdpRatingKeyInIn;
  }

  public void translateToMap() {
    if (imdpItemMarketingDataIn != null) {
      imdpItemMarketingDataIn.resetFlags(true, true);
      addInput("ItemMarketingData", ItemMarketingDataObjectKeyHelper.toMap(imdpItemMarketingDataIn, new HashMap(), "ItemMarketingDataObjectKeyData").get("ItemMarketingDataObjectKeyData"));
    }
    if (imdpRatingKeyIn != null) {
      imdpRatingKeyIn.resetFlags(true, true);
      addInput("RatingKey", RatingKeyObjectHelper.toMap(imdpRatingKeyIn, new HashMap(), "ImdPrice").get("ImdPrice"));
    }
  }


/**
 *
 * Sets the ItemMarketingData
 * @param imdpItemMarketingDataInIn Value of the imdpItemMarketingDataIn
 *
 */

  public void setItemMarketingData(ItemMarketingDataObjectKeyData imdpItemMarketingDataInIn) {
    imdpItemMarketingDataIn = imdpItemMarketingDataInIn;
  }

/**
 *
 * Sets the RatingKey
 * @param imdpRatingKeyInIn Value of the imdpRatingKeyIn
 *
 */

  public void setRatingKey(RatingKeyObjectData imdpRatingKeyInIn) {
    imdpRatingKeyIn = imdpRatingKeyInIn;
  }

  public void translateFromMap() {
    imdpItemMarketingDataIn = ItemMarketingDataObjectKeyHelper.fromMap(inputMap, "ItemMarketingData");
    imdpRatingKeyIn = RatingKeyObjectHelper.fromMap(inputMap, "RatingKey");
  }

/**
 *
 * Gets the ItemMarketingData
 * @return Value of the ItemMarketingData
 *
 */

  public ItemMarketingDataObjectKeyData getItemMarketingData( ) {
    return imdpItemMarketingDataIn;
  }

/**
 *
 * Gets the RatingKey
 * @return Value of the RatingKey
 *
 */

  public RatingKeyObjectData getRatingKey( ) {
    return imdpRatingKeyIn;
  }

}
