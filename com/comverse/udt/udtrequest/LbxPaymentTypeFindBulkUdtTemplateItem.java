/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LbxPaymentTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a LbxPaymentTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class LbxPaymentTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LbxPaymentTypeObjectFilter LSFindIn;
/**
 *
 * Constructor to create a  LbxPaymentTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LbxPaymentTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, LbxPaymentTypeObjectFilter LSFindInIn) {
    super(id, context, "LbxPaymentTypeFind");
    LSFindIn = LSFindInIn;
  }

  public void translateToMap() {
    if (LSFindIn != null) {
      Integer index =  LSFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LbxPaymentType", LbxPaymentTypeObjectHelper.toMap(LSFindIn, new HashMap(), "LbxPaymentType").get("LbxPaymentType"));
    }
  }


/**
 *
 * Sets the LbxPaymentType
 * @param LSFindInIn Value of the LSFindIn
 *
 */

  public void setLbxPaymentType(LbxPaymentTypeObjectFilter LSFindInIn) {
    LSFindIn = LSFindInIn;
  }

  public void translateFromMap() {
    LSFindIn = LbxPaymentTypeObjectHelper.fromMapFilter(inputMap, "LbxPaymentType");
  }

/**
 *
 * Gets the LbxPaymentType
 * @return Value of the LbxPaymentType
 *
 */

  public LbxPaymentTypeObjectFilter getLbxPaymentType( ) {
    return LSFindIn;
  }

}
