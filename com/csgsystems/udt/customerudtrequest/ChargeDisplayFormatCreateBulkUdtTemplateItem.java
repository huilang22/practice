/*
 * Generated code DO NOT EDIT
 * Generated file: ChargeDisplayFormatCreateBulkUdtTemplateItem.java
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
 * Class used to create a ChargeDisplayFormatCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ChargeDisplayFormatCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ChargeDisplayFormatObjectData ChargeDisplayFormatCreateIn;
/**
 *
 * Constructor to create a  ChargeDisplayFormatCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ChargeDisplayFormatCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeDisplayFormatObjectData ChargeDisplayFormatCreateInIn) {
    super(id, context, "ChargeDisplayFormatCreate");
    ChargeDisplayFormatCreateIn = ChargeDisplayFormatCreateInIn;
  }

  public void translateToMap() {
    if (ChargeDisplayFormatCreateIn != null) {
      ChargeDisplayFormatCreateIn.resetFlags(true, true);
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectHelper.toMap(ChargeDisplayFormatCreateIn, new HashMap(), "ChargeDisplayFormat").get("ChargeDisplayFormat"));
    }
  }


/**
 *
 * Sets the ChargeDisplayFormat
 * @param ChargeDisplayFormatCreateInIn Value of the ChargeDisplayFormatCreateIn
 *
 */

  public void setChargeDisplayFormat(ChargeDisplayFormatObjectData ChargeDisplayFormatCreateInIn) {
    ChargeDisplayFormatCreateIn = ChargeDisplayFormatCreateInIn;
  }

  public void translateFromMap() {
    ChargeDisplayFormatCreateIn = ChargeDisplayFormatObjectHelper.fromMap(inputMap, "ChargeDisplayFormat");
  }

/**
 *
 * Gets the ChargeDisplayFormat
 * @return Value of the ChargeDisplayFormat
 *
 */

  public ChargeDisplayFormatObjectData getChargeDisplayFormat( ) {
    return ChargeDisplayFormatCreateIn;
  }

}
