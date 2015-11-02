/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataGetBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcOfferExtendedDataGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferExtendedDataGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferExtendedDataObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcOfferExtendedDataGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferExtendedDataGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferExtendedDataObjectKeyData GetInIn) {
    super(id, context, "CtcOfferExtendedDataGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcOfferExtendedDataObjectKeyData").get("CtcOfferExtendedDataObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOfferExtendedData
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcOfferExtendedData(CtcOfferExtendedDataObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcOfferExtendedDataObjectKeyHelper.fromMap(inputMap, "CtcOfferExtendedData");
  }

/**
 *
 * Gets the CtcOfferExtendedData
 * @return Value of the CtcOfferExtendedData
 *
 */

  public CtcOfferExtendedDataObjectKeyData getCtcOfferExtendedData( ) {
    return GetIn;
  }

}
