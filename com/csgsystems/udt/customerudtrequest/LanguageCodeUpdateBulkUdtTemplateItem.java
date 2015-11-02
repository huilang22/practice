/*
 * Generated code DO NOT EDIT
 * Generated file: LanguageCodeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a LanguageCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class LanguageCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LCObjectData LCUpdateIn;
/**
 *
 * Constructor to create a  LanguageCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LanguageCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, LCObjectData LCUpdateInIn) {
    super(id, context, "LanguageCodeUpdate");
    LCUpdateIn = LCUpdateInIn;
  }

  public void translateToMap() {
    if (LCUpdateIn != null) {
      LCUpdateIn.resetFlags(true, true);
      addInput("LanguageCode", LCObjectHelper.toMap(LCUpdateIn, new HashMap(), "LanguageCode").get("LanguageCode"));
    }
  }


/**
 *
 * Sets the LanguageCode
 * @param LCUpdateInIn Value of the LCUpdateIn
 *
 */

  public void setLanguageCode(LCObjectData LCUpdateInIn) {
    LCUpdateIn = LCUpdateInIn;
  }

  public void translateFromMap() {
    LCUpdateIn = LCObjectHelper.fromMap(inputMap, "LanguageCode");
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public LCObjectData getLanguageCode( ) {
    return LCUpdateIn;
  }

}
