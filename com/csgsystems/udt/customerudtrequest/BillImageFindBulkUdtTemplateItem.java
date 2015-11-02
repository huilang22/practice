/*
 * Generated code DO NOT EDIT
 * Generated file: BillImageFindBulkUdtTemplateItem.java
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
 * Class used to create a BillImageFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillImageFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillImageObjectFilter bill_imageFindIn;
/**
 *
 * Constructor to create a  BillImageFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillImageFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BillImageObjectFilter bill_imageFindInIn) {
    super(id, context, "BillImageFind");
    bill_imageFindIn = bill_imageFindInIn;
  }

  public void translateToMap() {
    if (bill_imageFindIn != null) {
      Integer index =  bill_imageFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillImage", BillImageObjectHelper.toMap(bill_imageFindIn, new HashMap(), "BillImage").get("BillImage"));
    }
  }


/**
 *
 * Sets the BillImage
 * @param bill_imageFindInIn Value of the bill_imageFindIn
 *
 */

  public void setBillImage(BillImageObjectFilter bill_imageFindInIn) {
    bill_imageFindIn = bill_imageFindInIn;
  }

  public void translateFromMap() {
    bill_imageFindIn = BillImageObjectHelper.fromMapFilter(inputMap, "BillImage");
  }

/**
 *
 * Gets the BillImage
 * @return Value of the BillImage
 *
 */

  public BillImageObjectFilter getBillImage( ) {
    return bill_imageFindIn;
  }

}
