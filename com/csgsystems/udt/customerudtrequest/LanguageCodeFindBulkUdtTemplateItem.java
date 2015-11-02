/*
 * Generated code DO NOT EDIT
 * Generated file: LanguageCodeFindBulkUdtTemplateItem.java
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
 * Class used to create a LanguageCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class LanguageCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LCObjectFilter LCFindIn;
/**
 *
 * Constructor to create a  LanguageCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LanguageCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, LCObjectFilter LCFindInIn) {
    super(id, context, "LanguageCodeFind");
    LCFindIn = LCFindInIn;
  }

  public void translateToMap() {
    if (LCFindIn != null) {
      Integer index =  LCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LanguageCode", LCObjectHelper.toMap(LCFindIn, new HashMap(), "LanguageCode").get("LanguageCode"));
    }
  }


/**
 *
 * Sets the LanguageCode
 * @param LCFindInIn Value of the LCFindIn
 *
 */

  public void setLanguageCode(LCObjectFilter LCFindInIn) {
    LCFindIn = LCFindInIn;
  }

  public void translateFromMap() {
    LCFindIn = LCObjectHelper.fromMapFilter(inputMap, "LanguageCode");
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public LCObjectFilter getLanguageCode( ) {
    return LCFindIn;
  }

}
