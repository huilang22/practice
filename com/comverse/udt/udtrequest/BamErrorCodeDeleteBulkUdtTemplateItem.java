/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BamErrorCodeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BamErrorCodeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BamErrorCodeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BECObjectKeyData BECDeleteIn;
/**
 *
 * Constructor to create a  BamErrorCodeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BamErrorCodeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BECObjectKeyData BECDeleteInIn) {
    super(id, context, "BamErrorCodeDelete");
    BECDeleteIn = BECDeleteInIn;
  }

  public void translateToMap() {
    if (BECDeleteIn != null) {
      BECDeleteIn.resetFlags(true, true);
      addInput("BamErrorCode", BECObjectKeyHelper.toMap(BECDeleteIn, new HashMap(), "BECObjectKeyData").get("BECObjectKeyData"));
    }
  }


/**
 *
 * Sets the BamErrorCode
 * @param BECDeleteInIn Value of the BECDeleteIn
 *
 */

  public void setBamErrorCode(BECObjectKeyData BECDeleteInIn) {
    BECDeleteIn = BECDeleteInIn;
  }

  public void translateFromMap() {
    BECDeleteIn = BECObjectKeyHelper.fromMap(inputMap, "BamErrorCode");
  }

/**
 *
 * Gets the BamErrorCode
 * @return Value of the BamErrorCode
 *
 */

  public BECObjectKeyData getBamErrorCode( ) {
    return BECDeleteIn;
  }

}
