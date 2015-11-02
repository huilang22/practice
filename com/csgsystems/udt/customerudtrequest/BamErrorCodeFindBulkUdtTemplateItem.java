/*
 * Generated code DO NOT EDIT
 * Generated file: BamErrorCodeFindBulkUdtTemplateItem.java
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
 * Class used to create a BamErrorCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BamErrorCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BECObjectFilter BECFindIn;
/**
 *
 * Constructor to create a  BamErrorCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BamErrorCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BECObjectFilter BECFindInIn) {
    super(id, context, "BamErrorCodeFind");
    BECFindIn = BECFindInIn;
  }

  public void translateToMap() {
    if (BECFindIn != null) {
      Integer index =  BECFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BamErrorCode", BECObjectHelper.toMap(BECFindIn, new HashMap(), "BamErrorCode").get("BamErrorCode"));
    }
  }


/**
 *
 * Sets the BamErrorCode
 * @param BECFindInIn Value of the BECFindIn
 *
 */

  public void setBamErrorCode(BECObjectFilter BECFindInIn) {
    BECFindIn = BECFindInIn;
  }

  public void translateFromMap() {
    BECFindIn = BECObjectHelper.fromMapFilter(inputMap, "BamErrorCode");
  }

/**
 *
 * Gets the BamErrorCode
 * @return Value of the BamErrorCode
 *
 */

  public BECObjectFilter getBamErrorCode( ) {
    return BECFindIn;
  }

}
