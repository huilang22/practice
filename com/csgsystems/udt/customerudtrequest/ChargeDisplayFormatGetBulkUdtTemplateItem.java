/*
 * Generated code DO NOT EDIT
 * Generated file: ChargeDisplayFormatGetBulkUdtTemplateItem.java
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
 * Class used to create a ChargeDisplayFormatGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ChargeDisplayFormatGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ChargeDisplayFormatObjectKeyData ChargeDisplayFormatGetIn;
/**
 *
 * Constructor to create a  ChargeDisplayFormatGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ChargeDisplayFormatGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeDisplayFormatObjectKeyData ChargeDisplayFormatGetInIn) {
    super(id, context, "ChargeDisplayFormatGet");
    ChargeDisplayFormatGetIn = ChargeDisplayFormatGetInIn;
  }

  public void translateToMap() {
    if (ChargeDisplayFormatGetIn != null) {
      ChargeDisplayFormatGetIn.resetFlags(true, true);
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectKeyHelper.toMap(ChargeDisplayFormatGetIn, new HashMap(), "ChargeDisplayFormatObjectKeyData").get("ChargeDisplayFormatObjectKeyData"));
    }
  }


/**
 *
 * Sets the ChargeDisplayFormat
 * @param ChargeDisplayFormatGetInIn Value of the ChargeDisplayFormatGetIn
 *
 */

  public void setChargeDisplayFormat(ChargeDisplayFormatObjectKeyData ChargeDisplayFormatGetInIn) {
    ChargeDisplayFormatGetIn = ChargeDisplayFormatGetInIn;
  }

  public void translateFromMap() {
    ChargeDisplayFormatGetIn = ChargeDisplayFormatObjectKeyHelper.fromMap(inputMap, "ChargeDisplayFormat");
  }

/**
 *
 * Gets the ChargeDisplayFormat
 * @return Value of the ChargeDisplayFormat
 *
 */

  public ChargeDisplayFormatObjectKeyData getChargeDisplayFormat( ) {
    return ChargeDisplayFormatGetIn;
  }

}
