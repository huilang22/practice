/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BamErrorCodeCreateBulkUdtTemplateItem.java
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
 * Class used to create a BamErrorCodeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BamErrorCodeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BECObjectData BECCreateIn;
/**
 *
 * Constructor to create a  BamErrorCodeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BamErrorCodeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BECObjectData BECCreateInIn) {
    super(id, context, "BamErrorCodeCreate");
    BECCreateIn = BECCreateInIn;
  }

  public void translateToMap() {
    if (BECCreateIn != null) {
      BECCreateIn.resetFlags(true, true);
      addInput("BamErrorCode", BECObjectHelper.toMap(BECCreateIn, new HashMap(), "BamErrorCode").get("BamErrorCode"));
    }
  }


/**
 *
 * Sets the BamErrorCode
 * @param BECCreateInIn Value of the BECCreateIn
 *
 */

  public void setBamErrorCode(BECObjectData BECCreateInIn) {
    BECCreateIn = BECCreateInIn;
  }

  public void translateFromMap() {
    BECCreateIn = BECObjectHelper.fromMap(inputMap, "BamErrorCode");
  }

/**
 *
 * Gets the BamErrorCode
 * @return Value of the BamErrorCode
 *
 */

  public BECObjectData getBamErrorCode( ) {
    return BECCreateIn;
  }

}
