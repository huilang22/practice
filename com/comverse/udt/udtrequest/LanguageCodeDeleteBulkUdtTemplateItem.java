/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeDeleteBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a LanguageCodeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class LanguageCodeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LCObjectKeyData LCDeleteIn;
/**
 *
 * Constructor to create a  LanguageCodeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LanguageCodeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, LCObjectKeyData LCDeleteInIn) {
    super(id, context, "LanguageCodeDelete");
    LCDeleteIn = LCDeleteInIn;
  }

  public void translateToMap() {
    if (LCDeleteIn != null) {
      LCDeleteIn.resetFlags(true, true);
      addInput("LanguageCode", LCObjectKeyHelper.toMap(LCDeleteIn, new HashMap(), "LCObjectKeyData").get("LCObjectKeyData"));
    }
  }


/**
 *
 * Sets the LanguageCode
 * @param LCDeleteInIn Value of the LCDeleteIn
 *
 */

  public void setLanguageCode(LCObjectKeyData LCDeleteInIn) {
    LCDeleteIn = LCDeleteInIn;
  }

  public void translateFromMap() {
    LCDeleteIn = LCObjectKeyHelper.fromMap(inputMap, "LanguageCode");
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public LCObjectKeyData getLanguageCode( ) {
    return LCDeleteIn;
  }

}
