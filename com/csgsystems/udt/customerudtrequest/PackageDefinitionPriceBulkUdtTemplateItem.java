/*
 * Generated code DO NOT EDIT
 * Generated file: PackageDefinitionPriceBulkUdtTemplateItem.java
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
 * Class used to create a PackageDefinitionPriceBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageDefinitionPriceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PDObjectKeyData pdpPackageDefinitionIn;
  protected RatingKeyObjectData pdpRatingKeyIn;
/**
 *
 * Constructor to create a  PackageDefinitionPriceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageDefinitionPriceBulkUdtTemplateItem(String id, BSDMSessionContext context, PDObjectKeyData pdpPackageDefinitionInIn, RatingKeyObjectData pdpRatingKeyInIn) {
    super(id, context, "PackageDefinitionPrice");
    pdpPackageDefinitionIn = pdpPackageDefinitionInIn;
    pdpRatingKeyIn = pdpRatingKeyInIn;
  }

  public void translateToMap() {
    if (pdpPackageDefinitionIn != null) {
      pdpPackageDefinitionIn.resetFlags(true, true);
      addInput("Package", PDObjectKeyHelper.toMap(pdpPackageDefinitionIn, new HashMap(), "PDObjectKeyData").get("PDObjectKeyData"));
    }
    if (pdpRatingKeyIn != null) {
      pdpRatingKeyIn.resetFlags(true, true);
      addInput("RatingKey", RatingKeyObjectHelper.toMap(pdpRatingKeyIn, new HashMap(), "PdPrice").get("PdPrice"));
    }
  }


/**
 *
 * Sets the Package
 * @param pdpPackageDefinitionInIn Value of the pdpPackageDefinitionIn
 *
 */

  public void setPackage(PDObjectKeyData pdpPackageDefinitionInIn) {
    pdpPackageDefinitionIn = pdpPackageDefinitionInIn;
  }

/**
 *
 * Sets the RatingKey
 * @param pdpRatingKeyInIn Value of the pdpRatingKeyIn
 *
 */

  public void setRatingKey(RatingKeyObjectData pdpRatingKeyInIn) {
    pdpRatingKeyIn = pdpRatingKeyInIn;
  }

  public void translateFromMap() {
    pdpPackageDefinitionIn = PDObjectKeyHelper.fromMap(inputMap, "Package");
    pdpRatingKeyIn = RatingKeyObjectHelper.fromMap(inputMap, "RatingKey");
  }

/**
 *
 * Gets the Package
 * @return Value of the Package
 *
 */

  public PDObjectKeyData getPackage( ) {
    return pdpPackageDefinitionIn;
  }

/**
 *
 * Gets the RatingKey
 * @return Value of the RatingKey
 *
 */

  public RatingKeyObjectData getRatingKey( ) {
    return pdpRatingKeyIn;
  }

}
