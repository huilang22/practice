/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainExtendedDataFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvdMainExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainObjectKeyData EDFindIn;
/**
 *
 * Constructor to create a  InvdMainExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainObjectKeyData EDFindInIn) {
    super(id, context, "InvdMainExtendedDataFind");
    EDFindIn = EDFindInIn;
  }

  public void translateToMap() {
    if (EDFindIn != null) {
      EDFindIn.resetFlags(true, true);
      addInput("InvdMain", InvdMainObjectKeyHelper.toMap(EDFindIn, new HashMap(), "InvdMainObjectKeyData").get("InvdMainObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvdMain
 * @param EDFindInIn Value of the EDFindIn
 *
 */

  public void setInvdMain(InvdMainObjectKeyData EDFindInIn) {
    EDFindIn = EDFindInIn;
  }

  public void translateFromMap() {
    EDFindIn = InvdMainObjectKeyHelper.fromMap(inputMap, "InvdMain");
  }

/**
 *
 * Gets the InvdMain
 * @return Value of the InvdMain
 *
 */

  public InvdMainObjectKeyData getInvdMain( ) {
    return EDFindIn;
  }

}
