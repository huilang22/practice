/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsCountryCodeGetBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsCountryCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsCountryCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsCountryCodeObjectKeyData InvsCountryCodeGetIn;
/**
 *
 * Constructor to create a  InvsCountryCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsCountryCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsCountryCodeObjectKeyData InvsCountryCodeGetInIn) {
    super(id, context, "InvsCountryCodeGet");
    InvsCountryCodeGetIn = InvsCountryCodeGetInIn;
  }

  public void translateToMap() {
    if (InvsCountryCodeGetIn != null) {
      InvsCountryCodeGetIn.resetFlags(true, true);
      addInput("InvsCountryCode", InvsCountryCodeObjectKeyHelper.toMap(InvsCountryCodeGetIn, new HashMap(), "InvsCountryCodeObjectKeyData").get("InvsCountryCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsCountryCode
 * @param InvsCountryCodeGetInIn Value of the InvsCountryCodeGetIn
 *
 */

  public void setInvsCountryCode(InvsCountryCodeObjectKeyData InvsCountryCodeGetInIn) {
    InvsCountryCodeGetIn = InvsCountryCodeGetInIn;
  }

  public void translateFromMap() {
    InvsCountryCodeGetIn = InvsCountryCodeObjectKeyHelper.fromMap(inputMap, "InvsCountryCode");
  }

/**
 *
 * Gets the InvsCountryCode
 * @return Value of the InvsCountryCode
 *
 */

  public InvsCountryCodeObjectKeyData getInvsCountryCode( ) {
    return InvsCountryCodeGetIn;
  }

}
