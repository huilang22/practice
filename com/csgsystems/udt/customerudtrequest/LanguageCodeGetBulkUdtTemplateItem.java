/*
 * Generated code DO NOT EDIT
 * Generated file: LanguageCodeGetBulkUdtTemplateItem.java
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
 * Class used to create a LanguageCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class LanguageCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LCObjectKeyData LCGetIn;
/**
 *
 * Constructor to create a  LanguageCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LanguageCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, LCObjectKeyData LCGetInIn) {
    super(id, context, "LanguageCodeGet");
    LCGetIn = LCGetInIn;
  }

  public void translateToMap() {
    if (LCGetIn != null) {
      LCGetIn.resetFlags(true, true);
      addInput("LanguageCode", LCObjectKeyHelper.toMap(LCGetIn, new HashMap(), "LCObjectKeyData").get("LCObjectKeyData"));
    }
  }


/**
 *
 * Sets the LanguageCode
 * @param LCGetInIn Value of the LCGetIn
 *
 */

  public void setLanguageCode(LCObjectKeyData LCGetInIn) {
    LCGetIn = LCGetInIn;
  }

  public void translateFromMap() {
    LCGetIn = LCObjectKeyHelper.fromMap(inputMap, "LanguageCode");
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public LCObjectKeyData getLanguageCode( ) {
    return LCGetIn;
  }

}
