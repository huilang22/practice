/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a BillFmtOptFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillFmtOptFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BllFmtOptObjectFilter BllFmtOptFindIn;
/**
 *
 * Constructor to create a  BillFmtOptFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillFmtOptFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BllFmtOptObjectFilter BllFmtOptFindInIn) {
    super(id, context, "BillFmtOptFind");
    BllFmtOptFindIn = BllFmtOptFindInIn;
  }

  public void translateToMap() {
    if (BllFmtOptFindIn != null) {
      Integer index =  BllFmtOptFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillFmtOpt", BllFmtOptObjectHelper.toMap(BllFmtOptFindIn, new HashMap(), "BillFmtOpt").get("BillFmtOpt"));
    }
  }


/**
 *
 * Sets the BillFmtOpt
 * @param BllFmtOptFindInIn Value of the BllFmtOptFindIn
 *
 */

  public void setBillFmtOpt(BllFmtOptObjectFilter BllFmtOptFindInIn) {
    BllFmtOptFindIn = BllFmtOptFindInIn;
  }

  public void translateFromMap() {
    BllFmtOptFindIn = BllFmtOptObjectHelper.fromMapFilter(inputMap, "BillFmtOpt");
  }

/**
 *
 * Gets the BillFmtOpt
 * @return Value of the BillFmtOpt
 *
 */

  public BllFmtOptObjectFilter getBillFmtOpt( ) {
    return BllFmtOptFindIn;
  }

}
