/*
 * Generated code DO NOT EDIT
 * Generated file: ChargeDisplayFormatFindBulkUdtTemplateItem.java
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
 * Class used to create a ChargeDisplayFormatFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ChargeDisplayFormatFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ChargeDisplayFormatObjectFilter ChargeDisplayFormatFindIn;
/**
 *
 * Constructor to create a  ChargeDisplayFormatFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ChargeDisplayFormatFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeDisplayFormatObjectFilter ChargeDisplayFormatFindInIn) {
    super(id, context, "ChargeDisplayFormatFind");
    ChargeDisplayFormatFindIn = ChargeDisplayFormatFindInIn;
  }

  public void translateToMap() {
    if (ChargeDisplayFormatFindIn != null) {
      Integer index =  ChargeDisplayFormatFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectHelper.toMap(ChargeDisplayFormatFindIn, new HashMap(), "ChargeDisplayFormat").get("ChargeDisplayFormat"));
    }
  }


/**
 *
 * Sets the ChargeDisplayFormat
 * @param ChargeDisplayFormatFindInIn Value of the ChargeDisplayFormatFindIn
 *
 */

  public void setChargeDisplayFormat(ChargeDisplayFormatObjectFilter ChargeDisplayFormatFindInIn) {
    ChargeDisplayFormatFindIn = ChargeDisplayFormatFindInIn;
  }

  public void translateFromMap() {
    ChargeDisplayFormatFindIn = ChargeDisplayFormatObjectHelper.fromMapFilter(inputMap, "ChargeDisplayFormat");
  }

/**
 *
 * Gets the ChargeDisplayFormat
 * @return Value of the ChargeDisplayFormat
 *
 */

  public ChargeDisplayFormatObjectFilter getChargeDisplayFormat( ) {
    return ChargeDisplayFormatFindIn;
  }

}
