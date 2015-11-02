/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxTypeCommGetBulkUdtTemplateItem.java
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
 * Class used to create a TaxTypeCommGetBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxTypeCommGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TTCObjectKeyData TTCGetIn;
/**
 *
 * Constructor to create a  TaxTypeCommGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxTypeCommGetBulkUdtTemplateItem(String id, BSDMSessionContext context, TTCObjectKeyData TTCGetInIn) {
    super(id, context, "TaxTypeCommGet");
    TTCGetIn = TTCGetInIn;
  }

  public void translateToMap() {
    if (TTCGetIn != null) {
      TTCGetIn.resetFlags(true, true);
      addInput("TaxTypeComm", TTCObjectKeyHelper.toMap(TTCGetIn, new HashMap(), "TTCObjectKeyData").get("TTCObjectKeyData"));
    }
  }


/**
 *
 * Sets the TaxTypeComm
 * @param TTCGetInIn Value of the TTCGetIn
 *
 */

  public void setTaxTypeComm(TTCObjectKeyData TTCGetInIn) {
    TTCGetIn = TTCGetInIn;
  }

  public void translateFromMap() {
    TTCGetIn = TTCObjectKeyHelper.fromMap(inputMap, "TaxTypeComm");
  }

/**
 *
 * Gets the TaxTypeComm
 * @return Value of the TaxTypeComm
 *
 */

  public TTCObjectKeyData getTaxTypeComm( ) {
    return TTCGetIn;
  }

}
