/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BamErrorCodeGetBulkUdtTemplateItem.java
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
 * Class used to create a BamErrorCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BamErrorCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BECObjectKeyData BECGetIn;
/**
 *
 * Constructor to create a  BamErrorCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BamErrorCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BECObjectKeyData BECGetInIn) {
    super(id, context, "BamErrorCodeGet");
    BECGetIn = BECGetInIn;
  }

  public void translateToMap() {
    if (BECGetIn != null) {
      BECGetIn.resetFlags(true, true);
      addInput("BamErrorCode", BECObjectKeyHelper.toMap(BECGetIn, new HashMap(), "BECObjectKeyData").get("BECObjectKeyData"));
    }
  }


/**
 *
 * Sets the BamErrorCode
 * @param BECGetInIn Value of the BECGetIn
 *
 */

  public void setBamErrorCode(BECObjectKeyData BECGetInIn) {
    BECGetIn = BECGetInIn;
  }

  public void translateFromMap() {
    BECGetIn = BECObjectKeyHelper.fromMap(inputMap, "BamErrorCode");
  }

/**
 *
 * Gets the BamErrorCode
 * @return Value of the BamErrorCode
 *
 */

  public BECObjectKeyData getBamErrorCode( ) {
    return BECGetIn;
  }

}
