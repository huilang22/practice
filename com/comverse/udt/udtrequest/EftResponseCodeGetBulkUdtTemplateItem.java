/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a EftResponseCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EftResponseCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EftResponseCodeObjectKeyData ERCGetIn;
/**
 *
 * Constructor to create a  EftResponseCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EftResponseCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EftResponseCodeObjectKeyData ERCGetInIn) {
    super(id, context, "EftResponseCodeGet");
    ERCGetIn = ERCGetInIn;
  }

  public void translateToMap() {
    if (ERCGetIn != null) {
      ERCGetIn.resetFlags(true, true);
      addInput("EftResponseCode", EftResponseCodeObjectKeyHelper.toMap(ERCGetIn, new HashMap(), "EftResponseCodeObjectKeyData").get("EftResponseCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the EftResponseCode
 * @param ERCGetInIn Value of the ERCGetIn
 *
 */

  public void setEftResponseCode(EftResponseCodeObjectKeyData ERCGetInIn) {
    ERCGetIn = ERCGetInIn;
  }

  public void translateFromMap() {
    ERCGetIn = EftResponseCodeObjectKeyHelper.fromMap(inputMap, "EftResponseCode");
  }

/**
 *
 * Gets the EftResponseCode
 * @return Value of the EftResponseCode
 *
 */

  public EftResponseCodeObjectKeyData getEftResponseCode( ) {
    return ERCGetIn;
  }

}
