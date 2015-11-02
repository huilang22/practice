/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * IndustryTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a IndustryTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class IndustryTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected IndustryTypeObjectKeyData ITGetIn;
/**
 *
 * Constructor to create a  IndustryTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public IndustryTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, IndustryTypeObjectKeyData ITGetInIn) {
    super(id, context, "IndustryTypeGet");
    ITGetIn = ITGetInIn;
  }

  public void translateToMap() {
    if (ITGetIn != null) {
      ITGetIn.resetFlags(true, true);
      addInput("IndustryType", IndustryTypeObjectKeyHelper.toMap(ITGetIn, new HashMap(), "IndustryTypeObjectKeyData").get("IndustryTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the IndustryType
 * @param ITGetInIn Value of the ITGetIn
 *
 */

  public void setIndustryType(IndustryTypeObjectKeyData ITGetInIn) {
    ITGetIn = ITGetInIn;
  }

  public void translateFromMap() {
    ITGetIn = IndustryTypeObjectKeyHelper.fromMap(inputMap, "IndustryType");
  }

/**
 *
 * Gets the IndustryType
 * @return Value of the IndustryType
 *
 */

  public IndustryTypeObjectKeyData getIndustryType( ) {
    return ITGetIn;
  }

}
