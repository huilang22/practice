/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSubjMatterRatingGetBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsSubjMatterRatingGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSubjMatterRatingGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSubjMatterRatingObjectKeyData InvsSubjMatterRatingGetIn;
/**
 *
 * Constructor to create a  InvsSubjMatterRatingGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSubjMatterRatingGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSubjMatterRatingObjectKeyData InvsSubjMatterRatingGetInIn) {
    super(id, context, "InvsSubjMatterRatingGet");
    InvsSubjMatterRatingGetIn = InvsSubjMatterRatingGetInIn;
  }

  public void translateToMap() {
    if (InvsSubjMatterRatingGetIn != null) {
      InvsSubjMatterRatingGetIn.resetFlags(true, true);
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectKeyHelper.toMap(InvsSubjMatterRatingGetIn, new HashMap(), "InvsSubjMatterRatingObjectKeyData").get("InvsSubjMatterRatingObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsSubjMatterRating
 * @param InvsSubjMatterRatingGetInIn Value of the InvsSubjMatterRatingGetIn
 *
 */

  public void setInvsSubjMatterRating(InvsSubjMatterRatingObjectKeyData InvsSubjMatterRatingGetInIn) {
    InvsSubjMatterRatingGetIn = InvsSubjMatterRatingGetInIn;
  }

  public void translateFromMap() {
    InvsSubjMatterRatingGetIn = InvsSubjMatterRatingObjectKeyHelper.fromMap(inputMap, "InvsSubjMatterRating");
  }

/**
 *
 * Gets the InvsSubjMatterRating
 * @return Value of the InvsSubjMatterRating
 *
 */

  public InvsSubjMatterRatingObjectKeyData getInvsSubjMatterRating( ) {
    return InvsSubjMatterRatingGetIn;
  }

}
