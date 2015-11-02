/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDisplayFormatUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ChargeDisplayFormatUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ChargeDisplayFormatUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ChargeDisplayFormatObjectData ChargeDisplayFormatUpdateIn;
/**
 *
 * Constructor to create a  ChargeDisplayFormatUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ChargeDisplayFormatUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeDisplayFormatObjectData ChargeDisplayFormatUpdateInIn) {
    super(id, context, "ChargeDisplayFormatUpdate");
    ChargeDisplayFormatUpdateIn = ChargeDisplayFormatUpdateInIn;
  }

  public void translateToMap() {
    if (ChargeDisplayFormatUpdateIn != null) {
      ChargeDisplayFormatUpdateIn.resetFlags(true, true);
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectHelper.toMap(ChargeDisplayFormatUpdateIn, new HashMap(), "ChargeDisplayFormat").get("ChargeDisplayFormat"));
    }
  }


/**
 *
 * Sets the ChargeDisplayFormat
 * @param ChargeDisplayFormatUpdateInIn Value of the ChargeDisplayFormatUpdateIn
 *
 */

  public void setChargeDisplayFormat(ChargeDisplayFormatObjectData ChargeDisplayFormatUpdateInIn) {
    ChargeDisplayFormatUpdateIn = ChargeDisplayFormatUpdateInIn;
  }

  public void translateFromMap() {
    ChargeDisplayFormatUpdateIn = ChargeDisplayFormatObjectHelper.fromMap(inputMap, "ChargeDisplayFormat");
  }

/**
 *
 * Gets the ChargeDisplayFormat
 * @return Value of the ChargeDisplayFormat
 *
 */

  public ChargeDisplayFormatObjectData getChargeDisplayFormat( ) {
    return ChargeDisplayFormatUpdateIn;
  }

}
