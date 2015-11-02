/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeCreateBulkUdtTemplateItem.java
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
 * Class used to create a LanguageCodeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class LanguageCodeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LCObjectData LCCreateIn;
/**
 *
 * Constructor to create a  LanguageCodeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LanguageCodeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, LCObjectData LCCreateInIn) {
    super(id, context, "LanguageCodeCreate");
    LCCreateIn = LCCreateInIn;
  }

  public void translateToMap() {
    if (LCCreateIn != null) {
      LCCreateIn.resetFlags(true, true);
      addInput("LanguageCode", LCObjectHelper.toMap(LCCreateIn, new HashMap(), "LanguageCode").get("LanguageCode"));
    }
  }


/**
 *
 * Sets the LanguageCode
 * @param LCCreateInIn Value of the LCCreateIn
 *
 */

  public void setLanguageCode(LCObjectData LCCreateInIn) {
    LCCreateIn = LCCreateInIn;
  }

  public void translateFromMap() {
    LCCreateIn = LCObjectHelper.fromMap(inputMap, "LanguageCode");
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public LCObjectData getLanguageCode( ) {
    return LCCreateIn;
  }

}
