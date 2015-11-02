/*
 * Generated code DO NOT EDIT
 * Generated file: BamErrorCodeUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a BamErrorCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BamErrorCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BECObjectData BECUpdateIn;
/**
 *
 * Constructor to create a  BamErrorCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BamErrorCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BECObjectData BECUpdateInIn) {
    super(id, context, "BamErrorCodeUpdate");
    BECUpdateIn = BECUpdateInIn;
  }

  public void translateToMap() {
    if (BECUpdateIn != null) {
      BECUpdateIn.resetFlags(true, true);
      addInput("BamErrorCode", BECObjectHelper.toMap(BECUpdateIn, new HashMap(), "BamErrorCode").get("BamErrorCode"));
    }
  }


/**
 *
 * Sets the BamErrorCode
 * @param BECUpdateInIn Value of the BECUpdateIn
 *
 */

  public void setBamErrorCode(BECObjectData BECUpdateInIn) {
    BECUpdateIn = BECUpdateInIn;
  }

  public void translateFromMap() {
    BECUpdateIn = BECObjectHelper.fromMap(inputMap, "BamErrorCode");
  }

/**
 *
 * Gets the BamErrorCode
 * @return Value of the BamErrorCode
 *
 */

  public BECObjectData getBamErrorCode( ) {
    return BECUpdateIn;
  }

}
