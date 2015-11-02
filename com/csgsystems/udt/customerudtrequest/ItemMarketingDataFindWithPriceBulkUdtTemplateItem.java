/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataFindWithPriceBulkUdtTemplateItem.java
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
 * Class used to create a ItemMarketingDataFindWithPriceBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemMarketingDataFindWithPriceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemMarketingDataObjectFilter imdfwpItemMarketingDataIn;
  protected RatingKeyObjectData imdfwpRatingKeyIn;
/**
 *
 * Constructor to create a  ItemMarketingDataFindWithPriceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemMarketingDataFindWithPriceBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataObjectFilter imdfwpItemMarketingDataInIn, RatingKeyObjectData imdfwpRatingKeyInIn) {
    super(id, context, "ItemMarketingDataFindWithPrice");
    imdfwpItemMarketingDataIn = imdfwpItemMarketingDataInIn;
    imdfwpRatingKeyIn = imdfwpRatingKeyInIn;
  }

  public void translateToMap() {
    if (imdfwpItemMarketingDataIn != null) {
      Integer index =  imdfwpItemMarketingDataIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(imdfwpItemMarketingDataIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
    if (imdfwpRatingKeyIn != null) {
      imdfwpRatingKeyIn.resetFlags(true, true);
      addInput("RatingKey", RatingKeyObjectHelper.toMap(imdfwpRatingKeyIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }


/**
 *
 * Sets the ItemMarketingData
 * @param imdfwpItemMarketingDataInIn Value of the imdfwpItemMarketingDataIn
 *
 */

  public void setItemMarketingData(ItemMarketingDataObjectFilter imdfwpItemMarketingDataInIn) {
    imdfwpItemMarketingDataIn = imdfwpItemMarketingDataInIn;
  }

/**
 *
 * Sets the RatingKey
 * @param imdfwpRatingKeyInIn Value of the imdfwpRatingKeyIn
 *
 */

  public void setRatingKey(RatingKeyObjectData imdfwpRatingKeyInIn) {
    imdfwpRatingKeyIn = imdfwpRatingKeyInIn;
  }

  public void translateFromMap() {
    imdfwpItemMarketingDataIn = ItemMarketingDataObjectHelper.fromMapFilter(inputMap, "ItemMarketingData");
    imdfwpRatingKeyIn = RatingKeyObjectHelper.fromMap(inputMap, "RatingKey");
  }

/**
 *
 * Gets the ItemMarketingData
 * @return Value of the ItemMarketingData
 *
 */

  public ItemMarketingDataObjectFilter getItemMarketingData( ) {
    return imdfwpItemMarketingDataIn;
  }

/**
 *
 * Gets the RatingKey
 * @return Value of the RatingKey
 *
 */

  public RatingKeyObjectData getRatingKey( ) {
    return imdfwpRatingKeyIn;
  }

}
