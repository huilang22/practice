/*
 * Generated code DO NOT EDIT
 * Generated file: InvsFieldMasterGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsFieldMasterGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsFieldMasterGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsFieldMasterObjectKeyData IFMGetIn;
/**
 *
 * Constructor to create a  InvsFieldMasterGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsFieldMasterGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsFieldMasterObjectKeyData IFMGetInIn) {
    super(id, context, "InvsFieldMasterGet");
    IFMGetIn = IFMGetInIn;
  }

  public void translateToMap() {
    if (IFMGetIn != null) {
      IFMGetIn.resetFlags(true, true);
      addInput("InvsFieldMaster", InvsFieldMasterObjectKeyHelper.toMap(IFMGetIn, new HashMap(), "InvsFieldMasterObjectKeyData").get("InvsFieldMasterObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsFieldMaster
 * @param IFMGetInIn Value of the IFMGetIn
 *
 */

  public void setInvsFieldMaster(InvsFieldMasterObjectKeyData IFMGetInIn) {
    IFMGetIn = IFMGetInIn;
  }

  public void translateFromMap() {
    IFMGetIn = InvsFieldMasterObjectKeyHelper.fromMap(inputMap, "InvsFieldMaster");
  }

/**
 *
 * Gets the InvsFieldMaster
 * @return Value of the InvsFieldMaster
 *
 */

  public InvsFieldMasterObjectKeyData getInvsFieldMaster( ) {
    return IFMGetIn;
  }

}
