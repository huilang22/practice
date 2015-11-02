/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtCurrencyCodeMapGetBulkUdtTemplateItem.java
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
 * Class used to create a AxrtCurrencyCodeMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AxrtCurrencyCodeMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AxrtCurrencyCodeMapObjectKeyData AxrtIsoCurrCodeMapIn;
/**
 *
 * Constructor to create a  AxrtCurrencyCodeMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AxrtCurrencyCodeMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtCurrencyCodeMapObjectKeyData AxrtIsoCurrCodeMapInIn) {
    super(id, context, "AxrtCurrencyCodeMapGet");
    AxrtIsoCurrCodeMapIn = AxrtIsoCurrCodeMapInIn;
  }

  public void translateToMap() {
    if (AxrtIsoCurrCodeMapIn != null) {
      AxrtIsoCurrCodeMapIn.resetFlags(true, true);
      addInput("AxrtCurrencyCodeMap", AxrtCurrencyCodeMapObjectKeyHelper.toMap(AxrtIsoCurrCodeMapIn, new HashMap(), "AxrtCurrencyCodeMapObjectKeyData").get("AxrtCurrencyCodeMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the AxrtCurrencyCodeMap
 * @param AxrtIsoCurrCodeMapInIn Value of the AxrtIsoCurrCodeMapIn
 *
 */

  public void setAxrtCurrencyCodeMap(AxrtCurrencyCodeMapObjectKeyData AxrtIsoCurrCodeMapInIn) {
    AxrtIsoCurrCodeMapIn = AxrtIsoCurrCodeMapInIn;
  }

  public void translateFromMap() {
    AxrtIsoCurrCodeMapIn = AxrtCurrencyCodeMapObjectKeyHelper.fromMap(inputMap, "AxrtCurrencyCodeMap");
  }

/**
 *
 * Gets the AxrtCurrencyCodeMap
 * @return Value of the AxrtCurrencyCodeMap
 *
 */

  public AxrtCurrencyCodeMapObjectKeyData getAxrtCurrencyCodeMap( ) {
    return AxrtIsoCurrCodeMapIn;
  }

}
