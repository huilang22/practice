/*
 * Generated code DO NOT EDIT
 * Generated file: BillFmtOptFormatsFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a BillFmtOptFormatsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillFmtOptFormatsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillFmtOptFormatsObjectFilter BillFmtOptFormatsFindIn;
/**
 *
 * Constructor to create a  BillFmtOptFormatsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillFmtOptFormatsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BillFmtOptFormatsObjectFilter BillFmtOptFormatsFindInIn) {
    super(id, context, "BillFmtOptFormatsFind");
    BillFmtOptFormatsFindIn = BillFmtOptFormatsFindInIn;
  }

  public void translateToMap() {
    if (BillFmtOptFormatsFindIn != null) {
      Integer index =  BillFmtOptFormatsFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(BillFmtOptFormatsFindIn, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }


/**
 *
 * Sets the BillFmtOptFormats
 * @param BillFmtOptFormatsFindInIn Value of the BillFmtOptFormatsFindIn
 *
 */

  public void setBillFmtOptFormats(BillFmtOptFormatsObjectFilter BillFmtOptFormatsFindInIn) {
    BillFmtOptFormatsFindIn = BillFmtOptFormatsFindInIn;
  }

  public void translateFromMap() {
    BillFmtOptFormatsFindIn = BillFmtOptFormatsObjectHelper.fromMapFilter(inputMap, "BillFmtOptFormats");
  }

/**
 *
 * Gets the BillFmtOptFormats
 * @return Value of the BillFmtOptFormats
 *
 */

  public BillFmtOptFormatsObjectFilter getBillFmtOptFormats( ) {
    return BillFmtOptFormatsFindIn;
  }

}
